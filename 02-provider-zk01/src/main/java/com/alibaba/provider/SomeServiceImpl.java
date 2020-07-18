package com.alibaba.provider;


import com.alibaba.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("我是第一个服务提供者" + name);
        return "我是第一个提供者";
    }
}
