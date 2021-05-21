package com.app.config;

import com.app.model.Hello;
import com.app.service.MyService;
import com.app.service.impl.MyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfigClass {

    @Bean(name = "h1")
    public Hello getHello(){
        return new Hello("Hello from Bean Annotation Configuration");
    }

    @Bean(name = "myservice")
    @Lazy
    @Scope("prototype")
    public MyService getMyService(){
        return new MyServiceImpl();
    }
}
