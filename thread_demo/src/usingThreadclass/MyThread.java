package usingThreadclass;

import java.sql.SQLOutput;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Hello from "+Thread.currentThread());
    }
}
