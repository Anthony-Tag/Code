package exception_demo;

public class Demo1 {
    public static void main(String[] args) {
        int x =10;
        int y=2;
        int res =0;

        try {
            res = x / y;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("We cannot divide by zero");
        }finally {
            System.out.println("Result is "+res);
        }
        System.out.println("");
    }
}
