package com.alibaba.dubbo.notify;

public class ConsumerServiceImpl implements ConsumerService {

    public void oninvoke(String arg1) {
        System.err.println("调用开始前： " + arg1);
    }

    public void onreturn(String arg1) {
        System.err.println("调用结束后： " + arg1);
    }

    public void onthrow(String arg1) {
        System.err.println("调用异常时： " + arg1);
    }

}
