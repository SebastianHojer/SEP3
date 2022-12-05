package org.lager.server;
import database.DatabaseMain;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LagerServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090).addService(new UserServiceImpl()).addService(new WarehouseServiceImpl()).build();
        server.start();
        System.out.println("Server is running ...");
        server.awaitTermination();
    }
}
