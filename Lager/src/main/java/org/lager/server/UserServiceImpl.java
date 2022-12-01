package org.lager.server;

import database.DatabaseMain;
import io.grpc.stub.StreamObserver;
import lager.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class UserServiceImpl extends UserGrpc.UserImplBase {
    private final DatabaseMain db = DatabaseMain.getInstance();

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

    @Override
    public void retrieveUsers(UsernameRetrievalRequest request, StreamObserver<UsernameRetrievalResponse> responseObserver){
        ArrayList<String> usernames = db.retrieveUsers();
        UsernameRetrievalResponse response = UsernameRetrievalResponse.newBuilder().addAllUsername(usernames).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUser(DeleteUserRequest request, StreamObserver<DeleteUserResponse> responseObserver){
        boolean deleted = db.deleteUser(request.getUsername());
        DeleteUserResponse response = DeleteUserResponse.newBuilder().setDeleted(deleted).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }



}
