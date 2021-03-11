package com.example.loan.client;

import com.example.loan.config.FeignRequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(name = "seata-demo-credit", configuration = FeignRequestInterceptor.class)
public interface CreditClient {
    @PostMapping("/credit/line/update")
    public BigDecimal updateLine(@RequestParam("userId") String userId, @RequestParam("repayAmount") BigDecimal repayAmount);
}
