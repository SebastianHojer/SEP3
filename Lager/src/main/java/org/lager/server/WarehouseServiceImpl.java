package org.lager.server;

import database.DatabaseMain;
import io.grpc.stub.StreamObserver;
import lager.*;

import java.util.ArrayList;


public class WarehouseServiceImpl extends WarehouseGrpc.WarehouseImplBase {

    private final DatabaseMain db = DatabaseMain.getInstance();

    @Override
    public void createProduct(ProductCreationRequest request, StreamObserver<ProductCreationResponse> responseObserver){
        boolean created = db.createProduct(request.getToCreate().getEan(), request.getToCreate().getProductName(), request.getToCreate().getStock(), request.getToCreate().getPhotoPath());
        if(request.getToCreate().getLocationCount()>0){
            for(String location : request.getToCreate().getLocationList()){
                db.addLocation(request.getToCreate().getEan(), location);
            }
        }
        ProductCreationResponse response = ProductCreationResponse.newBuilder().setCreated(created).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteProduct(DeleteProductRequest request, StreamObserver<DeleteProductResponse> responseObserver){
        boolean deleted = db.deleteProduct(request.getEan());
        DeleteProductResponse response = DeleteProductResponse.newBuilder().setDeleted(deleted).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

   @Override
    public void updateProduct(UpdateProductRequest request, StreamObserver<UpdateProductResponse> responseObserver){
        ArrayList<String> location = new ArrayList<>(
            request.getProduct().getLocationList());
        boolean updated = db.updateProduct(request.getProduct().getEan(),
            request.getProduct().getProductName(), request.getProduct().getStock(),
             location);
        UpdateProductResponse response = UpdateProductResponse.newBuilder().setUpdated(updated).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void productExists(ProductExistsRequest request, StreamObserver<ProductExistsResponse> responseObserver){
        boolean exists = db.productExists(request.getEan());
        ProductExistsResponse response = ProductExistsResponse.newBuilder().setExists(exists).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void retrieveProduct(RetrieveProductRequest request, StreamObserver<RetrieveProductResponse> responseObserver){
        Product product = db.retrieveProduct(request.getEan());
        RetrieveProductResponse response = RetrieveProductResponse.newBuilder().setProduct(product).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void retrieveProducts(RetrieveProductsRequest request, StreamObserver<RetrieveProductsResponse> responseObserver){
        ArrayList<Product> products = db.retrieveProducts();
        RetrieveProductsResponse response = RetrieveProductsResponse.newBuilder().addAllProduct(products).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateStock(UpdateStockRequest request, StreamObserver<UpdateStockResponse> responseObserver){
        boolean updated = db.updateStock(request.getUpdate().getEan(), request.getUpdate().getAmount());
        UpdateStockResponse response = UpdateStockResponse.newBuilder().setUpdated(updated).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateStockMultiple(UpdateStockMultipleRequest request, StreamObserver<UpdateStockResponse> responseObserver){
      for(UpdateStock u : request.getUpdateList()){
        db.updateStock(u.getEan(), u.getAmount());
      }
      UpdateStockResponse response = UpdateStockResponse.newBuilder().setUpdated(true).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    }
    @Override
    public void retrieveAllProductsEan(RetrieveAllProductsEanRequest request, StreamObserver<RetrieveAllProductsEanResponse> responseObserver){
        ArrayList<Long> eans = db.retrieveAllProductsEan();
        RetrieveAllProductsEanResponse response = RetrieveAllProductsEanResponse.newBuilder().addAllEan(eans).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void registerLoss(RegisterLossRequest request, StreamObserver<RegisterLossResponse> responseObserver){
        boolean registered = db.registerLoss(request.getLossMap());
        RegisterLossResponse response = RegisterLossResponse.newBuilder().setRegistered(registered).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void retrieveLoss(RetrieveLossRequest request, StreamObserver<RetrieveLossResponse> responseObserver){
        Loss loss = db.retrieveLoss(request.getCaseId());
        RetrieveLossResponse response = RetrieveLossResponse.newBuilder().setLoss(loss).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void retrieveAllLoss(RetrieveAllLossRequest request, StreamObserver<RetrieveAllLossResponse> responseObserver){
        ArrayList<Loss> losses = db.retrieveAllLoss();
        RetrieveAllLossResponse response = RetrieveAllLossResponse.newBuilder().addAllLoss(losses).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateLoss(UpdateLossRequest request, StreamObserver<UpdateLossResponse> responseObserver){
        boolean updated = db.updateLoss(request.getLoss());
        UpdateLossResponse response = UpdateLossResponse.newBuilder().setUpdated(updated).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteLoss(DeleteLossRequest request, StreamObserver<DeleteLossResponse> responseObserver){
        db.deleteLoss(request.getCaseId());
        DeleteLossResponse response = DeleteLossResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
