package staticDef;

public class Dog extends Animal {
    private String name;
    public static int howManyDogsWeHaveInOurProgram = 0;
    public int howManyDogWeHaveInOurProgram = 0;

    public Dog(String name) {
        this.name = name;
        howManyDogsWeHaveInOurProgram++;
        this.howManyDogWeHaveInOurProgram++;
    }

    public static String staticExample() {
        return "Static example in Dog";
//        nonStaticExample();
    }

    private void nonStaticExample() {
        System.out.println("Non static example");
        staticExample();
    }
}
