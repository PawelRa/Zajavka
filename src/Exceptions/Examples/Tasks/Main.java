package Exceptions.Examples.Tasks;

public class Main {
    public static void main(String[] args) {
//        Exercises1 exercises1 = new Exercises1();
//        try {
//            exercises1.exceptionThrowing();
//        } catch (MyException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Exercise1 finally");
//        }

        Exercise2 exercise2 = new Exercise2();
        try {
            exercise2.ageValidator(20);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }

    }


}
