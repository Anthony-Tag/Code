package map_demo;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Map<Integer, String> m=new HashMap<>();
        m.put(1000,"Jane");
        System.out.println(m);
        //System.out.println("updated");
        m.put(1000,"jane Update");
        //System.out.println(m);
        m.put(null,"Jay");
        m.put(390,"Jay");
        m.put(190, "Jay");
        m.put(595, null);
        m.put(900,null);
        m.put(2908, "Dimesh");
        m.put(684, "dam");
        System.out.println(m);

        Map<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put(1000,"Jane");
        System.out.println(lhm);
        //System.out.println("updated");
        lhm.put(1000,"jane Update");
        //System.out.println(lhm);
        lhm.put(null,"Jay");
        lhm.put(390,"Jay");
        lhm.put(190, "Jay");
        lhm.put(595, null);
        lhm.put(900,null);
        lhm.put(2908, "Dimesh");
        lhm.put(684, "dam");
        System.out.println(lhm);

        Map<Integer, String> tm=new TreeMap<>();
        tm.put(1000,"Jane");
        System.out.println(tm);
        //System.out.println("updated");
        tm.put(1000,"jane Update");
        //System.out.println(tm);
        //tm.put(null,"Jay");
        tm.put(390,"Jay");
        tm.put(190, "Jay");
        tm.put(595, null);
        tm.put(900,null);
        tm.put(2908, "Dimesh");
        tm.put(684, "dam");
        System.out.println(m);

        Map<Integer, String> ht=new Hashtable<>();
        ht.put(1000,"Jane");
        System.out.println(ht);
        //System.out.println("updated");
        ht.put(1000,"jane Update");
        //System.out.println(lhm);
        //ht.put(null,"Jay");
        ht.put(390,"Jay");
        ht.put(190, "Jay");
        //ht.put(595, null);
        //ht.put(900,null);
        ht.put(2908, "Dimesh");
        ht.put(684, "dam");
        System.out.println(ht);

        System.out.println(ht.size());
        System.out.println(ht.get(1000));
        System.out.println(ht.get(12));

        System.out.println(ht.containsKey(900));
        System.out.println(ht.containsValue("Jay"));

        System.out.println(ht.keySet());
        System.out.println(ht.values());

        Set<Integer> set=ht.keySet();
        for (Integer i:set){
            System.out.println("Key is : "+i+" Value is : "+ht.get(i));
        }
        System.out.println("\nTraversing using Enter entrySet()");
        for (Map.Entry<Integer,String> e:ht.entrySet()){
            System.out.println("Hey -> "+e.getKey()+" Value ->"+e.getValue()); }
    }
}
