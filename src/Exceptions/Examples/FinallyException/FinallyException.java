package Exceptions.Examples.FinallyException;

public class FinallyException {
    public static void main(String[] args) {
        try {
            print1();
        } catch (MyException1 e) {
            System.out.println("Catching myExceptin1");
            System.exit(0);
            throw new MyException2("Throwing myException2");
        } finally {
            System.out.println("calling finally");
            try {
                throw new MyException1("finally myException1");
            } catch (MyException1 myException1) {
                myException1.printStackTrace();
            }
        }
    }

    private static void print1() throws MyException1 {

        System.out.println("print1");
        throw new MyException1("Throwing MyException1");
    }

    private static void print2() {
        System.out.println("print1");
        throw new MyException2("Throwing MyException2");
    }
}
