package com.edsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GatewayControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayControllerApplication.class, args);
    }

}
