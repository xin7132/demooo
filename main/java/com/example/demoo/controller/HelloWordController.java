package com.example.demoo.controller;


import com.example.demoo.entity.User;
import com.example.demoo.service.HelloWord;
import com.example.demoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloWordController {

    @Autowired
    HelloWord helloWord;

    @Autowired
    private UserService userService;

    @RequestMapping("/say")
    String sayHelloWord() {
        return helloWord.sayHelloWord();
    }

    // 新增注释
    @RequestMapping("/query.htm")
    ModelAndView queryUserByName() {
        ModelAndView vm=new ModelAndView();
        List<User> users = userService.queryUserByName();
        vm.addObject("users",users);
        vm.setViewName("login");
        return vm;
    }
}
