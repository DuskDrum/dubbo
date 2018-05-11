package com.alibaba.dubbo.callback.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:callback_provider.xml");
        context.start();
        System.out.println("=======生产者启动成功=====");
        System.in.read();
    }

}
