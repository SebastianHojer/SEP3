package org.lager.server;

import database.DatabaseMain;
import io.grpc.stub.StreamObserver;
import lager.*;

public class LagerServiceImpl extends LagerGrpc.LagerImplBase {
    private DatabaseMain db = new DatabaseMain();

    @Override
    public void createUser(UserCreationRequest request, StreamObserver<UserCreationResponse> responseObserver) {
        boolean created = db.addUser(request.getUsername(), request.getPassword(), request.getAdmin());
        UserCreationResponse response = UserCreationResponse.newBuilder().setCreated(created).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void usernameExists(UsernameExistsRequest request, StreamObserver<UsernameExistsResponse> responseObserver){
        boolean exists = db.usernameExists(request.getUsername());
        UsernameExistsResponse response = UsernameExistsResponse.newBuilder().setExists(exists).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
