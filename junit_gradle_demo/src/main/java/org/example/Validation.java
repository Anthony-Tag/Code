package org.example;
public class Validation {
    public boolean isPrimeNumber(int n) {
        int c=0;
        boolean b=false;
        for(int i=1;i<=n;i++){
            if (n%i==0){
                c++;
            }
        }
        if(c==2){
            b=true;
        }
        return b;
    }
    public boolean isValidContactNumber(String contact){
        boolean b=false;
        if(contact!=null && contact.matches("\\+1-[0-9]{10}")){
            b=true;
        }
        return b;
    }

}
