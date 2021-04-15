package interfaces_demo;

public class Implementor implements MyInterface1, MyInterface2{
    @Override
    public void method1() {
        System.out.println("method1() form MyInterface1");
    }

    @Override
    public void method2() {
        System.out.println("method2() form MyInterface1");
    }

    @Override
    public void method3() {
        System.out.println("method3() form MyInterface1");
    }

    @Override
    public void common() {

    }

    @Override
    public void hello1() {

    }

    @Override
    public void hello2() {

    }

    @Override
    public void hello3() {

    }
}
