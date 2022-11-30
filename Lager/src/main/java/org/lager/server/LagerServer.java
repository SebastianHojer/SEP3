package org.lager.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LagerServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090).addService(new UserServiceImpl()).build();
        server.start();
        server.awaitTermination();
    }
}
