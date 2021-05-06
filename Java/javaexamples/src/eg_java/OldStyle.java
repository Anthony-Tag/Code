package eg_java;

public class OldStyle implements  MyFunctional{
    @Override
    public void hello() {
        System.out.println("Hello from old style");
    }

    public static void main(String[] args) {
        MyFunctional n=new OldStyle();
        n.hello();
    }
}
