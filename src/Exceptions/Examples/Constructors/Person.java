package Exceptions.Examples.Constructors;

public class Person {
    private int age;

    public Person(int age)throws WrongAgeException {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
////            throw new RuntimeException("What is this dude?");
//            try {
                throw new WrongAgeException("What is this dude?");
//            } catch (WrongAgeException e) {
//                this.age = 0;
//            }
        }
    }
    public void someMethod() throws WrongAgeException {

    }
}
