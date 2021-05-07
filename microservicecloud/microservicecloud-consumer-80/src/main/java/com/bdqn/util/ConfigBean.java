package com.bdqn.util;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced
	public static RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public IRule myRule(){
		//return new RoundRobinRule();轮询访问服务端
		//return  new RandomRule();//随机访问服务端
		return new RetryRule(); //获取轮询扫描是否上线的服务端
	}
	
}
