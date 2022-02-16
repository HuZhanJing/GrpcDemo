package helloworld.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.0)",
    comments = "Source: person.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TestGGrpc {

  private TestGGrpc() {}

  public static final String SERVICE_NAME = "TestG";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getTestHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestHello",
      requestType = helloworld.rpc.HelloRequest.class,
      responseType = helloworld.rpc.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest,
      helloworld.rpc.HelloReply> getTestHelloMethod() {
    io.grpc.MethodDescriptor<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply> getTestHelloMethod;
    if ((getTestHelloMethod = TestGGrpc.getTestHelloMethod) == null) {
      synchronized (TestGGrpc.class) {
        if ((getTestHelloMethod = TestGGrpc.getTestHelloMethod) == null) {
          TestGGrpc.getTestHelloMethod = getTestHelloMethod =
              io.grpc.MethodDescriptor.<helloworld.rpc.HelloRequest, helloworld.rpc.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  helloworld.rpc.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new TestGMethodDescriptorSupplier("TestHello"))
              .build();
        }
      }
    }
    return getTestHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestGStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestGStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestGStub>() {
        @java.lang.Override
        public TestGStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestGStub(channel, callOptions);
        }
      };
    return TestGStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestGBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestGBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestGBlockingStub>() {
        @java.lang.Override
        public TestGBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestGBlockingStub(channel, callOptions);
        }
      };
    return TestGBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestGFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestGFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestGFutureStub>() {
        @java.lang.Override
        public TestGFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestGFutureStub(channel, callOptions);
        }
      };
    return TestGFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestGImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * test
     * </pre>
     */
    public void testHello(helloworld.rpc.HelloRequest request,
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                helloworld.rpc.HelloRequest,
                helloworld.rpc.HelloReply>(
                  this, METHODID_TEST_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class TestGStub extends io.grpc.stub.AbstractAsyncStub<TestGStub> {
    private TestGStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestGStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestGStub(channel, callOptions);
    }

    /**
     * <pre>
     * test
     * </pre>
     */
    public void testHello(helloworld.rpc.HelloRequest request,
        io.grpc.stub.StreamObserver<helloworld.rpc.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestGBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestGBlockingStub> {
    private TestGBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestGBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestGBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * test
     * </pre>
     */
    public helloworld.rpc.HelloReply testHello(helloworld.rpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestGFutureStub extends io.grpc.stub.AbstractFutureStub<TestGFutureStub> {
    private TestGFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestGFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestGFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * test
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<helloworld.rpc.HelloReply> testHello(
        helloworld.rpc.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestGImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestGImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_HELLO:
          serviceImpl.testHello((helloworld.rpc.HelloRequest) request,
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestGBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestGBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return helloworld.rpc.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestG");
    }
  }

  private static final class TestGFileDescriptorSupplier
      extends TestGBaseDescriptorSupplier {
    TestGFileDescriptorSupplier() {}
  }

  private static final class TestGMethodDescriptorSupplier
      extends TestGBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestGMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestGGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestGFileDescriptorSupplier())
              .addMethod(getTestHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
