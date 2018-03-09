package com.hr.chenshengfeng.mapper;

import com.hr.chenshengfeng.model.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentMapper {
    List<Department> selectDepartment();

    void addDepartment(Department department);

    void deleteDepartmentById(Integer departmentID);


    Department selectDepartmentById(Integer departmentID);

    void updateDepartment(Department department);


    List<Department> selectDepartmentLimit(Map<String, Integer> map);
}
