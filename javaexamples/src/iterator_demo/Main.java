package iterator_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hs=new HashMap<>();
        hs.put(12, "Joe");
        hs.put(120, "Java");
        hs.put(14, null);
        hs.put(142, "Joe");
        hs.put(122, null);
        hs.put(312, "Joe");
        hs.put(null, "Jave");
        hs.put(129, null);
        hs.put(212, "Joe");
        //Key is null or value is null or key is mutiples of 10

        System.out.println("Before Deletion");
        System.out.println(hs);

//        for (Map.Entry<Integer, String> e:hs.entrySet()){
//            if (e.getKey()==null || e.getValue() ==null ||e.getKey()%10 == 0){
//                hs.remove(e.getKey());
//            }
//        }
        Iterator<Map.Entry<Integer, String>> i=hs.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry<Integer, String> e=i.next();
            if (e.getKey()==null || e.getValue() ==null ||e.getKey()%10 == 0){
                i.remove();
            }
        }
        System.out.println("After Deletion");
        System.out.println(hs);
        //Enumerator ->read operation from top to bottom
            //Iterator -> read and remove from top to bottom
            //ListIterator -> applicable only ion List interface, can traverse both the side and can do read, add and remove
    }
}
