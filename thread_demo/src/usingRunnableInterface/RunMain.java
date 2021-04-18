package usingRunnableInterface;

public class RunMain {
    public static void main(String[] args) {

        MyRunnable r1=new MyRunnable();
        MyRunnable r2=new MyRunnable();
        MyRunnable r3=new MyRunnable();
        MyRunnable r4=new MyRunnable();
        MyRunnable r5=new MyRunnable();

        Thread t1=new Thread(r1,"myrun-1");
        Thread t2=new Thread(r1,"myrun-2");
        Thread t3=new Thread(r1,"myrun-3");
        Thread t4=new Thread(r1,"myrun-4");
        Thread t5=new Thread(r1,"myrun-5");

        t1.start();;
        t2.start();
        t3.start();
        t4.start();
        t5.start();

//       for (int i=0;i<5;i++){
//            System.out.println("print from thread : "+Thread.currentThread().getName()+" value of i = "+i);
//            try{
//                Thread.sleep(1000);
//            }catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println("Main ends here");
    }
}
