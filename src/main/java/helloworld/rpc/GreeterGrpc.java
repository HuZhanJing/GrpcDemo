package helloworld.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.0)",
    comments = "Source: person.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = helloworld.rpc.HelloRequest.class,
      responseType = helloworld.rpc.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getMultiReplayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiReplay",
      requestType = helloworld.rpc.HelloRequest.class,
      responseType = helloworld.rpc.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getMultiReplayMethod() {
    io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply> getMultiReplayMethod;
    if ((getMultiReplayMethod = GreeterGrpc.getMultiReplayMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getMultiReplayMethod = GreeterGrpc.getMultiReplayMethod) == null) {
          GreeterGrpc.getMultiReplayMethod = getMultiReplayMethod =
              io.grpc.MethodDescriptor.<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiReplay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("MultiReplay"))
              .build();
        }
      }
    }
    return getMultiReplayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getMultiHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiHello",
      requestType = helloworld.rpc.HelloRequest.class,
      responseType = helloworld.rpc.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getMultiHelloMethod() {
    io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply> getMultiHelloMethod;
    if ((getMultiHelloMethod = GreeterGrpc.getMultiHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getMultiHelloMethod = GreeterGrpc.getMultiHelloMethod) == null) {
          GreeterGrpc.getMultiHelloMethod = getMultiHelloMethod =
              io.grpc.MethodDescriptor.<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("MultiHello"))
              .build();
        }
      }
    }
    return getMultiHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getMultiHelloMultiReplayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MultiHelloMultiReplay",
      requestType = helloworld.rpc.HelloRequest.class,
      responseType = helloworld.rpc.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getMultiHelloMultiReplayMethod() {
    io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply> getMultiHelloMultiReplayMethod;
    if ((getMultiHelloMultiReplayMethod = GreeterGrpc.getMultiHelloMultiReplayMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getMultiHelloMultiReplayMethod = GreeterGrpc.getMultiHelloMultiReplayMethod) == null) {
          GreeterGrpc.getMultiHelloMultiReplayMethod = getMultiHelloMultiReplayMethod =
              io.grpc.MethodDescriptor.<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MultiHelloMultiReplay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("MultiHelloMultiReplay"))
              .build();
        }
      }
    }
    return getMultiHelloMultiReplayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(helloworld.rpc.HelloRequest request,
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * 一个hello，多个replay
     * </pre>
     */
    public void multiReplay(helloworld.rpc.HelloRequest request,
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiReplayMethod(), responseObserver);
    }

    /**
     * <pre>
     * 多个hello，一个replay
     * </pre>
     */
    public io.grpc.stub.StreamObserver<helloworld.rpc.HelloRequest> multiHello(
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMultiHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * 多个hello，多个replay
     * </pre>
     */
    public io.grpc.stub.StreamObserver<helloworld.rpc.HelloRequest> multiHelloMultiReplay(
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMultiHelloMultiReplayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                helloworld.rpc.HelloRequest,
                helloworld.rpc.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getMultiReplayMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                helloworld.rpc.HelloRequest,
                helloworld.rpc.HelloReply>(
                  this, METHODID_MULTI_REPLAY)))
          .addMethod(
            getMultiHelloMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                helloworld.rpc.HelloRequest,
                helloworld.rpc.HelloReply>(
                  this, METHODID_MULTI_HELLO)))
          .addMethod(
            getMultiHelloMultiReplayMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                helloworld.rpc.HelloRequest,
                helloworld.rpc.HelloReply>(
                  this, METHODID_MULTI_HELLO_MULTI_REPLAY)))
          .build();
    }
  }

  /**
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(helloworld.rpc.HelloRequest request,
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 一个hello，多个replay
     * </pre>
     */
    public void multiReplay(helloworld.rpc.HelloRequest request,
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getMultiReplayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 多个hello，一个replay
     * </pre>
     */
    public io.grpc.stub.StreamObserver<helloworld.rpc.HelloRequest> multiHello(
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getMultiHelloMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 多个hello，多个replay
     * </pre>
     */
    public io.grpc.stub.StreamObserver<helloworld.rpc.HelloRequest> multiHelloMultiReplay(
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMultiHelloMultiReplayMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public helloworld.rpc.HelloReply sayHello(helloworld.rpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 一个hello，多个replay
     * </pre>
     */
    public java.util.Iterator<helloworld.rpc.HelloReply> multiReplay(
        helloworld.rpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getMultiReplayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<helloworld.rpc.HelloReply> sayHello(
        helloworld.rpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_MULTI_REPLAY = 1;
  private static final int METHODID_MULTI_HELLO = 2;
  private static final int METHODID_MULTI_HELLO_MULTI_REPLAY = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((helloworld.rpc.HelloRequest) request,
              (io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply>) responseObserver);
          break;
        case METHODID_MULTI_REPLAY:
          serviceImpl.multiReplay((helloworld.rpc.HelloRequest) request,
              (io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MULTI_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.multiHello(
              (io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply>) responseObserver);
        case METHODID_MULTI_HELLO_MULTI_REPLAY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.multiHelloMultiReplay(
              (io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return helloworld.rpc.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getMultiReplayMethod())
              .addMethod(getMultiHelloMethod())
              .addMethod(getMultiHelloMultiReplayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
