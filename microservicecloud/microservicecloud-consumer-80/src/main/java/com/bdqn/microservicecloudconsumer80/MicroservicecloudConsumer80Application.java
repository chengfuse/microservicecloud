package com.bdqn.microservicecloudconsumer80;

import com.bdqns.util.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@ComponentScan("com.bdqn.*")
@RibbonClient(name="MICROSERVICECLOUD-BOOK",configuration = MySelfRule.class)
public class MicroservicecloudConsumer80Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumer80Application.class, args);
    }
}
