package com.alibaba.consumer;

import com.alibaba.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRun {
    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-consumer.xml");
        SomeService wechat = (SomeService) ac.getBean("wechat");
        String hello1 = wechat.hello("China");
        System.out.println(hello1);

        SomeService alipay = (SomeService) ac.getBean("alipay");
        String hello2 = alipay.hello("China");
        System.out.println(hello2);
    }
}
