package com.yelixian.beiqi.web;

import com.yelixian.beiqi.utils.GlobalPropertyPlaceholder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.yelixian.beiqi.service.*;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeiqiServer {
    private static final Logger logger = LoggerFactory.getLogger(BeiqiServer.class);

    private Server server;

    private void start() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        /* The port on which the server should run */

        String port = GlobalPropertyPlaceholder.getProperty("server.port");
        logger.info("port: " + port);

        server = ServerBuilder.forPort(Integer.parseInt(port))
                .addService((AuthenticationServiceImpl)context.getBean("authenticationServiceImpl"))
                .addService((BehaviorServiceImpl)context.getBean("behaviorServiceImpl"))
                .addService((MembershipServiceImpl)context.getBean("membershipServiceImpl"))
                .addService((MessageServiceImpl)context.getBean("messageServiceImpl"))
                .addService((RecommendServiceImpl)context.getBean("recommendServiceImpl"))
                .addService((SearchServiceImpl)context.getBean("searchServiceImpl"))
                .addService((UploadServiceImpl)context.getBean("uploadServiceImpl"))
                .addService((UserSettingServiceImpl)context.getBean("userSettingServiceImpl"))
                .addService((UserVideoRelationServiceImpl)context.getBean("userVideoRelationServiceImpl"))
                .build()
                .start();
        logger.info("*** Beiqi gRPC Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                logger.warn("*** shutting down gRPC server since JVM is shutting down");
                BeiqiServer.this.stop();
                logger.warn("*** Beiqi gRPC server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        final BeiqiServer server = new BeiqiServer();
        server.start();
        server.blockUntilShutdown();
    }
}
