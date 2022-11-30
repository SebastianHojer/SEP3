package lager;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: lager.proto")
public final class LagerGrpc {

  private LagerGrpc() {}

  public static final String SERVICE_NAME = "lager.Lager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.UserCreationRequest,
      lager.UserCreationResponse> METHOD_CREATE_USER =
      io.grpc.MethodDescriptor.<lager.UserCreationRequest, lager.UserCreationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Lager", "createUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UserCreationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UserCreationResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.UsernameExistsRequest,
      lager.UsernameExistsResponse> METHOD_USERNAME_EXISTS =
      io.grpc.MethodDescriptor.<lager.UsernameExistsRequest, lager.UsernameExistsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Lager", "usernameExists"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UsernameExistsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UsernameExistsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LagerStub newStub(io.grpc.Channel channel) {
    return new LagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LagerFutureStub(channel);
  }

  /**
   */
  public static abstract class LagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(lager.UserCreationRequest request,
        io.grpc.stub.StreamObserver<lager.UserCreationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_USER, responseObserver);
    }

    /**
     */
    public void usernameExists(lager.UsernameExistsRequest request,
        io.grpc.stub.StreamObserver<lager.UsernameExistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_USERNAME_EXISTS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                lager.UserCreationRequest,
                lager.UserCreationResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            METHOD_USERNAME_EXISTS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.UsernameExistsRequest,
                lager.UsernameExistsResponse>(
                  this, METHODID_USERNAME_EXISTS)))
          .build();
    }
  }

  /**
   */
  public static final class LagerStub extends io.grpc.stub.AbstractStub<LagerStub> {
    private LagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LagerStub(channel, callOptions);
    }

    /**
     */
    public void createUser(lager.UserCreationRequest request,
        io.grpc.stub.StreamObserver<lager.UserCreationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void usernameExists(lager.UsernameExistsRequest request,
        io.grpc.stub.StreamObserver<lager.UsernameExistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_USERNAME_EXISTS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LagerBlockingStub extends io.grpc.stub.AbstractStub<LagerBlockingStub> {
    private LagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public lager.UserCreationResponse createUser(lager.UserCreationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_USER, getCallOptions(), request);
    }

    /**
     */
    public lager.UsernameExistsResponse usernameExists(lager.UsernameExistsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_USERNAME_EXISTS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LagerFutureStub extends io.grpc.stub.AbstractStub<LagerFutureStub> {
    private LagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.UserCreationResponse> createUser(
        lager.UserCreationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.UsernameExistsResponse> usernameExists(
        lager.UsernameExistsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_USERNAME_EXISTS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_USERNAME_EXISTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((lager.UserCreationRequest) request,
              (io.grpc.stub.StreamObserver<lager.UserCreationResponse>) responseObserver);
          break;
        case METHODID_USERNAME_EXISTS:
          serviceImpl.usernameExists((lager.UsernameExistsRequest) request,
              (io.grpc.stub.StreamObserver<lager.UsernameExistsResponse>) responseObserver);
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

  private static final class LagerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lager.LagerOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LagerDescriptorSupplier())
              .addMethod(METHOD_CREATE_USER)
              .addMethod(METHOD_USERNAME_EXISTS)
              .build();
        }
      }
    }
    return result;
  }
}
