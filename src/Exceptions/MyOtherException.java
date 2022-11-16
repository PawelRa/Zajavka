package Exceptions;

public class MyOtherException extends RuntimeException {
    public MyOtherException() {
        super("My other exception was thrown");
    }

    public MyOtherException(String message) {
        super(message);
    }

    public MyOtherException(String message, Throwable cause) {
        super(message, cause);
    }
}
