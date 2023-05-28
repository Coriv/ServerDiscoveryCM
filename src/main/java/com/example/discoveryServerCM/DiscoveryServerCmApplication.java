package com.example.discoveryServerCM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerCmApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerCmApplication.class, args);
    }

}
