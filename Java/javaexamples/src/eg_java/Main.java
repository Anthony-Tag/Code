package eg_java;

public class Main implements NewJava8Interface{
    public static void main(String[] args) {
        NewJava8Interface n=new Main();
        n.helloDefault();
        NewJava8Interface.helloStatic();
    }
}
