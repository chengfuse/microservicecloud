package com.bdqn.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String  eurekaServers;
    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "/config",method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String getConfig(){
        String str="applicationName:"+applicationName+"\teurekaServers:"+eurekaServers+"\tport:"+port;
        System.out.println("******str:"+str);
        return str;
    }
}
