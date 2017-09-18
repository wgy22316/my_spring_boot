package com.my_spring.entity;

public class User {
    /**
     * 用户id
     */
    private int id;

    /**
     * 用户名称
     */
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
