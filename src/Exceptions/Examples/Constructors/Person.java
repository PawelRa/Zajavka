package Exceptions.Examples.Constructors;

public class Person {
    private int age;

    {
        this.age = 12;
        System.out.println("Init block start");
        if (age == 12) {
            try {
                throw new WrongAgeException("Block what is this dude?");
            } catch (WrongAgeException e) {
                e.printStackTrace();
            } catch (ExceptionInInitializerError err) {
                System.out.println("Złpałem ERROR!");
            }
        } else {
            System.out.println("Valid age in init block");
        }
        System.out.println("Init block end");
    }

    public Person(int age) throws WrongAgeException {
        System.out.println("Person constructor begining");
        if (age > 0 && age < 120) {
            this.age = age;
            System.out.println("Person constructor being fine");
        } else {
////            throw new RuntimeException("What is this dude?");
//            try {
            System.out.println("Person constructor throwing exception");
            throw new WrongAgeException("What is this dude?");
//            } catch (WrongAgeException e) {
//                this.age = 0;
//            }
        }
        System.out.println("Person constructor ending");
    }

    public void someMethod() throws WrongAgeException {

    }
}
