package com.yuanziren.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class SpringTest {

    // 范例
    @Test
    public void test01(){
        System.out.println("Hello JUnit...");
    }

    @Test
    public void testSpring() {

        // 1. 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // 2. 获取HelloService
        HelloService helloService = (HelloService) context.getBean("helloService");
        // 3. 使用
        helloService.hello();
    }
}