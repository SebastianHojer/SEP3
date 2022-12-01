package org.lager.server;

import database.Delete;
import database.Insert;
import database.Select;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.util.ArrayList;

public class LagerServer {
    public static void main(String[] args) throws Exception {
        Insert insert = new Insert();
        System.out.println(insert.createProduct(93894884, "Bosch boring machine", 27, "a boring machine from Bosch"));
        Server server = ServerBuilder.forPort(9090).addService(new UserServiceImpl()).addService(new WarehouseServiceImpl()).build();
        server.start();
        System.out.println("Server is running ...");
        server.awaitTermination();
    }
}
