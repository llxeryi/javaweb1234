package com.atguigu.ssm.service.impl;

import com.atguigu.ssm.mapper.CourseMapper;
import com.atguigu.ssm.pojo.Course;
import com.atguigu.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * ClassName: CourseServiceImpl
 * Package: com.atguigu.ssm.service.impl
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> getAllCourse() {
        return courseMapper.getAllCourse();
    }

    @Override
    public Course getCourseByCId(Integer cId) {
        return courseMapper.getCourseByCId(cId);
    }

    @Override
    public int updateCourse(Course course) {
        return courseMapper.updateCourse(course);
    }

    @Override
    public int deleteCourseByCId(Integer cId) {
        return courseMapper.deleteCourseByCId(cId);
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.addCourse(course);
    }

    @Override
    public List<Course> findCourseByName(String name) {
        return courseMapper.findCourseByName(name);
    }

    @Override
    public int updateCourseBy(Integer hours) {
        return courseMapper.updateCourseBy(hours);
    }
}
