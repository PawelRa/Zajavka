import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsOfNumbers {
    public static void main(String[] args) {
        PairsOfNumbers.pairs(4, new int[]{-1, 2, 5, 19, -2, -1, 3, -5, 4, 2, -19, -3, 3, 5, -5, 4, 19, -1, 0, 2, -2, 3, -5, 0});
    }

    private static void pairs (int value, int[] array) {
        for (int i=0; i< array.length; i++) {
            for (int j=i+1; j<array.length;j++) {
                if (i==j) {
                    continue;
                }
                if (array[i] + array[j] == value) {
                    System.out.println("Suma " + array[i] + " i " + array[j] + " = " + value);
                }
            }
        }
    }
}
