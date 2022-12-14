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
  public static final io.grpc.MethodDescriptor<lager.UpdateProductRequest,
      lager.UpdateProductResponse> METHOD_UPDATE_PRODUCT =
      io.grpc.MethodDescriptor.<lager.UpdateProductRequest, lager.UpdateProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "updateProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UpdateProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UpdateProductResponse.getDefaultInstance()))
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
  public static final io.grpc.MethodDescriptor<lager.RetrieveProductRequest,
      lager.RetrieveProductResponse> METHOD_RETRIEVE_PRODUCT =
      io.grpc.MethodDescriptor.<lager.RetrieveProductRequest, lager.RetrieveProductResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "retrieveProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveProductRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveProductResponse.getDefaultInstance()))
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
  public static final io.grpc.MethodDescriptor<lager.UpdateStockRequest,
      lager.UpdateStockResponse> METHOD_UPDATE_STOCK =
      io.grpc.MethodDescriptor.<lager.UpdateStockRequest, lager.UpdateStockResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "updateStock"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UpdateStockRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UpdateStockResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.UpdateStockMultipleRequest,
      lager.UpdateStockResponse> METHOD_UPDATE_STOCK_MULTIPLE =
      io.grpc.MethodDescriptor.<lager.UpdateStockMultipleRequest, lager.UpdateStockResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "updateStockMultiple"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UpdateStockMultipleRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UpdateStockResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.RetrieveAllProductsEanRequest,
      lager.RetrieveAllProductsEanResponse> METHOD_RETRIEVE_ALL_PRODUCTS_EAN =
      io.grpc.MethodDescriptor.<lager.RetrieveAllProductsEanRequest, lager.RetrieveAllProductsEanResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "retrieveAllProductsEan"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveAllProductsEanRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveAllProductsEanResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.RegisterLossRequest,
      lager.RegisterLossResponse> METHOD_REGISTER_LOSS =
      io.grpc.MethodDescriptor.<lager.RegisterLossRequest, lager.RegisterLossResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "registerLoss"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RegisterLossRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RegisterLossResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.RetrieveLossRequest,
      lager.RetrieveLossResponse> METHOD_RETRIEVE_LOSS =
      io.grpc.MethodDescriptor.<lager.RetrieveLossRequest, lager.RetrieveLossResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "retrieveLoss"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveLossRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveLossResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.RetrieveAllLossRequest,
      lager.RetrieveAllLossResponse> METHOD_RETRIEVE_ALL_LOSS =
      io.grpc.MethodDescriptor.<lager.RetrieveAllLossRequest, lager.RetrieveAllLossResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "retrieveAllLoss"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveAllLossRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.RetrieveAllLossResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.UpdateLossRequest,
      lager.UpdateLossResponse> METHOD_UPDATE_LOSS =
      io.grpc.MethodDescriptor.<lager.UpdateLossRequest, lager.UpdateLossResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "updateLoss"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UpdateLossRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.UpdateLossResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<lager.DeleteLossRequest,
      lager.DeleteLossResponse> METHOD_DELETE_LOSS =
      io.grpc.MethodDescriptor.<lager.DeleteLossRequest, lager.DeleteLossResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "lager.Warehouse", "deleteLoss"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.DeleteLossRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              lager.DeleteLossResponse.getDefaultInstance()))
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
    public void updateProduct(lager.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<lager.UpdateProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PRODUCT, responseObserver);
    }

    /**
     */
    public void productExists(lager.ProductExistsRequest request,
        io.grpc.stub.StreamObserver<lager.ProductExistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PRODUCT_EXISTS, responseObserver);
    }

    /**
     */
    public void retrieveProduct(lager.RetrieveProductRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_PRODUCT, responseObserver);
    }

    /**
     */
    public void retrieveProducts(lager.RetrieveProductsRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveProductsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_PRODUCTS, responseObserver);
    }

    /**
     */
    public void updateStock(lager.UpdateStockRequest request,
        io.grpc.stub.StreamObserver<lager.UpdateStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STOCK, responseObserver);
    }

    /**
     */
    public void updateStockMultiple(lager.UpdateStockMultipleRequest request,
        io.grpc.stub.StreamObserver<lager.UpdateStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_STOCK_MULTIPLE, responseObserver);
    }

    /**
     */
    public void retrieveAllProductsEan(lager.RetrieveAllProductsEanRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveAllProductsEanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_ALL_PRODUCTS_EAN, responseObserver);
    }

    /**
     */
    public void registerLoss(lager.RegisterLossRequest request,
        io.grpc.stub.StreamObserver<lager.RegisterLossResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_LOSS, responseObserver);
    }

    /**
     */
    public void retrieveLoss(lager.RetrieveLossRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveLossResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_LOSS, responseObserver);
    }

    /**
     */
    public void retrieveAllLoss(lager.RetrieveAllLossRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveAllLossResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_ALL_LOSS, responseObserver);
    }

    /**
     */
    public void updateLoss(lager.UpdateLossRequest request,
        io.grpc.stub.StreamObserver<lager.UpdateLossResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_LOSS, responseObserver);
    }

    /**
     */
    public void deleteLoss(lager.DeleteLossRequest request,
        io.grpc.stub.StreamObserver<lager.DeleteLossResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_LOSS, responseObserver);
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
            METHOD_UPDATE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                lager.UpdateProductRequest,
                lager.UpdateProductResponse>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            METHOD_PRODUCT_EXISTS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.ProductExistsRequest,
                lager.ProductExistsResponse>(
                  this, METHODID_PRODUCT_EXISTS)))
          .addMethod(
            METHOD_RETRIEVE_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                lager.RetrieveProductRequest,
                lager.RetrieveProductResponse>(
                  this, METHODID_RETRIEVE_PRODUCT)))
          .addMethod(
            METHOD_RETRIEVE_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.RetrieveProductsRequest,
                lager.RetrieveProductsResponse>(
                  this, METHODID_RETRIEVE_PRODUCTS)))
          .addMethod(
            METHOD_UPDATE_STOCK,
            asyncUnaryCall(
              new MethodHandlers<
                lager.UpdateStockRequest,
                lager.UpdateStockResponse>(
                  this, METHODID_UPDATE_STOCK)))
          .addMethod(
            METHOD_UPDATE_STOCK_MULTIPLE,
            asyncUnaryCall(
              new MethodHandlers<
                lager.UpdateStockMultipleRequest,
                lager.UpdateStockResponse>(
                  this, METHODID_UPDATE_STOCK_MULTIPLE)))
          .addMethod(
            METHOD_RETRIEVE_ALL_PRODUCTS_EAN,
            asyncUnaryCall(
              new MethodHandlers<
                lager.RetrieveAllProductsEanRequest,
                lager.RetrieveAllProductsEanResponse>(
                  this, METHODID_RETRIEVE_ALL_PRODUCTS_EAN)))
          .addMethod(
            METHOD_REGISTER_LOSS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.RegisterLossRequest,
                lager.RegisterLossResponse>(
                  this, METHODID_REGISTER_LOSS)))
          .addMethod(
            METHOD_RETRIEVE_LOSS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.RetrieveLossRequest,
                lager.RetrieveLossResponse>(
                  this, METHODID_RETRIEVE_LOSS)))
          .addMethod(
            METHOD_RETRIEVE_ALL_LOSS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.RetrieveAllLossRequest,
                lager.RetrieveAllLossResponse>(
                  this, METHODID_RETRIEVE_ALL_LOSS)))
          .addMethod(
            METHOD_UPDATE_LOSS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.UpdateLossRequest,
                lager.UpdateLossResponse>(
                  this, METHODID_UPDATE_LOSS)))
          .addMethod(
            METHOD_DELETE_LOSS,
            asyncUnaryCall(
              new MethodHandlers<
                lager.DeleteLossRequest,
                lager.DeleteLossResponse>(
                  this, METHODID_DELETE_LOSS)))
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
    public void updateProduct(lager.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<lager.UpdateProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request, responseObserver);
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
    public void retrieveProduct(lager.RetrieveProductRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_PRODUCT, getCallOptions()), request, responseObserver);
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
    public void updateStock(lager.UpdateStockRequest request,
        io.grpc.stub.StreamObserver<lager.UpdateStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STOCK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStockMultiple(lager.UpdateStockMultipleRequest request,
        io.grpc.stub.StreamObserver<lager.UpdateStockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STOCK_MULTIPLE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveAllProductsEan(lager.RetrieveAllProductsEanRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveAllProductsEanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_ALL_PRODUCTS_EAN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerLoss(lager.RegisterLossRequest request,
        io.grpc.stub.StreamObserver<lager.RegisterLossResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_LOSS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveLoss(lager.RetrieveLossRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveLossResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_LOSS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveAllLoss(lager.RetrieveAllLossRequest request,
        io.grpc.stub.StreamObserver<lager.RetrieveAllLossResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_ALL_LOSS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLoss(lager.UpdateLossRequest request,
        io.grpc.stub.StreamObserver<lager.UpdateLossResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_LOSS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLoss(lager.DeleteLossRequest request,
        io.grpc.stub.StreamObserver<lager.DeleteLossResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_LOSS, getCallOptions()), request, responseObserver);
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
    public lager.UpdateProductResponse updateProduct(lager.UpdateProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public lager.ProductExistsResponse productExists(lager.ProductExistsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PRODUCT_EXISTS, getCallOptions(), request);
    }

    /**
     */
    public lager.RetrieveProductResponse retrieveProduct(lager.RetrieveProductRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public lager.RetrieveProductsResponse retrieveProducts(lager.RetrieveProductsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_PRODUCTS, getCallOptions(), request);
    }

    /**
     */
    public lager.UpdateStockResponse updateStock(lager.UpdateStockRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STOCK, getCallOptions(), request);
    }

    /**
     */
    public lager.UpdateStockResponse updateStockMultiple(lager.UpdateStockMultipleRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_STOCK_MULTIPLE, getCallOptions(), request);
    }

    /**
     */
    public lager.RetrieveAllProductsEanResponse retrieveAllProductsEan(lager.RetrieveAllProductsEanRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_ALL_PRODUCTS_EAN, getCallOptions(), request);
    }

    /**
     */
    public lager.RegisterLossResponse registerLoss(lager.RegisterLossRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_LOSS, getCallOptions(), request);
    }

    /**
     */
    public lager.RetrieveLossResponse retrieveLoss(lager.RetrieveLossRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_LOSS, getCallOptions(), request);
    }

    /**
     */
    public lager.RetrieveAllLossResponse retrieveAllLoss(lager.RetrieveAllLossRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_ALL_LOSS, getCallOptions(), request);
    }

    /**
     */
    public lager.UpdateLossResponse updateLoss(lager.UpdateLossRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_LOSS, getCallOptions(), request);
    }

    /**
     */
    public lager.DeleteLossResponse deleteLoss(lager.DeleteLossRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_LOSS, getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<lager.UpdateProductResponse> updateProduct(
        lager.UpdateProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PRODUCT, getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<lager.RetrieveProductResponse> retrieveProduct(
        lager.RetrieveProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_PRODUCT, getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<lager.UpdateStockResponse> updateStock(
        lager.UpdateStockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STOCK, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.UpdateStockResponse> updateStockMultiple(
        lager.UpdateStockMultipleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_STOCK_MULTIPLE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.RetrieveAllProductsEanResponse> retrieveAllProductsEan(
        lager.RetrieveAllProductsEanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_ALL_PRODUCTS_EAN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.RegisterLossResponse> registerLoss(
        lager.RegisterLossRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_LOSS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.RetrieveLossResponse> retrieveLoss(
        lager.RetrieveLossRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_LOSS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.RetrieveAllLossResponse> retrieveAllLoss(
        lager.RetrieveAllLossRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_ALL_LOSS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.UpdateLossResponse> updateLoss(
        lager.UpdateLossRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_LOSS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lager.DeleteLossResponse> deleteLoss(
        lager.DeleteLossRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_LOSS, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_DELETE_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;
  private static final int METHODID_PRODUCT_EXISTS = 3;
  private static final int METHODID_RETRIEVE_PRODUCT = 4;
  private static final int METHODID_RETRIEVE_PRODUCTS = 5;
  private static final int METHODID_UPDATE_STOCK = 6;
  private static final int METHODID_UPDATE_STOCK_MULTIPLE = 7;
  private static final int METHODID_RETRIEVE_ALL_PRODUCTS_EAN = 8;
  private static final int METHODID_REGISTER_LOSS = 9;
  private static final int METHODID_RETRIEVE_LOSS = 10;
  private static final int METHODID_RETRIEVE_ALL_LOSS = 11;
  private static final int METHODID_UPDATE_LOSS = 12;
  private static final int METHODID_DELETE_LOSS = 13;

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
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((lager.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<lager.UpdateProductResponse>) responseObserver);
          break;
        case METHODID_PRODUCT_EXISTS:
          serviceImpl.productExists((lager.ProductExistsRequest) request,
              (io.grpc.stub.StreamObserver<lager.ProductExistsResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_PRODUCT:
          serviceImpl.retrieveProduct((lager.RetrieveProductRequest) request,
              (io.grpc.stub.StreamObserver<lager.RetrieveProductResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_PRODUCTS:
          serviceImpl.retrieveProducts((lager.RetrieveProductsRequest) request,
              (io.grpc.stub.StreamObserver<lager.RetrieveProductsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STOCK:
          serviceImpl.updateStock((lager.UpdateStockRequest) request,
              (io.grpc.stub.StreamObserver<lager.UpdateStockResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STOCK_MULTIPLE:
          serviceImpl.updateStockMultiple((lager.UpdateStockMultipleRequest) request,
              (io.grpc.stub.StreamObserver<lager.UpdateStockResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_ALL_PRODUCTS_EAN:
          serviceImpl.retrieveAllProductsEan((lager.RetrieveAllProductsEanRequest) request,
              (io.grpc.stub.StreamObserver<lager.RetrieveAllProductsEanResponse>) responseObserver);
          break;
        case METHODID_REGISTER_LOSS:
          serviceImpl.registerLoss((lager.RegisterLossRequest) request,
              (io.grpc.stub.StreamObserver<lager.RegisterLossResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_LOSS:
          serviceImpl.retrieveLoss((lager.RetrieveLossRequest) request,
              (io.grpc.stub.StreamObserver<lager.RetrieveLossResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_ALL_LOSS:
          serviceImpl.retrieveAllLoss((lager.RetrieveAllLossRequest) request,
              (io.grpc.stub.StreamObserver<lager.RetrieveAllLossResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LOSS:
          serviceImpl.updateLoss((lager.UpdateLossRequest) request,
              (io.grpc.stub.StreamObserver<lager.UpdateLossResponse>) responseObserver);
          break;
        case METHODID_DELETE_LOSS:
          serviceImpl.deleteLoss((lager.DeleteLossRequest) request,
              (io.grpc.stub.StreamObserver<lager.DeleteLossResponse>) responseObserver);
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
              .addMethod(METHOD_UPDATE_PRODUCT)
              .addMethod(METHOD_PRODUCT_EXISTS)
              .addMethod(METHOD_RETRIEVE_PRODUCT)
              .addMethod(METHOD_RETRIEVE_PRODUCTS)
              .addMethod(METHOD_UPDATE_STOCK)
              .addMethod(METHOD_UPDATE_STOCK_MULTIPLE)
              .addMethod(METHOD_RETRIEVE_ALL_PRODUCTS_EAN)
              .addMethod(METHOD_REGISTER_LOSS)
              .addMethod(METHOD_RETRIEVE_LOSS)
              .addMethod(METHOD_RETRIEVE_ALL_LOSS)
              .addMethod(METHOD_UPDATE_LOSS)
              .addMethod(METHOD_DELETE_LOSS)
              .build();
        }
      }
    }
    return result;
  }
}
