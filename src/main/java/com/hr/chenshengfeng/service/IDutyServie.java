package com.hr.chenshengfeng.service;

import com.hr.chenshengfeng.model.Duty;

import java.util.List;

public interface IDutyServie {
    List<Duty> selectDuty();

    List<Duty> selectDutyLimit(Integer page);
}
