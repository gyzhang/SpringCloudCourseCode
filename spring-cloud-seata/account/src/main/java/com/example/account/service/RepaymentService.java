package com.example.account.service;

import com.example.account.entity.Repayment;
import com.example.account.mapper.AccountMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
@GlobalTransactional(rollbackFor = Exception.class)
public class RepaymentService {
    @Autowired
    AccountMapper accountMapper;

    public int addRepayment(String userId, Date repayDate , BigDecimal repayAmount){
        return accountMapper.addRepayment(userId, repayDate, repayAmount);
    }

}
