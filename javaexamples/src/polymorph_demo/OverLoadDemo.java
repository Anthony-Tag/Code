package polymorph_demo;

import java.awt.*;

public class OverLoadDemo {
    public static void main(String[] args) {
        Calculator c =new Calculator();
        System.out.println(c.add(22, 33));
        System.out.println(c.add(22.45f, 22f));
    }
}
