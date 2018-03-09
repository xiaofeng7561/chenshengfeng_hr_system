package com.hr.chenshengfeng.service.Impl;

import com.hr.chenshengfeng.mapper.UserMapper;
import com.hr.chenshengfeng.model.User;
import com.hr.chenshengfeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserOne(User user) {
        User userOne = userMapper.selectUserOne(user);
        return userOne;
    }
}
