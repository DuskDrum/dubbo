package com.alibaba.dubbo.callback.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.callback.CallbackListener;
import com.alibaba.dubbo.callback.CallbackService;

public class CallbackServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:callback_consumer.xml");
        context.start();
        System.out.println("消费端已启动");

        CallbackService callbackService = (CallbackService) context.getBean("callbackService");
        callbackService.addListener("for.bar", new CallbackListener() {

            public void changed(String msg) {
                System.out.println("callback:" + msg);
            }
        });
    }
}
