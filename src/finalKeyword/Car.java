package finalKeyword;

//public class Car {
//public final class Car { //powoduje, że nie da się klasy rozszerzyć
public class Car {
//    private final String color;
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    protected final void describe() {
//        System.out.println("I'm describing my Car");
//    }

//    public final abstract void describe(); final i abstract nie mogą wystąpić jednocześnie gdyż dają sprzeczny efekt

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
