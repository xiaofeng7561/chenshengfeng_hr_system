package com.hr.chenshengfeng.action;

import com.hr.chenshengfeng.model.Duty;
import com.hr.chenshengfeng.service.IDutyServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/duty")
public class DutyAction {

    @Autowired
    private IDutyServie dutyService;

    @RequestMapping(value = "/manage/{page}")
    public String manage(@PathVariable("page") Integer page, Model model){
        List<Duty> duties = dutyService.selectDuty();
        int size = duties.size();
        int page2=0;
        if(size%2==0){
                page2=size/2;
        }else{
            page2=size/2+1;
        }
        model.addAttribute("size",page2);
        model.addAttribute("currentPage",page);
        List<Duty> dutyList = dutyService.selectDutyLimit(page);
        model.addAttribute("dutylist",dutyList);
        return "dutymanage";
    }



}
