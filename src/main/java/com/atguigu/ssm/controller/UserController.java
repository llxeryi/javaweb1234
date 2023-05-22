package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.User;
import com.atguigu.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: UserController
 * Package: com.atguigu.ssm.controller
 * Description:
 *
 * @Author: 漱涵1号
 * @Vertion: v1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/golog")
    public String log(User user, Model model) {
        User u = userService.findOne(user);
        if(user.getEmail()==""||user.getPwd()=="")
        {

            return "logNull";
        }
        model.addAttribute("user", u);
        if (u != null) {
            return "redirect:/course";
        } else
            return "logno";
    }



    @RequestMapping("/goreg")
    public String reg(User user) {
//        判断email是否被注册
        System.out.println(user);
        if(user.getEmail()==""||user.getPwd()=="")
        {

            return "regNull";
        }
        else {
            User u = userService.checkReg(user.getEmail());
            if (u == null) {
                userService.addOne(user);
                return "regok";
            }
            return "regno";
        }
    }
    @RequestMapping("/reg")
public String rego()
{
    return "reg";
}


}
