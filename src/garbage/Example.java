package garbage;

public class Example {
    public static void main(String[] args) {
        Cat cat = new Cat("Zenek");
        Cat cat2 = new Cat("Tomasz");
        Owner owner = new Owner(cat);
        cat.setOwner(owner);
//        cat = new Cat("Stefan");

        cat = null;
        cat2 = null;
        owner = null;
//        Runtime.getRuntime().gc();
        Example example = new Example();
        example.method();
        System.gc();
    }



    private void method() {
        Cat cat = new Cat("Rob");
        System.out.println(cat);
        method1();
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
