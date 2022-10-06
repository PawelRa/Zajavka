package polymorphism;

public class Car {
    protected String color;

    private Engine engine = new Engine();

    public Car(String color) {
        this.color = color;
    }

    public void describe() {
        System.out.println("Car color: " + color);
    }
}
