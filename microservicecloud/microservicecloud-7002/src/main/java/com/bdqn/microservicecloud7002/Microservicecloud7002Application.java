package com.bdqn.microservicecloud7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Microservicecloud7002Application {

    public static void main(String[] args) {
        SpringApplication.run(Microservicecloud7002Application.class, args);
    }

}
