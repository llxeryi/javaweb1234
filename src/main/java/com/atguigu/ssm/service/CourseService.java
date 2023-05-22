package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Course;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * ClassName: CourseService
 * Package: com.atguigu.ssm.service
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
public interface CourseService {
    List<Course> getAllCourse();
    Course getCourseByCId(Integer cId);
    public int updateCourse(Course course);
    public int deleteCourseByCId(Integer cId);
    public int addCourse(Course course);
    public   List<Course> findCourseByName(String name);
    public int updateCourseBy(Integer hours);
}
