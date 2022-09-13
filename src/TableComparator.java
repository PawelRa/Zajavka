import java.util.Arrays;

public class TableComparator {
    public static void main(String[] args) {
        TableComparator.areArraysTheSame(new int[]{2, 6, 12, 1}, new int[]{1, 2, 6, 12});
        TableComparator.areArraysTheSame(new int[]{2, 6, 12, 1}, new int[]{1, 2, 6});
        TableComparator.areArraysTheSame(new int[]{2, 6, 12, 1}, new int[]{1, 2, 7, 12});
        TableComparator.areArraysTheSame(
                new int[]{-1, 2, 5, 19, -2, -1, 3, -5, 4, 2, -19, -3, 3, 5, -5, 4, 19, -1, 0, 2, -2, 3, -5, 0},
                new int[]{-1, 2, 5, 19, -2, -1, 3, -5, 4, 2, -19, -3, 3, 5, -5, 4, 19, -1, 0, 2, -2, 3, -5, -0});
    }

    private static boolean areArraysTheSame(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            int[] sortedArray1 = Arrays.stream(array1).sorted().toArray();
            int[] sortedArray2 = Arrays.stream(array2).sorted().toArray();
            for (int i = 0; i < array1.length; i++) {
                if (sortedArray1[i] != sortedArray2[i]) {
                    System.out.println("Zawartość tablic jest różna");
                    return false;
                }
            }
            System.out.println("Zawartość tablic jest taka sama");
            return true;
        }
        System.out.println("Zawartość tablic jest różna");
        return false;
    }
}
