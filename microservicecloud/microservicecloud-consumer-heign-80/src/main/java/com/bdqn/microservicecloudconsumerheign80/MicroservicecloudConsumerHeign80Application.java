package com.bdqn.microservicecloudconsumerheign80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bdqn.*")
@EnableFeignClients(basePackages = {"com.bdqn"})
@EnableEurekaClient
public class MicroservicecloudConsumerHeign80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerHeign80Application.class, args);
    }

}
