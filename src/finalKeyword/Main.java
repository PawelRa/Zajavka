package finalKeyword;

public class Main {
    public static void main(String[] args) {
        final Car car = new Car("red");
        System.out.println(car);
//        car = new Car("blue");
        car.setColor("orange");
        describe(car);
        System.out.println(car);
        String a = "Hello world!";
        a.replace("world", "karol"); //klasa String jest niemutowalna / niezmienialna
        System.out.println(a);
        String replaced = a.replace("world!", "karol");
        System.out.println(replaced);
    }

    private static void describe(final Car car) {
//        car = new Car("yellow"); //niemożliwe w efekcie użycia final
        car.setColor("green");
    }
}
