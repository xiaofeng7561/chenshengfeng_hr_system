package com.hr.chenshengfeng.mapper;

import com.hr.chenshengfeng.model.Duty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class DutyMapperTest {

    @Autowired
    private DutyMapper dutyMapper;
    @Test
    public void selectDuty() throws Exception {
dutyMapper.selectDuty();
    }

    @Test
    public void selectDutyLimit() throws Exception {
        int begin=0;
        int size=2;
        Map<String,Integer> map= new HashMap<>();
        map.put("begin",begin);
        map.put("size",size);
        List<Duty> dutyList = dutyMapper.selectDutyLimit(map);
        for (Duty duty:dutyList){
            System.out.print(duty.getDepartment().getName());
            System.out.print(duty.getDutyId());
            System.out.print(duty.getDepartment().getDepartmentId());
        }

    }

}