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
    comments = "Source: warehouse.proto")
public final class WarehouseGrpc {

  private WarehouseGrpc() {}

  public static final String SERVICE_NAME = "lager.Warehouse";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.ProductCreationRequest,
      lager.ProductCreationResponse> METHOD_CREATE_PRODUCT =
      io.grpc.MethodDescriptor.<lager.ProductCreationRequest, lager.ProductCreationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "createProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.ProductCreationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.ProductCreationResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.DeleteProductRequest,
      lager.DeleteProductResponse> METHOD_DELETE_PRODUCT =
      io.grpc.MethodDescriptor.<lager.DeleteProductRequest, lager.DeleteProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "deleteProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.DeleteProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.DeleteProductResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.ProductExistsRequest,
      lager.ProductExistsResponse> METHOD_PRODUCT_EXISTS =
      io.grpc.MethodDescriptor.<lager.ProductExistsRequest, lager.ProductExistsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "productExists"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.ProductExistsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.ProductExistsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.RetrieveProductsRequest,
      lager.RetrieveProductsResponse> METHOD_RETRIEVE_PRODUCTS =
      io.grpc.MethodDescriptor.<lager.RetrieveProductsRequest, lager.RetrieveProductsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "retrieveProducts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveProductsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveProductsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.AddLocationRequest,
      lager.AddLocationResponse> METHOD_ADD_LOCATION =
      io.grpc.MethodDescriptor.<lager.AddLocationRequest, lager.AddLocationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "addLocation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.AddLocationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.AddLocationResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WarehouseStub newStub(io.grpc.Channel channel) {
    return new WarehouseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WarehouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WarehouseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WarehouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WarehouseFutureStub(channel);
  }

  /**
   */
  public static abstract class WarehouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduct(lager.ProductCreationRequest request,
        io.grpc.stub.StreamObserver<lager.ProductCreationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PRODUCT, responseObserver);
    }

    /**
     */
    public void deleteProduct(lager.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<lager.DeleteProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_PRODUCT, responseObserver);
    }

    /**
     */
    public void productExists(lager.ProductExistsRequest request,
        io.grpc.stub.StreamObserver<lager.ProductExistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PRODUCT_EXISTS, responseObserver);
    }

    /**
     */
    public void retrieveProducts(lager.RetrieveProductsRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveProductsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_PRODUCTS, responseObserver);
    }

    /**
     */
    public void addLocation(lager.AddLocationRequest request,
        io.grpc.stub.StreamObserver<lager.AddLocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_LOCATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                lager.ProductCreationRequest,
                lager.ProductCreationResponse>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            METHOD_DELETE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                lager.DeleteProductRequest,
                lager.DeleteProductResponse>(
                  this, METHODID_DELETE_PRODUCT)))
          .addMethod(
            METHOD_PRODUCT_EXISTS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.ProductExistsRequest,
                lager.ProductExistsResponse>(
                  this, METHODID_PRODUCT_EXISTS)))
          .addMethod(
            METHOD_RETRIEVE_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.RetrieveProductsRequest,
                lager.RetrieveProductsResponse>(
                  this, METHODID_RETRIEVE_PRODUCTS)))
          .addMethod(
            METHOD_ADD_LOCATION,
            asyncUnaryCall(
              new MethodHandlers<
                lager.AddLocationRequest,
                lager.AddLocationResponse>(
                  this, METHODID_ADD_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class WarehouseStub extends io.grpc.stub.AbstractStub<WarehouseStub> {
    private WarehouseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WarehouseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WarehouseStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(lager.ProductCreationRequest request,
        io.grpc.stub.StreamObserver<lager.ProductCreationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(lager.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<lager.DeleteProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void productExists(lager.ProductExistsRequest request,
        io.grpc.stub.StreamObserver<lager.ProductExistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PRODUCT_EXISTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveProducts(lager.RetrieveProductsRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveProductsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_PRODUCTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLocation(lager.AddLocationRequest request,
        io.grpc.stub.StreamObserver<lager.AddLocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_LOCATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WarehouseBlockingStub extends io.grpc.stub.AbstractStub<WarehouseBlockingStub> {
    private WarehouseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WarehouseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WarehouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public lager.ProductCreationResponse createProduct(lager.ProductCreationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public lager.DeleteProductResponse deleteProduct(lager.DeleteProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public lager.ProductExistsResponse productExists(lager.ProductExistsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PRODUCT_EXISTS, getCallOptions(), request);
    }

    /**
     */
    public lager.RetrieveProductsResponse retrieveProducts(lager.RetrieveProductsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_PRODUCTS, getCallOptions(), request);
    }

    /**
     */
    public lager.AddLocationResponse addLocation(lager.AddLocationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_LOCATION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WarehouseFutureStub extends io.grpc.stub.AbstractStub<WarehouseFutureStub> {
    private WarehouseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WarehouseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarehouseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WarehouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.ProductCreationResponse> createProduct(
        lager.ProductCreationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.DeleteProductResponse> deleteProduct(
        lager.DeleteProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.ProductExistsResponse> productExists(
        lager.ProductExistsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PRODUCT_EXISTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.RetrieveProductsResponse> retrieveProducts(
        lager.RetrieveProductsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_PRODUCTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.AddLocationResponse> addLocation(
        lager.AddLocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_LOCATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_DELETE_PRODUCT = 1;
  private static final int METHODID_PRODUCT_EXISTS = 2;
  private static final int METHODID_RETRIEVE_PRODUCTS = 3;
  private static final int METHODID_ADD_LOCATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WarehouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WarehouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((lager.ProductCreationRequest) request,
              (io.grpc.stub.StreamObserver<lager.ProductCreationResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((lager.DeleteProductRequest) request,
              (io.grpc.stub.StreamObserver<lager.DeleteProductResponse>) responseObserver);
          break;
        case METHODID_PRODUCT_EXISTS:
          serviceImpl.productExists((lager.ProductExistsRequest) request,
              (io.grpc.stub.StreamObserver<lager.ProductExistsResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_PRODUCTS:
          serviceImpl.retrieveProducts((lager.RetrieveProductsRequest) request,
              (io.grpc.stub.StreamObserver<lager.RetrieveProductsResponse>) responseObserver);
          break;
        case METHODID_ADD_LOCATION:
          serviceImpl.addLocation((lager.AddLocationRequest) request,
              (io.grpc.stub.StreamObserver<lager.AddLocationResponse>) responseObserver);
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

  private static final class WarehouseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lager.WarehouseOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WarehouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WarehouseDescriptorSupplier())
              .addMethod(METHOD_CREATE_PRODUCT)
              .addMethod(METHOD_DELETE_PRODUCT)
              .addMethod(METHOD_PRODUCT_EXISTS)
              .addMethod(METHOD_RETRIEVE_PRODUCTS)
              .addMethod(METHOD_ADD_LOCATION)
              .build();
        }
      }
    }
    return result;
  }
}
