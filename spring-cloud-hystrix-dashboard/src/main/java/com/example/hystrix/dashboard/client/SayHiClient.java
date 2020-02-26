package com.example.hystrix.dashboard.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = SayHiHystrix.class)
public interface SayHiClient {
	@RequestMapping("/hi")
	String sayHi(@RequestParam String name);
}
