package com.app.main;

import com.app.model.Hello;
import com.app.model.HelloLazy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("mybeans.xml");
        Hello h1=(Hello)context.getBean("h1");
        System.out.println("From MAIN : "+h1.getMessage() );
        System.out.println("Identity hashcode of h1 "+System.identityHashCode(h1));

        Hello h2=(Hello)context.getBean("h2");
        System.out.println("From MAIN : "+h2.getMessage() );
        System.out.println("Identity hashcode of h2 "+System.identityHashCode(h2));

        Hello h11=(Hello)context.getBean("h1");
        System.out.println("From MAIN : "+h11.getMessage() );
        System.out.println("Identity hashcode of h11 which is of h1 "+System.identityHashCode(h11));


        System.out.println("\n\nPrototype Scope demo");
        Hello h3=(Hello)context.getBean("h3");
        System.out.println("From MAIN : "+h3.getMessage() );
        System.out.println("Identity hashcode of h3 "+System.identityHashCode(h3));


        Hello h31=(Hello)context.getBean("h3");
        System.out.println("From MAIN : "+h31.getMessage() );
        System.out.println("Identity hashcode of h3 with  h31 "+System.identityHashCode(h31));


        System.out.println("\n\nLazy-Init demo");
        HelloLazy hl=(HelloLazy) context.getBean("hl");

    }
}
