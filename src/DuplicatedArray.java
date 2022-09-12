import java.util.ArrayList;
import java.util.List;

public class DuplicatedArray {
    public static void main(String[] args) {
//        DuplicatedArray.isDuplicated(2, new int[]{2, 5, 6, 7, 4, 2, 1, 8, 3, 9});
        DuplicatedArray.newDuplicatedArray(new int[]{-1, 2, 5, 19, -2, -1, 3, -5, 4, 2, -19, -3, 3, 5, -5, 4, 19, -1, 0, 2, -2, 3, -5, 0});
    }

    private static boolean isDuplicated(int number, int[] intsArray) {
        int iterValue = 0;
        for (int i = 0; i < intsArray.length; i++) {
            if (intsArray[i] == number) {
                iterValue++;
            }
            if (iterValue > 1) {
                return true;
            }
        }
        return false;
    }

    private static void newDuplicatedArray(int[] intsArray) {
        List<Integer> newList = new ArrayList<>();
        for (int number : intsArray) {
            if ((isDuplicated(number, intsArray)) && !(newList.contains(number))) {
                newList.add(number);
            }
        }
        System.out.println("Lista duplikatów = " + newList);
    }

}
