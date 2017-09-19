package com.my_spring.repository;

import com.my_spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class UserRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRepository(JdbcTemplate jdbcTemplate){

        this.jdbcTemplate = jdbcTemplate;

    }

    /**
     * 获取所有的用户
     * @return
     */
    public List<User> usrList(){
        return jdbcTemplate.query("select * from user", new RowMapper<User>() {

            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setUserName(resultSet.getString(2));
                return user;
            }
        });
    }

    /**
     * 根据ID获取用户
     * @param id
     * @return
     */
    public User getUserById(int id){
        return jdbcTemplate.queryForObject("select * from user where id=" + id, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setUserName(resultSet.getString(2));
                return user;
            }
        });
    }
}
