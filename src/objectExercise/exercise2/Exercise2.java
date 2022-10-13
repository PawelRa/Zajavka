package objectExercise.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
//        Function function1 = new HalfCalculator();
//        Function function2 = new QuarterCalculator();
//        System.out.println(function1.calculate(10));
//        System.out.println(function2.calculate(10));

        Function[] functionArray = new Function[10];
        functionArray[0] = new HalfCalculator();
        functionArray[1] = new QuarterCalculator();
        functionArray[2] = new HalfCalculator();
        functionArray[3] = new QuarterCalculator();
        functionArray[4] = new HalfCalculator();
        functionArray[5] = new QuarterCalculator();
        functionArray[6] = new HalfCalculator();
        functionArray[7] = new QuarterCalculator();
        functionArray[8] = new HalfCalculator();
        functionArray[9] = new QuarterCalculator();

        int result = 0;
        for (Function function : functionArray) {
            result += function.calculate(100);
        }
        System.out.println(result);
    }
}
