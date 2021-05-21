package com.app.service.impl;

import com.app.service.MyService;

public class MyServiceImpl implements MyService {
    @Override
    public void HelloService() {
        System.out.println("Hello from HelloService() MyServiceImpl");
    }
}
