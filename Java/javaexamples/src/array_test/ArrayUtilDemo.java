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
        //binarySearch -> perrequiste for binarysearch is-> the array should and must be sorted in ascending order only

        System.out.println(Arrays.binarySearch(ar, 555));
        System.out.println(Arrays.binarySearch(ar, 9));

    }
    // Like public version, but without range checks.
    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}
