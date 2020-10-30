package com.example.console.feign;

import org.springframework.stereotype.Component;

/**
 * 熔断器，快速失败
 */
@Component
public class HelloClientHystrix implements HelloClientFeign {
    @Override
    public String hello(String name, String token) {

        return "OOPS..." + name + ", SOMETHING IS WRONG!";
    }
}
