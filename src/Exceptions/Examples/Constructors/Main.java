package Exceptions.Examples.Constructors;

public class Main {
    public static void main(String[] args) {
        try {
            Animal animal = new Rat("Zbyszek");
        } catch (InvalidAnimalNameException e) {
            e.printStackTrace();
        }
    }
}
