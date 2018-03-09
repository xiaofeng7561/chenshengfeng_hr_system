package com.hr.chenshengfeng.action;

import com.hr.chenshengfeng.model.User;
import com.hr.chenshengfeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class UserAction {
    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login")
    public  String login(){
        return "login";
    }

    @RequestMapping(value = "/loginValidate")
    @ResponseBody
    public String loginValidate(User user, HttpSession session){
        User userOne = userService.selectUserOne(user);
        if (userOne!=null){
            session.setAttribute("loginUser",userOne);
            return "1";
        }else{
            return "0";
        }


    }

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }






}
