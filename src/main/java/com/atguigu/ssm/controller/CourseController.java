package com.atguigu.ssm.controller;
import com.atguigu.ssm.pojo.Course;
import com.atguigu.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * ClassName: CourseController
 * Package: com.atguigu.ssm.controller
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/course", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        //查询所有的员工信息
        List<Course> list = courseService.getAllCourse();
        //将员工信息在请求域中共享
        model.addAttribute("list", list);
        //跳转到employee_list.html
        return "course_list";
    }

    @RequestMapping(value = "/course", method = RequestMethod.POST)
    public String addEmployee(Course course, HttpSession session) throws IOException {
        //保存员工信息
//判断添加的课程是否已经存在
        String fileName = course.getLogoImage().getOriginalFilename();
        //获取上传的文件的后缀名
        String hzName = fileName.substring(fileName.lastIndexOf("."));
        //获取uuid
        String uuid = UUID.randomUUID().toString();
        //拼接一个新的文件名
        fileName = uuid + hzName;
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取当前工程下photo目录的真实路径
        String photoPath = servletContext.getRealPath("photo");
        //创建photoPath所对应的File对象
        File file = new File(photoPath);
        //判断file所对应目录是否存在
        if(!file.exists()){
            file.mkdir();
        }
        String finalPath ="photo" + File.separator + fileName;
        course.setImage(finalPath);
        //上传文件
         finalPath = photoPath + File.separator + fileName;
        course.getLogoImage().transferTo(new File(finalPath));
        int size = courseService.findCourseByName(course.getName()).size();
        if (size == 0) {
            courseService.addCourse(course);
        }
        //重定向到列表功能：/employee
        return "redirect:/course";
    }

    @RequestMapping(value = "/course/{cId}", method = RequestMethod.GET)
    public String toUpdate(@PathVariable("cId") Integer cId, Model model) {
        //根据id查询员工信息

        Course course = courseService.getCourseByCId(cId);

        //将员工信息共享到请求域中
        model.addAttribute("course", course);

        //跳转到employee_update.html
        return "course_update";
    }

    @RequestMapping(value = "/course/t", method = RequestMethod.POST)
    public String updateCourse(Course course,HttpSession session) throws IOException {

        String fileName = course.getLogoImage().getOriginalFilename();
        //获取上传的文件的后缀名
        String hzName = fileName.substring(fileName.lastIndexOf("."));
        //获取uuid
        String uuid = UUID.randomUUID().toString();
        //拼接一个新的文件名
        fileName = uuid + hzName;
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取当前工程下photo目录的真实路径
        String photoPath = servletContext.getRealPath("photo");
        //创建photoPath所对应的File对象
        File file = new File(photoPath);
        //判断file所对应目录是否存在
        if(!file.exists()){
            file.mkdir();
        }
        String finalPath ="photo" + File.separator + fileName;
        course.setImage(finalPath);
        //上传文件
        finalPath = photoPath + File.separator + fileName;
        course.getLogoImage().transferTo(new File(finalPath));

        int size = courseService.findCourseByName(course.getName()).size();

        if (size <= 1) {
            System.out.println(course);
            courseService.updateCourse(course);
        }


        //重定向到列表功能：/employee
        return "redirect:/course";
    }

    @RequestMapping(value = "/course/{cId}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("cId") Integer cId) {
        //删除员工信息



            courseService.deleteCourseByCId(cId);
            //重定向到列表功能：/employee
            return "redirect:/course";

    }
}
