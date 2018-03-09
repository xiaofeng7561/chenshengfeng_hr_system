package com.hr.chenshengfeng.service.Impl;

import com.hr.chenshengfeng.mapper.DepartmentMapper;
import com.hr.chenshengfeng.model.Department;
import com.hr.chenshengfeng.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DepartmentService implements IDepartmentService  {

@Autowired
private DepartmentMapper departmentMapper;
    @Override
    public List<Department> selectDepartment() {
        List<Department> departments = departmentMapper.selectDepartment();
        return departments;
    }

    @Override
    @Transactional
    public void addDepartment(Department department) {
        departmentMapper.addDepartment(department);
    }

    @Override
    @Transactional
    public void deleteDepartmentById(Integer departmentID) {
        departmentMapper.deleteDepartmentById(departmentID);
    }

    @Override
    public Department selectDepartmentById(Integer departmentID) {
        Department department=departmentMapper.selectDepartmentById(departmentID);
        return department;
    }

    @Override
    @Transactional
    public void updateDepartment(Department department) {
        departmentMapper.updateDepartment(department);
    }

    @Override
    public List<Department> selectDepartmentLimit(Integer page) {
        int begin=(page-1)*2;
        int size=2;
        Map<String,Integer> map=new HashMap<>();
        map.put("begin",begin);
        map.put("size",size);

       List<Department> departmentList= departmentMapper.selectDepartmentLimit(map);
       System.out.print(departmentList);
        return departmentList;
    }


}
