package helloworld;

import io.grpc.*;

import java.util.logging.Logger;

/**
 * Created by hzj on 2022/2/16 下午12:07
 */
public class GreeterClientInterceptor implements ClientInterceptor {

    private static final Logger logger = Logger.getLogger("GreeterClientInterceptor");

    Metadata.Key<String> token = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(channel.newCall(methodDescriptor, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                headers.put(token, "abc");
                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                    @Override
                    public void onHeaders(Metadata headers) {
                        /**
                         * if you don't need receive header from server,
                         * you can use {@link io.grpc.stub.MetadataUtils#attachHeaders}
                         * directly to send header
                         */
                        logger.info("header received from server: " + headers);
                        super.onHeaders(headers);
                    }
                }, headers);
            }
        };
    }
}
