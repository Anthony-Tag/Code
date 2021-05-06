package mypack;

import static mypack.Methods.methHelloStatic;

public class StaticCode {
    public static void main(String[] args) {
        System.out.println("from main");

        //static methods can be used by anything in class
        helloStatic();

        //create object to get to non static methods
        StaticCode d= new StaticCode();
        d.NotStatic();

        methHelloStatic();

        Methods m = new Methods();
        m.methNotStatic();
    }

    public static void helloStatic(){
        System.out.println("from static");
    }

    public void NotStatic(){
        System.out.println("from not static");
    }
}
