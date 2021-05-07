package com.bdqn.microservicecloudproviderentity8003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@ComponentScan("com.bdqn.*")
@MapperScan("com.bdqn.dao")
public class MicroservicecloudProviderEntity8003Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderEntity8003Application.class, args);
    }

}
