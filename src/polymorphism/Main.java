package polymorphism;

public class Main {
    public static void main(String[] args) {
        Cabriolet cabriolet1 = new Cabriolet("red", true);
        Car cabriolet2 = new Cabriolet("blue", false);
        Object cabriolet3 = new Cabriolet("white", true);

        SUV suv1 = new SUV("yellow", 1.89);
        Car suv2 = new SUV("brown", 1.92);
        Object suv3 = new SUV("black", 1.90);

        cabriolet1.describe();
        System.out.println("------------------");
        cabriolet2.describe();
        System.out.println("------------------");
        suv1.describe();
        System.out.println("------------------");
        suv2.describe();
    }
}
