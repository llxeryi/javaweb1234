package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.User;

/**
 * ClassName: UserService
 * Package: com.atguigu.ssm.service
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
public interface UserService {
    public User findOne(User user);
    public  User checkReg(String email);
    public  int addOne(User user);

}
