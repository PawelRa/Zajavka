package objectExercise.exercise4;

public abstract class Person {
    private final String name;
    private final String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    protected String getName() {
        return name;
    }

    protected String getSurname() {
        return surname;
    }
}
