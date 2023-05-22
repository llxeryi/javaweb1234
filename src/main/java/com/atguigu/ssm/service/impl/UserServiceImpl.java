package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.UserMapper;
import com.atguigu.ssm.pojo.User;
import com.atguigu.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: UserServiceImpl
 * Package: com.atguigu.ssm.service.impl
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findOne(User user) {
        return userMapper.findOne(user);
    }

    @Override
    public User checkReg(String email) {
        return userMapper.checkReg(email);
    }

    @Override
    public int addOne(User user) {
        return userMapper.addOne(user);
    }
}
