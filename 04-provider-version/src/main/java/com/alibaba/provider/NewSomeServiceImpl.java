package com.alibaba.provider;

import com.alibaba.service.SomeService;

/**
 * @Author shenmeng
 * @Date 2020/7/16
 **/
public class NewSomeServiceImpl implements SomeService {
    @Override
    public String hello(String s) {
        System.out.println("执行新的SomeService的实现类的方法hello");
        return "NewSomeServiceImpl";
    }
}
