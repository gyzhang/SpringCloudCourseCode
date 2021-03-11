package com.example.loan.mapper;

import com.example.loan.entity.Iou;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanMapper {
    int updateBalance(Iou record);
    Iou selectByUserId(String userId);
}