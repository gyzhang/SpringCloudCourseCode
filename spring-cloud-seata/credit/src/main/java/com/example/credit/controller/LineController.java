package com.example.credit.controller;

import com.example.credit.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class LineController {
    @Autowired
    LineService lineService;

    @RequestMapping("/credit/line/test")
    public String test(String name){
        String userId = "1001";
        BigDecimal amount = new BigDecimal(1234.1234);

        lineService.updateBalance(userId, amount);

        return "hello, " + name;
    }

    @PostMapping("/credit/line/update")
    public BigDecimal update(String userId, BigDecimal repayAmount) {
        return lineService.updateBalance(userId, repayAmount);
    }

}
