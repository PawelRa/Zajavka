package inheritance.animal;

public class Dog extends Animal{
    protected String name;

    public Dog(String name, String color) {
        super(color);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
