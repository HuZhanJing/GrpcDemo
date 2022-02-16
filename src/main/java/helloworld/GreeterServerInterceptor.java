package helloworld;

import io.grpc.*;

/**
 * Created by hzj on 2022/2/16 下午12:08
 */
public class GreeterServerInterceptor implements ServerInterceptor {
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        Metadata.Key<String> tokenKey = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
        Metadata.Key<String> userIdKey = Metadata.Key.of("userId", Metadata.ASCII_STRING_MARSHALLER);
        String token = metadata.get(tokenKey);
        if (token == null) {
            serverCall.close(Status.DATA_LOSS, metadata);
        }
//        return serverCallHandler.startCall(serverCall, metadata);
        return serverCallHandler.startCall(new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(serverCall) {
            @Override
            public void sendHeaders(Metadata headers) {
                headers.put(userIdKey, "123");
                super.sendHeaders(headers);
            }
        }, metadata);
    }
}
