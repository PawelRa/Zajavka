package staticDef;

public class Dog extends Animal {
    public static final int NUMBER_OF_LEGS = 4; //stałą
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
