package Exceptions.Examples.Constructors;

public class ConstructorExamplesExceptions {
    private long parametr;

//    public ConstructorExamplesExceptions(long parametr) {
//        if (parametr > 0 && parametr < 10) {
//            this.parametr = parametr;
//        } else {
//            throw new RuntimeException("What is this dude?");
//        }
//    }

    public static void main(String[] args) {
//        ConstructorExamplesExceptions examplesExceptions = new ConstructorExamplesExceptions(10);
        try {
            Person person = new Person(1000);
        } catch (WrongAgeException e) {
//            e.printStackTrace();
            System.out.println("Błąd");
        }

        try {
            Person person = new Man(500);
        } catch (WrongAgeException e) {
            System.out.println("Men");;
        }
    }
}
