package com.skeiatate.controller;

import com.skeiatate.entity.User;
import com.skeiatate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author SkeiATate
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ModelAndView all(ModelAndView mv) {
        // 查询用户
        List<User> users = this.userService.queryAll();
        // 放入模型
        mv.addObject("users", users);
        // 返回模板名称（就是classpath:/templates/目录下的html文件名）
        mv.setViewName("index");
        return mv;
    }
}
