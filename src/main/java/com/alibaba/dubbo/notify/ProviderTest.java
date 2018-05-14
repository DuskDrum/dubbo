package com.alibaba.dubbo.notify;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:notify_provider.xml");
        context.start();
        System.out.println("=======生产者启动成功=====");
        System.in.read();

    }

}
