package com.my_spring.service;

import com.my_spring.entity.User;
import com.my_spring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        return userMapper.findUserInfo();
    }

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }

    public void insertUser(User user){
        userMapper.insertUser(user);
    }

    public void delUserById(int id){
        userMapper.delUserById(id);
    }
}
