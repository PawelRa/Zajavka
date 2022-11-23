package Exceptions.Examples.Constructors;

public class InvalidAnimalNameException extends Exception {
    public InvalidAnimalNameException(String message) {
        super(message);
    }
}
