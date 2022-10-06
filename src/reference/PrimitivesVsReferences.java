package reference;

public class PrimitivesVsReferences {
    public static void main(String[] args) {
        Cat cat = new Cat("Andrzej");
        System.out.println(cat);
        passByReferenceOrPassByValue(cat);
        System.out.println(cat);

        int i = 10;
        System.out.println(i);
        passByReferenceOrPassByValue(i);
        System.out.println(i);
    }

    private static void passByReferenceOrPassByValue(Cat anotherReferenceToCat) {
        System.out.println("inside method 1: " + anotherReferenceToCat);
        anotherReferenceToCat = new Cat("Rafał");
//        anotherReferenceToCat.setName("Rafał"); //Użycie settera spowoduje zmianę stanu obiektu
        System.out.println("inside method 2: " + anotherReferenceToCat);
    }

    private static void passByReferenceOrPassByValue(int i) {
        System.out.println("inside method 1: " + i);
        i = 20;
        System.out.println("inside method 2: " + i);
    }
}
