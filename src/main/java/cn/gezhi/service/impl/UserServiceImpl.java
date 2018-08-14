package cn.gezhi.service.impl;

import cn.gezhi.mapper.UserMapper;
import cn.gezhi.po.User;
import cn.gezhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Service

public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.selectById(id);
    }



}
