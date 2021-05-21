package com.app.main;

import com.app.config.SpringBeanConfigClass;
import com.app.model.Hello;
import com.app.service.MyService;
import com.app.service.impl.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringBeanConfigClass.class);
        Hello h1=(Hello) context.getBean("h1");
        System.out.println(h1.getMessage());

        MyService ms=(MyService) context.getBean("myservice");
        ms.HelloService();
    }
}
