package com.alibaba.consumer;

import com.alibaba.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author shenmeng
 * @Date 2020/7/16
 **/
public class ConsumerRun {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");
        UserService service = (UserService) ac.getBean("userService");
        String userName = service.getUsernameById(3);
        System.out.println("userName="+userName);
        service.addUser("user001");
    }

}
