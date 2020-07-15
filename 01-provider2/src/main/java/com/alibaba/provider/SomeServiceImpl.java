package com.alibaba.provider;

import com.alibaba.service.SomeService;

/**
 * @Author shenmeng
 * @Date 2020/7/15
 **/
public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String name) {
        System.out.println(name+"我是提供者");
        return "Hello Dubbo world!"+name;
    }
}
