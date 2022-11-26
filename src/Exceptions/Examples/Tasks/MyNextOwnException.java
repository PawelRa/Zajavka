package Exceptions.Examples.Tasks;

public class MyNextOwnException extends MyOwnException {
    public MyNextOwnException() {
        super("MyNextOwnException called");
    }

    public MyNextOwnException(String message) {
        super(message);
    }
}
