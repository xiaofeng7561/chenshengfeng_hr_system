package com.hr.chenshengfeng.mapper;

import com.hr.chenshengfeng.model.Duty;

import java.util.List;
import java.util.Map;

public interface DutyMapper {
    List<Duty> selectDuty();

    List<Duty> selectDutyLimit(Map<String,Integer> map);
}
