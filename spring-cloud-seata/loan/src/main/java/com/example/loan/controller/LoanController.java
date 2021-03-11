package com.example.loan.controller;

import com.example.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class LoanController {
    @Autowired
    LoanService loanService;

    @RequestMapping("/loan/payBack")
    public String payBack(String userId, BigDecimal repayAmount){
        return loanService.payBack(userId, repayAmount);
    }

}
