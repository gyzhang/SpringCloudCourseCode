package com.example.credit.mapper;

import com.example.credit.entity.Line;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LineMapper {
    int updateBalance(Line record);
    Line selectByUserId(String userId);
}