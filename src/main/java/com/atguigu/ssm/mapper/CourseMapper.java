package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Course;

import java.util.List;

/**
 * ClassName: CourseMapper
 * Package: com.atguigu.ssm.mapper
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
public interface CourseMapper {
    List<Course> getAllCourse();

    public  Course getCourseByCId(Integer cId);
    public   List<Course> findCourseByName(String name);
    public int updateCourse(Course course);
    public int deleteCourseByCId(Integer cId);
    public int addCourse(Course course);
    public int updateCourseBy(Integer hours);
}
