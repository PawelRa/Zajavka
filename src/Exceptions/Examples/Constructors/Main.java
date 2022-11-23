package Exceptions.Examples.Constructors;

public class Main {
    public static void main(String[] args) {
        try {
            Animal animal2 = new Rat(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Animal animal = new Rat("Zbyszek");


//        try {
//            Animal animal = new Rat("Zbyszek");
//        } catch (InvalidAnimalNameException e) {
//            e.printStackTrace();
//        }
    }
}
