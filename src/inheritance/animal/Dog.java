package inheritance.animal;

public class Dog extends Animal{
    private String name;

    public Dog(String name, String color) {
        super(color);
        this.name = name;
    }
}
