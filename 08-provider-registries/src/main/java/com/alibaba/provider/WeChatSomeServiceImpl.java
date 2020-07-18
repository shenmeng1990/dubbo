package com.alibaba.provider;

import com.alibaba.service.SomeService;

/**
 * @Author shenmeng
 * @Date 2020/7/16
 **/
public class WeChatSomeServiceImpl implements SomeService {
    @Override
    public String hello(String s) {
        System.out.println("使用微信付款");
        return "WeChatSomeServiceImpl";
    }
}
