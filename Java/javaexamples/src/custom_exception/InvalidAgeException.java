package custom_exception;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(){

    }
    public InvalidAgeException(final String message){
        super(message);
    }
}
