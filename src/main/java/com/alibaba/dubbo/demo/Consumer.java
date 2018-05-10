package com.alibaba.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        System.out.println("==========consumer启动了===========");

        DemoService demoService = (DemoService) context.getBean("demoService");

        System.out.println(demoService.sayHello(" world!"));
    }

}
