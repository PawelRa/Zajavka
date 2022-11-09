package staticDef.exercises;

public class Exercise4 {
    public static void main(String[] args) {
        exercise4();
    }

    private static void exercise4() {
        char[] arr = signsCreator(1, 68, 120, 87, 219, 34, 39, 1234, 47);
    }

    private static char[] signsCreator(int... args) {
        char[] chars = new char[args.length - calculateNotHandledCases(args)];
        castToChar(chars, args);
        return chars;
    }

    private static void castToChar(char[] chars, int[] args) {
        int j = 0;
        for (int arg : args) {
            if (arg >= 33 && arg <= 127) {
                chars[j] = (char) arg;
                j++;
            }
        }
    }

    private static int calculateNotHandledCases(int[] args) {
        int notHandledCases = 0;
        for (int arg : args) {
            if (arg < 33 || arg > 127) {
                System.out.println("Case: " + arg + " not handled");
                notHandledCases++;
            }
        }
        return notHandledCases;
    }
}
