package Exceptions.Examples.Tasks;

public class Exercise2 {
    private int age;

    private static void wraper() {

    }

    private static void exercise2() {
        wraper();
    }

    public void ageValidator(int age) throws MyException {
        if (age < 21) {
            throw new MyException("Age is below 21");
        }
    }
}
