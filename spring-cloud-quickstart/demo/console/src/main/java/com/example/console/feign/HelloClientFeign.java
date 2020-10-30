package com.example.console.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign调用服务网关
 */
@FeignClient(value = "SERVICE-ZUUL", fallback = HelloClientHystrix.class)
public interface HelloClientFeign {
    @GetMapping(value = "/v5.25/api/member/hello")
    String hello(@RequestParam(value = "name") String name, @RequestParam(value = "token") String token);
}
