package com.example.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setReadTimeout(15000);// 读取超时
		requestFactory.setConnectTimeout(15000);// 连接超时
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		return restTemplate;
	}

}
