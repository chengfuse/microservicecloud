package com.bdqn.microservicecloudproviderbook8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

//@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.bdqn.*")
@MapperScan("com.bdqn.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroservicecloudProviderBook8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderBook8001Application.class, args);
    }

}
