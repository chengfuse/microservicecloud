package com.bdqn.microservicecloudconfigclient3355;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.bdqn.*")
public class MicroservicecloudConfigClient3355Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigClient3355Application.class, args);
    }

}
