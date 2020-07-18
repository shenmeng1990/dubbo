package com.alibaba.controller;

import com.alibaba.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author shenmeng
 * @Date 2020/7/15
 **/
public class SomeController {

    @Autowired
    private SomeService service;

    @RequestMapping("/some.do")
    public String someHandle() {
        String result = service.hello("China");
        System.out.println("消费者端接收到 = " +  result);
        return "/welcome.jsp";
    }

}
