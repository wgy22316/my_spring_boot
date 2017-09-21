package com.my_spring.mapper;

import com.my_spring.entity.User;

public interface UserMapper {

     public User findUserInfo();

     public User getUserById(int id);

    /**
     * 添加用户
     * @param user
     * @return
     */
     public void insertUser(User user);

    /**
     * 删除用户
     * @param id
     */
    public void delUserById(int id);
}
