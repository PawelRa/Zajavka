package inheritance.animal;

public class Labrador extends Dog{
    public Labrador(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return "Labrador{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
