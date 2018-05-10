package com.alibaba.dubbo.demo;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello" + name;
    }
    
}
