package com.bdqn.microservicecloudproviderbookhystrix8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.bdqn.*")
@MapperScan("com.bdqn.dao")
@EnableEurekaClient
@EnableCircuitBreaker
public class MicroservicecloudProviderBookHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderBookHystrix8001Application.class, args);
    }

}
