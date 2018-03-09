package com.hr.chenshengfeng.action;

import com.hr.chenshengfeng.model.Department;
import com.hr.chenshengfeng.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/department")
public class DpartmentAction {
@Autowired
    private IDepartmentService departmentService;

@RequestMapping(value = "/manage/{page}")
    public String manage(@PathVariable("page")Integer page ,Model model){
    List<Department> departments = departmentService.selectDepartment();
    int size = departments.size();
    int page2=0;
    if(size%2==0){
        page2 = size/2;
    }else{
        page2=(size/2)+1;
    }
    model.addAttribute("size",page2);
    List<Department> departmentList= departmentService.selectDepartmentLimit(page);
    model.addAttribute("departmentlist",departmentList);
    model.addAttribute("currentPage",page);
    return "departmentmanage";
}

@RequestMapping(value = "/addDepartmentPage")
    public String addDepartmentPage(){
        return "addDepartment";
}


@RequestMapping(value = "/addDepartment")
    public String addDepartment(Model model,Department department){
        departmentService.addDepartment(department);
        return "redirect:/department/manage/1";
}

@RequestMapping(value = "/deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable("id") Integer departmentID){
        departmentService.deleteDepartmentById(departmentID);
    return "redirect:/department/manage/1";
}

@RequestMapping(value = "/updateDepartmentPage/{id}")
    public String updateDepartmentPage(@PathVariable("id") Integer departmentID,Model model) {
    Department department = departmentService.selectDepartmentById(departmentID);
    model.addAttribute("departmaent", department);
    return "updateDepartmentPage";
}

@RequestMapping(value = "/updateDepartment")
        public String updateDepartment(Department department){
            departmentService.updateDepartment(department);
        return "redirect:/department/manage/1";
    }

}


