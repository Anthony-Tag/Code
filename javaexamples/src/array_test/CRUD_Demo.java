package array_test;

public class CRUD_Demo {
    public static void main(String[] args) {
        int ar[]= new int[6];
        System.out.println("ar.length = "+ar.length);
        int n=0;
        ar[0]= 100;
        n++;
        ar[1]= 101;
        n++;

        System.out.println("Printing array contexts before insertion");
        for (int i=0; i<n; i++){
            System.out.println(ar[i]+ " ");
        }
        int pos = 3;
        int ele = 1999;
        for (int i=-n; i>pos-1; i--){
            ar[i]=ar[i-1];
        }
        ar[pos-1]= ele;
        n++;
        System.out.println("\nPrinting array contents after insertion");
        for (int i=0; i<n; i++){
            System.out.print(ar[i]  + " ");
        }
        int delpos = 2;
        System.out.println("\nPrinting array contexts before deletion");
        for (int i=0; i<n;i++) {
            System.out.print(ar[i]+ " ");
        }
        for (int i=delpos-1; i<n;i++){
            ar[i]=ar[i+1];
        }
        n--;
        System.out.println("\nPrinting array contents after deletionn");
        for (int i=0; i<n; i++){
            System.out.print(ar[i]  + " ");
        }
    }
}
