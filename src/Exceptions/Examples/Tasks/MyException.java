package Exceptions.Examples.Tasks;

public class MyException extends Exception{
    public MyException() {
        super("My exception");
    }

    public MyException(String message) {
        super(message);
    }
}
