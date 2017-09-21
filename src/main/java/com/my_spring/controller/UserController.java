package com.my_spring.controller;

import com.my_spring.entity.User;
import com.my_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private UserService userService;

    @Autowired
    private void setUserService(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/getUser")
    public User getUser(){
        return userService.getUserInfo();
    }

    @GetMapping(value = "/getUserById/{id}")
    public User getUserById(@PathVariable(value = "id") int id){
        return userService.getUserById(id);
    }

    @PostMapping(value = "/addUser")
    public String addUser(User user){
        userService.insertUser(user);
        return "true";
    }

    @GetMapping(value = "/delUser")
    public String delUser(@RequestParam(value = "id") int id){
        userService.delUserById(id);
        return "true";
    }
}
