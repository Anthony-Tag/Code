package usingThreadclass;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thread t=Thread.currentThread();
        t.setName("ant's Main");
        t.setPriority(8);

        System.out.println(Thread.currentThread());

        MyThread n1= new MyThread();
        n1.setName("my-1");
        MyThread n2= new MyThread();
        n2.setName("my-2");
        MyThread n3= new MyThread();
        n3.setName("my-3");
        MyThread n4= new MyThread();
        n4.setName("my-4");
        MyThread n5= new MyThread();
        n5.setName("my-5");

        n1.start();
    }
}
