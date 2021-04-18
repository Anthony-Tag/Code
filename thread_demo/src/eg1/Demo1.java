package eg1;

import java.security.DomainCombiner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hello main");
        System.out.println("Creating obj1");
        Demo1 d=new Demo1();
        System.out.println("Creating obj2");
        Demo1 d2=new Demo1();
    }

    public Demo1(){
        System.out.println("Hello constructor");
    }

    static {
        System.out.println("I am before main");
    }
    {
        System.out.println("Hello annoymous block");
    }
}
