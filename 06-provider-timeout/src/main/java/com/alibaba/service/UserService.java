package com.alibaba.service;

/**
 * @Author shenmeng
 * @Date 2020/7/16
 **/
public interface UserService {
    String getUsernameById(int id);
    void addUser(String username);
}
