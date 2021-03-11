package com.example.account.controller;

import com.example.account.service.RepaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RestController
public class RepaymentController {
    @Autowired
    RepaymentService repaymentService;

    @RequestMapping("/account/repayment/test")
    public String test(String name){
        String userId = "1001";
        Date repayDate = new Date();
        BigDecimal repayAmount = new BigDecimal(5000.1234);

        repaymentService.addRepayment(userId, repayDate, repayAmount);

        return "hello, " + name;
    }

    /**
     * 添加1条还款记录
     * @param userId 还款用户id
     * @param repayAmount 还款金额
     * @return 添加记录条数
     */
    @PostMapping("/account/repayment/add")
    public int add(String userId, BigDecimal repayAmount){
        Date repayDate = new Date();
        return repaymentService.addRepayment(userId, repayDate, repayAmount);
    }
}
