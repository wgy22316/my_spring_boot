package com.my_spring.controller;

import com.my_spring.entity.User;
import com.my_spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HelloController {


    private UserRepository userRepository;

    @Autowired
    private void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

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

    @GetMapping(value = "/userList")
    @ResponseBody
    public List<User> userList(){
        return userRepository.usrList();
    }

    @GetMapping(value = "/getUserById")
    @ResponseBody
    public User getUserById(@RequestParam("id") int id){
        return userRepository.getUserById(id);
    }
}
