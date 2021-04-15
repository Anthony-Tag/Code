package set_demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("hello");
        hs.add("hello");
        hs.add("hey");
        hs.add("java");
        hs.add("jee");
        hs.add("jse");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        Set<String> lhs=new LinkedHashSet<>();
        lhs.add("hello");
        lhs.add("hello");
        lhs.add("hey");
        lhs.add("java");
        lhs.add("jee");
        lhs.add("jse");
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);

        Set<String> ts=new TreeSet<>();
        ts.add("hello");
        ts.add("hello");
        ts.add("hey");
        ts.add("java");
        ts.add("jee");
        ts.add("jse");
//        ts.add(null);
//        ts.add(null);
        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.contains("hey"));
        System.out.println(ts.contains("heyaa"));
    }
}
