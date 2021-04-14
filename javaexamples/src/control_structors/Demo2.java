package control_structors;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Printing even numbers between 1 to 50");
        for (int i=0; i<50; i++){
            if (i%2 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        System.out.println("Printing prime numbers between 1 to 50");
        for (int i=0; i<50; i++){
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    public static boolean isPrime(int i){
        int count = 0;
        for (int j=1; j<=i; j++) {
            if (i%j==0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
