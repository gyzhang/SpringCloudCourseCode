package com.example.loan.service;

import com.example.loan.entity.Iou;
import com.example.loan.mapper.LoanMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@GlobalTransactional(rollbackFor = Exception.class)
public class IouService {
    @Autowired
    LoanMapper loanMapper;

    public BigDecimal updateBalance(String userId, BigDecimal repayAmount){
        Iou iou = loanMapper.selectByUserId(userId);
        BigDecimal balance = iou.getBalance().subtract(repayAmount);//还款后，借据余额减少
        iou.setBalance(balance);
        loanMapper.updateBalance(iou);
        return balance;
    }
}
