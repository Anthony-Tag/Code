package custom_exception;

public class ValidationMain {
    public static void main(String[] args) {
        Validation v=new Validation();
        try {
            if (v.isValidMobileNumber("+1-1234567890")){
                System.out.println("validated");
            }

        }catch (InvalidMobileNumberException e){
            System.out.println(e.getMessage());
        }

    }
}
