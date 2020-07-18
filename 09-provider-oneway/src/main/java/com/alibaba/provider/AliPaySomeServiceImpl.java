package com.alibaba.provider;

import com.alibaba.service.SomeService;

/**
 * @Author shenmeng
 * @Date 2020/7/16
 **/
public class AliPaySomeServiceImpl implements SomeService {
    @Override
    public String hello(String s) {
        System.out.println("使用支付宝付款");
        return "AliPaySomeServiceImpl";
    }
}
