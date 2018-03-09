package com.hr.chenshengfeng.service;

import com.hr.chenshengfeng.model.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> selectDepartment();

    void addDepartment(Department department);

    void deleteDepartmentById(Integer departmentID);


    Department selectDepartmentById(Integer departmentID);

    void updateDepartment(Department department);

    List<Department> selectDepartmentLimit(Integer page);
}
