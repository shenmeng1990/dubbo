package com.alibaba.consumer;

import com.alibaba.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerRun {
    public static void main(String[] args) {
        ApplicationContext ac =
                new ClassPathXmlApplicationContext("spring-consumer.xml");
        SomeService service = (SomeService) ac.getBean("someService");


        System.out.println(service.hello("tom"));
        System.out.println(service.hello("jerry"));
        System.out.println(service.hello("tom"));
        System.out.println(service.hello("jerry"));

    }
}
