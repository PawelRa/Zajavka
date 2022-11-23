package Exceptions.Examples.Constructors;

//public class InvalidAnimalNameException extends Exception {
public class InvalidAnimalNameException extends RuntimeException {
    public InvalidAnimalNameException(String message) {
        super(message);
    }
}
