package list_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(100,"TV", 199.99, 3.1f, 5));
        productList.add(new Product(120,"TV", 149.99, 4.1f, 0));
        productList.add(new Product(134,"TV", 190, 3.4f, 10));
        productList.add(new Product(111,"TV", 100, 3.7f, 15));
        productList.add(new Product(104,"TV", 210.50, 4.3f, 25));
        printProductList(productList);
        Collections.sort(productList);

        System.out.println("Sorted List");
        printProductList(productList);

        Collections.sort(productList,(p1,p2)->{
            Float f1=p1.getRating();
            Float f2=p2.getRating();
            return f2.compareTo(f1);
        });

        System.out.println("sorted by rating");
        printProductList(productList);

        Collections.sort(productList,(p1,p2)->{
            Double d1=p1.getCost();
            Double d2=p2.getCost();
            int x=d1.compareTo(d2);
            if (x==0){
                Float f1 = p1.getRating();
                Float f2 = p2.getRating();
                return f2.compareTo(f1);
            }else{
                return x;
            }
        });

        System.out.println("sorted by price with higher rating");
        printProductList(productList);
    }
    public static void printProductList(List<Product> productList){
        for (Product p:productList){
            System.out.println(p);
        }
    }
}
