package list_demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List lst=new LinkedList();
        lst.add("hello");
        lst.add(1222);
        lst.add(true);
        lst.add('d');

        System.out.println("List is: "+ lst);

        List<Integer> l1=new ArrayList<>();
        l1.add(12434);
        l1.add(null);
        l1.add(45);
        l1.add(null);
        l1.add(0);
        l1.add(null);

        l1.add(1, 123);
        System.out.println("l1 = "+l1);
        l1.set(3,34);
        System.out.println("l1 = "+l1);
        Integer r =0;
        l1.remove(r);
        System.out.println(l1);
        while (l1.remove(null)){l1.remove(null);}
        System.out.println(l1);
    }
}
