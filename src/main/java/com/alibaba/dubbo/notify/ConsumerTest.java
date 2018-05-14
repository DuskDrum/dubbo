package com.alibaba.dubbo.notify;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:notify_consumer.xml");
        context.start();
        ProviderService providerService =
                (ProviderService) context.getBean("notifyProviderService");

        providerService.sayHello("Worlds");
    }
}
