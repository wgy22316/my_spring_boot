package com.my_spring.controller;

import com.my_spring.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @GetMapping(value = "/getHello")
    @ResponseBody
    public String getHello(){
        return "Hello";
    }

    @GetMapping(value = "/getUser")
    @ResponseBody
    public User getUser(){

        User user = new User();
        user.setId(10);
        user.setUserName("zhangbo");

        return user;
    }
}
