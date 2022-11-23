package Exceptions.Examples.Constructors;
public abstract class Animal {

    private String name;

//    public Animal(String name) throws InvalidAnimalNameException {
    public Animal(String name) {
        if (name == null) {
            throw new InvalidAnimalNameException("Provided name is null.");
        }
        this.name = name;
        System.out.println("Name set to value: " + name);
    }
}
