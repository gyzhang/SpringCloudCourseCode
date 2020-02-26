package com.example.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client")
public interface SayHiClient {
	@RequestMapping("/hi")
	String sayHi(@RequestParam String name);
}
