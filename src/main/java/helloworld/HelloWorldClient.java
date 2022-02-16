/*
 * Copyright 2015 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package helloworld;

import helloworld.rpc.GreeterGrpc;
import helloworld.rpc.HelloReply;
import helloworld.rpc.HelloRequest;
import helloworld.rpc.TestGGrpc;
import io.grpc.*;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a greeting from the {@link HelloWorldServer}.
 */
public class HelloWorldClient {
  private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());

  private final GreeterGrpc.GreeterBlockingStub blockingStub;
  private final GreeterGrpc.GreeterStub asyncStub;

  private final TestGGrpc.TestGBlockingStub testGBlockingStub;

  /** Construct client for accessing HelloWorld server using the existing channel. */
  public HelloWorldClient(Channel channel) {
    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
    // shut it down.

    // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
    Channel interceptorChannel = ClientInterceptors.intercept(channel, new GreeterClientInterceptor());
    blockingStub = GreeterGrpc.newBlockingStub(interceptorChannel);
    // 只传header，用下面代码即可
//    Metadata metadata = new Metadata();
//    Metadata.Key<String> token = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
//    metadata.put(token, "123");
//    blockingStub = GreeterGrpc.newBlockingStub(channel).withInterceptors(MetadataUtils.newAttachHeadersInterceptor(metadata));
    asyncStub = GreeterGrpc.newStub(interceptorChannel);

    testGBlockingStub = TestGGrpc.newBlockingStub(channel);
  }

  /** Say hello to server. */
  public void greet(String name, Integer age) {
    logger.info("Will try to greet " + name + " ...");
    HelloRequest request = HelloRequest.newBuilder().setName(name).setAge(age).build();
    HelloReply response;
    try {
      response = blockingStub.sayHello(request);
      logger.info("Greeting: " + response.getMessage());
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
    }
  }

  /** single send multi receive **/
  public void multiReplay() {
    logger.info("Will call multiReplay ...");
    HelloRequest request = HelloRequest.newBuilder().setName("xiaoming").setAge(12).build();
    try {
      Iterator<HelloReply> iterator = blockingStub.multiReplay(request);
      while (iterator.hasNext()) {
        HelloReply reply = iterator.next();
        logger.log(Level.INFO, "[multiReplay]" + reply.getMessage());
      }
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
    }
  }

  /** multi send single receive **/
  public void multiHello() {
    logger.info("Will call multiHello ...");
    StreamObserver<HelloRequest> multiRequest = asyncStub.multiHello(new StreamObserver<HelloReply>() {
      @Override
      public void onNext(HelloReply helloReply) {
        logger.log(Level.INFO, "[multiHello]" + helloReply.getMessage() + ", age: " + helloReply.getAge());
      }

      @Override
      public void onError(Throwable throwable) {

      }

      @Override
      public void onCompleted() {

      }
    });
    multiRequest.onNext(HelloRequest.newBuilder().setName("xiaoMing").setAge(12).build());
    multiRequest.onNext(HelloRequest.newBuilder().setName("xiaoHong").setAge(16).build());
    multiRequest.onCompleted();
  }

  /** multi send single receive **/
  public void multiHelloMultiReplay() {
    logger.info("Will call multiHelloMultiReplay ...");
    StreamObserver<HelloRequest> multiRequest = asyncStub.multiHelloMultiReplay(new StreamObserver<HelloReply>() {
      @Override
      public void onNext(HelloReply helloReply) {
        logger.log(Level.INFO, "[multiHelloMultiReplay]" + helloReply.getMessage() + ", age: " + helloReply.getAge());
      }

      @Override
      public void onError(Throwable throwable) {

      }

      @Override
      public void onCompleted() {

      }
    });
    multiRequest.onNext(HelloRequest.newBuilder().setName("xiaoMing").setAge(12).build());
    multiRequest.onNext(HelloRequest.newBuilder().setName("xiaoHong").setAge(16).build());
    multiRequest.onCompleted();
  }

  /** Test say hello to server. */
  public void testGHello(String name, Integer age) {
    logger.info("Will try to testG hello " + name + " ...");
    HelloRequest request = HelloRequest.newBuilder().setName(name).setAge(age).build();
    HelloReply response;
    try {
      response = testGBlockingStub.testHello(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
    }
//    logger.info("Greeting: " + response.getMessage());
  }

  /**
   * Greet server. If provided, the first element of {@code args} is the name to use in the
   * greeting. The second argument is the target server.
   */
  public static void main(String[] args) throws Exception {
    String user = "world";
    Integer age = 3;
    // Access a service running on the local machine on port 50051
    String target = "localhost:50051";

    // Create a communication channel to the server, known as a Channel. Channels are thread-safe
    // and reusable. It is common to create channels at the beginning of your application and reuse
    // them until the application shuts down.
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
        .usePlaintext()
        .build();
    try {
      HelloWorldClient client = new HelloWorldClient(channel);
      client.greet(user + 0, 0);
      client.multiReplay();
      client.multiHello();
      client.multiHelloMultiReplay();
      client.testGHello("xiao ming", 12);
      Thread.sleep(100000);
//      Long currentTime = System.currentTimeMillis();
//      logger.info(currentTime.toString());
//      for (int i = 0; i < 100000; i++) {
//        client.greet(user + i, i);
//      }
//      logger.info(String.valueOf(System.currentTimeMillis() - currentTime));
    } finally {
      // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
      // resources the channel should be shut down when it will no longer be used. If it may be used
      // again leave it running.
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
