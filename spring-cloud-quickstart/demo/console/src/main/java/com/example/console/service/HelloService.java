package com.example.console.service;

import com.example.console.feign.HelloClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private HelloClientFeign helloClientFeign;

    public String hello(String name, String token){

        return helloClientFeign.hello(name, token);
    }
}
