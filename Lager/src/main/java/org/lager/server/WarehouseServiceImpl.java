package org.lager.server;

import database.DatabaseMain;
import io.grpc.stub.StreamObserver;
import lager.*;

import java.util.ArrayList;


public class WarehouseServiceImpl extends WarehouseGrpc.WarehouseImplBase {

    private final DatabaseMain db = DatabaseMain.getInstance();

    @Override
    public void createProduct(ProductCreationRequest request, StreamObserver<ProductCreationResponse> responseObserver){
        boolean created = db.createProduct(request.getToCreate().getEan(), request.getToCreate().getProductName(), request.getToCreate().getStock(), request.getToCreate().getInformation());
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
    public void productExists(ProductExistsRequest request, StreamObserver<ProductExistsResponse> responseObserver){
        boolean exists = db.productExists(request.getEan());
        ProductExistsResponse response = ProductExistsResponse.newBuilder().setExists(exists).build();
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
}
