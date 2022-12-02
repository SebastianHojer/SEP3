package org.lager.server;

import database.DatabaseMain;
import io.grpc.stub.StreamObserver;
import lager.ProductCreationRequest;
import lager.ProductCreationResponse;
import lager.WarehouseGrpc;


public class WarehouseServiceImpl extends WarehouseGrpc.WarehouseImplBase {

    private DatabaseMain db = DatabaseMain.getInstance();

    @Override
    public void createProduct(ProductCreationRequest request, StreamObserver<ProductCreationResponse> responseObserver){
        boolean created = db.createProduct(request.getEan(), request.getProductName(), request.getStock(), request.getInformation());
        ProductCreationResponse response = ProductCreationResponse.newBuilder().setCreated(created).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
