package com.hr.chenshengfeng.mapper;

import com.hr.chenshengfeng.model.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class DepartmentMapperTest {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void selectDepartment() throws Exception {
        departmentMapper.selectDepartment();
    }

    @Test
    public void deleteDepartmentById(){
        departmentMapper.deleteDepartmentById(48);
    }

}