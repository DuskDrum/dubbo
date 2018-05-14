package com.alibaba.dubbo.notify;

import java.io.File;

public class ProviderServiceImpl implements ProviderService {

    public void sayHello(String context) {
        File file = new File("D:\test.txt");
        System.out.println("Hello " + context);
    }

}
