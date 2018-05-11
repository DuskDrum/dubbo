package com.alibaba.dubbo.callback.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.dubbo.callback.CallbackListener;
import com.alibaba.dubbo.callback.CallbackService;

public class CallbackConsumerServiceImpl implements CallbackService {

    private final Map<String, CallbackListener> listeners =
            new ConcurrentHashMap<String, CallbackListener>();

    public CallbackConsumerServiceImpl() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        for (Map.Entry<String, CallbackListener> entry : listeners.entrySet()) {
                            try {
                                entry.getValue().changed(getChange(entry.getKey()));
                            } catch (Exception e) {
                                listeners.remove(entry.getKey());
                            }
                        }
                        Thread.sleep(10000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

    public void addListener(String key, CallbackListener listener) {
        listeners.put(key, listener);
        listener.changed(getChange(key));
    }

    private String getChange(String key) {
        return key + " Changed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

}
