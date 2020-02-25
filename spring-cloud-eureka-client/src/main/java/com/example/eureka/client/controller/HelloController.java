package com.example.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/hi")
	public String sayHello(@RequestParam String name) {
		return "Hello Spring Cloud, Hello " + name + ". Server Port: " + port;
	}

}
