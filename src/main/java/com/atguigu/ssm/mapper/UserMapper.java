package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.User;

/**
 * ClassName: UserMapper
 * Package: com.atguigu.ssm.mapper
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
public interface UserMapper {
    public int get(String name);
    public User findOne(User user);
    public  User checkReg(String email);
    public  int addOne(User user);
}
