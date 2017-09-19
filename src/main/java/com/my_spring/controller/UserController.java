package com.my_spring.controller;

import com.my_spring.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public List<User> getUsers(){
        List<User> list = new ArrayList<>();

        User user = new User();
        user.setUserName("hello");
        list.add(user);

        User user2 = new User();
        user2.setUserName("hello");
        list.add(user2);

        return list;
    }

    @GetMapping(value = "/{name}")
    public User getUserByName(@PathVariable("name") String name){

        User user = new User();
        user.setUserName("hello world");
        return user;
    }
}
