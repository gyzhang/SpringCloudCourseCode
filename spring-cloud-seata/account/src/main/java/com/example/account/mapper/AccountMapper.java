package com.example.account.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.Date;

@Mapper
public interface AccountMapper {
    int addRepayment(String userId, Date repayDate , BigDecimal repayAmount);
}
