package com.alibaba.consumer;

import com.alibaba.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author shenmeng
 * @Date 2020/7/15
 **/
public class ConsumerRun {

    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");
        SomeService someService = (SomeService)ac.getBean("someService");
        String result = someService.hello("China");
        System.out.println(result);
    }

}
