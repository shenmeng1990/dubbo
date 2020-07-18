package com.alibaba.provider;


import com.alibaba.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println("我是第二个服务提供者" + name);
        return "我是第二个提供者";
    }
}
