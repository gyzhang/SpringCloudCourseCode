package com.example.loan.service;

import com.example.loan.client.AccountClient;
import com.example.loan.client.CreditClient;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@GlobalTransactional(rollbackFor = Exception.class)
public class LoanService {
    @Autowired
    AccountClient accountClient;
    @Autowired
    IouService iouService;
    @Autowired
    CreditClient creditClient;

    /**
     * 还款
     * @param userId 用户id
     * @param repayAmount 还款金额
     * @return 提示信息
     */
    public String payBack(String userId, BigDecimal repayAmount){
        accountClient.addRepayment(userId, repayAmount);//核算.还款记录
        iouService.updateBalance(userId, repayAmount);//贷后.借据
        creditClient.updateLine(userId, repayAmount);//授信.额度

        return "还款成功。";
    }
}
