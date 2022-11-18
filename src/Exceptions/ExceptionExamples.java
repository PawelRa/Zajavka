package Exceptions;

import java.util.Arrays;

public class ExceptionExamples {
    public static void main(String[] args) {
//        String variable = null;
//        variable.toLowerCase();
//        SomeClass variable2 = null;
//        String otherVariable = variable2.someField;

//        String[] array = new String[3];
//        System.out.println(array[10]);

//        SomeClass someClass = null;
//        someClass.printSomething();

//        String[] array = new String[3];
//        try {
//            System.out.println(array[10]);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("print something");

//        try {
//            printSomething("ThRow");
//        } catch (Exception e) {
//            System.out.println("Exception was thrown: " + e.getMessage());
//            e.printStackTrace();
//        }
        try {
            printSomething1("ThRow");
            // przy multucatch idziemy od szczegółu do ogółu
        } catch (MySubSubException | ArrayIndexOutOfBoundsException e) { //przy wyjątkach można stosować lub
//            System.out.println("Exception was thrown: " + e.getMessage());
//            e.printStackTrace();
            System.out.println("MySubSubException cought: " + Arrays.toString(e.getStackTrace()));
        } catch (MySubException e) {
            System.out.println("MySubException cought: " + Arrays.toString(e.getStackTrace()));
        } catch (MyException e) {
            System.out.println("MyException cought: " + Arrays.toString(e.getStackTrace()));
        } catch (Exception e) {
            System.out.println("My cought: " + Arrays.toString(e.getStackTrace()));
        }
    }

    private static void printSomething(final String input) throws MyException {
        if ("Throw".equalsIgnoreCase(input)) {
            throw new MyException();
        } else {
            System.out.println(input);
        }
    }

    //    private static void printSomething4(final String input) {
//        try {
//            printSomething3(input);
//        } catch (MyException e) {
//            throw new MyOtherException("My other exception message", e);
//        }
//    }
    private static void printSomething1(final String input) {
        printSomething2(input);
    }

    private static void printSomething2(final String input) {
        try {
            printSomething3(input);
        } catch (MyException e) {
            throw new MySubException("My other exception message, e");
        }
    }

    private static void printSomething3(final String input) {
        printSomething4(input);
    }

    private static void printSomething4(final String input) {
        if ("Throw".equalsIgnoreCase(input)) {
            throw new MyException("My runtime exception");
        } else {
            System.out.println(input);
        }
    }
}
