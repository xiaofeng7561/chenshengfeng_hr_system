package com.hr.chenshengfeng.mapper;

import com.hr.chenshengfeng.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectUserOne() throws Exception {
        User user = new User();
        user.setUsername("fff");
        user.setPassword("ffafaf");
        userMapper.selectUserOne(user);
    }




}