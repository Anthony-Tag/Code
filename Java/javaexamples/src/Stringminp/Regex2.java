package Stringminp;

public class Regex2 {
    public static void main(String[] args) {
        //xxxx-xx-xxx-xxxx x-digit for the x where the length is 4 the first thing should be uppercase letter
        String s = "A123-22-111-Z000";
        if (s.matches("[A-Z]{1}[0-9]{3}-[0-9]{2}-[0-9]{3}-[A-Z]{1}[0-9]{3}")){
            System.out.println("Validated");
        }else{
            System.out.println("Not validated");
        }

        //build SSN,phone number
        String SSN = "123-45-6789";
        if (SSN.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
            System.out.println("correct");
        }

        String phonNum1 = "1-989-123-4567";
        String phonNum2 = "9891234567";
        String phonNum3 = "123344535g";

        System.out.println("phone 1 is "+isPhoneNumber(phonNum1));
        System.out.println("phone 2 is "+isPhoneNumber(phonNum2));
        System.out.println("phone 3 is "+isPhoneNumber(phonNum3));

    }
    public static boolean isPhoneNumber(String x) {
        x = x.replaceAll("[-]", "");

        if (x.matches("[0-9]{10}")){
            return true;
        }else if (x.matches("[0-9]{11}")){
            return true;
        }else {
            return false;
        }

    }
}
