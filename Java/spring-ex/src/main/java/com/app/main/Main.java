package com.app.main;

import com.app.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Employee e1=(Employee) context.getBean("e1");
        System.out.println(e1+"\n\n");

//        Employee e2=(Employee) context.getBean("e2");
//        System.out.println(e2+"\n\n");
//
//        Employee e3=(Employee) context.getBean("e3");
//        System.out.println(e3);
    }
}
