package usingRunnableInterface;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Printing from thread : "+Thread.currentThread().getName()+ " value of i = "+i);
        }
    }
}
