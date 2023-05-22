package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;

import java.util.List;

/**
 * ClassName: EmployeeMapper
 * Package: com.atguigu.ssm.mapper
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
public interface EmployeeMapper {
    List<Employee> getAllEmployee();
}
