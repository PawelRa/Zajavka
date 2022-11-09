package staticDef.exercises;

public class Static {
    private static int counter;
    private final String name;

    static {
        System.out.println("Class created");
    }

    public Static(String name) {
        this.name = name;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }
}
