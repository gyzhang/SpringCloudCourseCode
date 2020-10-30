package com.example.member.controller;

import com.example.member.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name){
        helloService.testRedis(name);
        helloService.testRabbitMQ(name);
        return "Hello " + name + ". From Member.";
    }
}
