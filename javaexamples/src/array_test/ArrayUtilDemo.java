package array_test;

import java.util.Arrays;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int ar[] = {12,11,33,113,4,5,67,9,9,123,1,3};
        System.out.println(ar);
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int ar1[]= Arrays.copyOf(ar,ar.length+5);
        System.out.println(Arrays.toString(ar1));
    }
}
