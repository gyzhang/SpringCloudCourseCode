package com.example.console.controller;

import com.example.console.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public ModelAndView hello(String name, String token) {
        ModelAndView mv = new ModelAndView();
        String sayHello = helloService.hello(name, token);
        mv.addObject("sayHello", sayHello);
        mv.addObject("accessToken", token);
        mv.setViewName("/hello");
        return mv;
    }
}
