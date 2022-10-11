package garbage;

public class Example {
    public static void main(String[] args) {
        Cat cat = new Cat("Zenek");
        Owner owner = new Owner(cat);
//        cat = new Cat("Stefan");

        cat = null;
        owner = null;
        System.gc();
        Runtime.getRuntime().gc();
    }

    private void method1() {
        Cat cat = new Cat("Rupert");
        method2();
    }

    private void method2() {
        Cat cat = new Cat("Robert");
        method3();
    }

    private void method3() {
        System.out.println("method3");
    }

}
