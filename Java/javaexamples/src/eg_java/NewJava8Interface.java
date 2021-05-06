package eg_java;

public interface NewJava8Interface {
    default void helloDefault(){
        System.out.println("Default methods with definations can be written from Java8 within interface");
    }
    public static void helloStatic(){
        System.out.println("Hello Static from Java8 within interfaces");
    }
}
