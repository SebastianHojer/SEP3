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
    comments = "Source: user.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "lager.User";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.UserCreationRequest,
      lager.UserCreationResponse> METHOD_CREATE_USER =
      io.grpc.MethodDescriptor.<lager.UserCreationRequest, lager.UserCreationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.User", "createUser"))
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
              "lager.User", "usernameExists"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UsernameExistsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UsernameExistsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.UsernameRetrievalRequest,
      lager.UsernameRetrievalResponse> METHOD_RETRIEVE_USERS =
      io.grpc.MethodDescriptor.<lager.UsernameRetrievalRequest, lager.UsernameRetrievalResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.User", "retrieveUsers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UsernameRetrievalRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UsernameRetrievalResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.DeleteUserRequest,
      lager.DeleteUserResponse> METHOD_DELETE_USER =
      io.grpc.MethodDescriptor.<lager.DeleteUserRequest, lager.DeleteUserResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.User", "deleteUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.DeleteUserRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.DeleteUserResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.PasswordAuthenticationRequest,
      lager.PasswordAuthenticationResponse> METHOD_AUTHENTICATE_PASSWORD =
      io.grpc.MethodDescriptor.<lager.PasswordAuthenticationRequest, lager.PasswordAuthenticationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.User", "authenticatePassword"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.PasswordAuthenticationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.PasswordAuthenticationResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    return new UserStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserFutureStub(channel);
  }

  /**
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

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

    /**
     */
    public void retrieveUsers(lager.UsernameRetrievalRequest request,
        io.grpc.stub.StreamObserver<lager.UsernameRetrievalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_USERS, responseObserver);
    }

    /**
     */
    public void deleteUser(lager.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<lager.DeleteUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_USER, responseObserver);
    }

    /**
     */
    public void authenticatePassword(lager.PasswordAuthenticationRequest request,
        io.grpc.stub.StreamObserver<lager.PasswordAuthenticationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTHENTICATE_PASSWORD, responseObserver);
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
          .addMethod(
            METHOD_RETRIEVE_USERS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.UsernameRetrievalRequest,
                lager.UsernameRetrievalResponse>(
                  this, METHODID_RETRIEVE_USERS)))
          .addMethod(
            METHOD_DELETE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                lager.DeleteUserRequest,
                lager.DeleteUserResponse>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            METHOD_AUTHENTICATE_PASSWORD,
            asyncUnaryCall(
              new MethodHandlers<
                lager.PasswordAuthenticationRequest,
                lager.PasswordAuthenticationResponse>(
                  this, METHODID_AUTHENTICATE_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class UserStub extends io.grpc.stub.AbstractStub<UserStub> {
    private UserStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
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

    /**
     */
    public void retrieveUsers(lager.UsernameRetrievalRequest request,
        io.grpc.stub.StreamObserver<lager.UsernameRetrievalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_USERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(lager.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<lager.DeleteUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void authenticatePassword(lager.PasswordAuthenticationRequest request,
        io.grpc.stub.StreamObserver<lager.PasswordAuthenticationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTHENTICATE_PASSWORD, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractStub<UserBlockingStub> {
    private UserBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
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

    /**
     */
    public lager.UsernameRetrievalResponse retrieveUsers(lager.UsernameRetrievalRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_USERS, getCallOptions(), request);
    }

    /**
     */
    public lager.DeleteUserResponse deleteUser(lager.DeleteUserRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_USER, getCallOptions(), request);
    }

    /**
     */
    public lager.PasswordAuthenticationResponse authenticatePassword(lager.PasswordAuthenticationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTHENTICATE_PASSWORD, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractStub<UserFutureStub> {
    private UserFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.UsernameRetrievalResponse> retrieveUsers(
        lager.UsernameRetrievalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_USERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.DeleteUserResponse> deleteUser(
        lager.DeleteUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.PasswordAuthenticationResponse> authenticatePassword(
        lager.PasswordAuthenticationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTHENTICATE_PASSWORD, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_USERNAME_EXISTS = 1;
  private static final int METHODID_RETRIEVE_USERS = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_AUTHENTICATE_PASSWORD = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
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
        case METHODID_RETRIEVE_USERS:
          serviceImpl.retrieveUsers((lager.UsernameRetrievalRequest) request,
              (io.grpc.stub.StreamObserver<lager.UsernameRetrievalResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((lager.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<lager.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_AUTHENTICATE_PASSWORD:
          serviceImpl.authenticatePassword((lager.PasswordAuthenticationRequest) request,
              (io.grpc.stub.StreamObserver<lager.PasswordAuthenticationResponse>) responseObserver);
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

  private static final class UserDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lager.UserOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserDescriptorSupplier())
              .addMethod(METHOD_CREATE_USER)
              .addMethod(METHOD_USERNAME_EXISTS)
              .addMethod(METHOD_RETRIEVE_USERS)
              .addMethod(METHOD_DELETE_USER)
              .addMethod(METHOD_AUTHENTICATE_PASSWORD)
              .build();
        }
      }
    }
    return result;
  }
}
