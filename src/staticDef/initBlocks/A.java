package staticDef.initBlocks;

public class A {
    static String staticField1ClassA;
    static String staticField2ClassA = initStaticField2ClassA();
    private String nonStaticField1ClassA;
    private String nonStaticField2ClassA;
    private String nonStaticField3ClassA = initField3ClassA();

    static {
        System.out.println("staticField2ClassA2");
        staticField1ClassA = "staticField1ClassA";
    }

    {
        nonStaticField2ClassA = "nonStaticField2ClassA";
        staticField1ClassA = "staticField1ClassA";
    }

    public A(String nonStaticField1ClassA) {
        this.nonStaticField1ClassA = nonStaticField1ClassA;
    }

    private String initField3ClassA() {
        System.out.println("initField3ClassA");
        return "initField3ClassA";
    }
    private static String initStaticField2ClassA() {
        System.out.println("initStaticField2ClassA");
        return "initStaticField2ClassA";
    }
}
