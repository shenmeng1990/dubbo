package com.alibaba.provider;


import com.alibaba.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("执行提供者的hello()");
        return name;
    }
}
