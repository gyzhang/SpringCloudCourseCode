package com.example.loan.client;

import com.example.loan.config.FeignRequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(name = "seata-demo-account", configuration = FeignRequestInterceptor.class)
public interface AccountClient {
    @PostMapping("/account/repayment/add")
    int addRepayment(@RequestParam("userId") String userId, @RequestParam("repayAmount") BigDecimal repayAmount);
}
