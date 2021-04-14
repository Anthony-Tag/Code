package array_test;

public class Demo1 {
    public static void main(String[] args) {
        int ar[]= {12,23,4,1,3,4,1,4,4,5};
        System.out.println(ar[3]);
        System.out.println("accessing using foreach");
        for (int a:ar){
            System.out.print(a+ " ");
        }
        System.out.println("\nAccessing using normal for loop");
        for (int i =0; i < ar.length; i++){
            if (ar[i]%2 ==0){
                ar[i] = -1;
            }
            System.out.print(ar[i] + " ");
        }


    }
}
