package com.example.credit.service;

import com.example.credit.entity.Line;
import com.example.credit.mapper.LineMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@GlobalTransactional(rollbackFor = Exception.class)
public class LineService {
    @Autowired
    LineMapper lineMapper;

    public BigDecimal updateBalance(String userId, BigDecimal repayAmount) {
        Line line = lineMapper.selectByUserId(userId);
        BigDecimal balance = line.getBalance().add(repayAmount);//还款后，恢复额度
        line.setBalance(balance);
        lineMapper.updateBalance(line);
        return balance;
    }

}
