package com.alibaba.dubbo.notify;

public interface ConsumerService {

    public void oninvoke(String arg1);

    public void onreturn(String arg1);

    public void onthrow(String arg1);

}