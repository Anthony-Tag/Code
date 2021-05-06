package eg_java;

public class NewStyleWithLambda {
    public static void main(String[] args) {

        MyFunctional f1=()->{
            System.out.println("hello Lambda");
        };
        f1.hello();
        MyFunctional f2=()->{
            System.out.println("Hello Lambda the second");
        };
        f2.hello();
    }
    //Lambda is applicable only and only on functional interface
}
