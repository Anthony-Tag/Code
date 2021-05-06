package custom_exception;

public class Validation {
    public boolean isValidMobileNumber(String contact){
        if(contact.matches("\\+1-[0-9]{10}")){
            throw new InvalidMobileNumberException("Entered mobile number " + contact+ " is invvalid");
        }else{
            return true;
        }
    }
    public boolean isValidAge(int age){
        if (age<19 || age > 33){
            throw new InvalidAgeException("Only users with age between 19 and 33 are allowed");
        }
        return true;
    }
}
