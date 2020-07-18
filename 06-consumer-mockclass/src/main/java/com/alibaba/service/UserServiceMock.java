package com.alibaba.service;

/**
 * @Author shenmeng
 * @Date 2020/7/16
 **/
public class UserServiceMock implements UserService{
    @Override
    public String getUsernameById(int id) {
        return "没有id为"+id+"的用户";
    }

    @Override
    public void addUser(String username) {
        System.out.println("添加该用户失败：" + username);
    }
}
