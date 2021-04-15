package custom_exception;

public class InvalidMobileNumberException extends RuntimeException{
    public InvalidMobileNumberException() {

    }

    public InvalidMobileNumberException(final String Message) {
        super(Message);
    }
}
