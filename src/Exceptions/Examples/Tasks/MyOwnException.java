package Exceptions.Examples.Tasks;

public class MyOwnException extends Exception {
    public MyOwnException() {
        super("MyOwnException called");
    }

    public MyOwnException(String message) {
        super(message);
    }
}
