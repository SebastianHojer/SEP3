package org.lager.server;

import database.DatabaseMain;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.netty.handler.ssl.ApplicationProtocolConfig;

public class LagerServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090).addService(new LagerServiceImpl()).build();
        server.start();
        server.awaitTermination();
    }
}
