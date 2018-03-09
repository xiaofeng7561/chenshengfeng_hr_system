package com.hr.chenshengfeng.service.Impl;

import com.hr.chenshengfeng.mapper.DutyMapper;
import com.hr.chenshengfeng.model.Duty;
import com.hr.chenshengfeng.service.IDutyServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DutyServiceImpl implements IDutyServie {

    @Autowired
    private DutyMapper dutyMapper;
    @Override
    public List<Duty> selectDuty() {
        List<Duty> duties = dutyMapper.selectDuty();
        return duties;
    }

    @Override
    public List<Duty> selectDutyLimit(Integer page) {
        int begin=(page-1)*2;
        int size=2;
        Map<String,Integer> map= new HashMap<>();
        map.put("begin",begin);
        map.put("size",size);
        List<Duty> dutyList=dutyMapper.selectDutyLimit(map);
        return dutyList;
    }
}
