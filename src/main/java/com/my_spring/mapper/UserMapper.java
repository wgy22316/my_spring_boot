package com.my_spring.mapper;

import com.my_spring.entity.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;


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

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    public User getUserById2(@Param("id") int id);
}
