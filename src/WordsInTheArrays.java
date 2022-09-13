import java.util.Arrays;

public class WordsInTheArrays {
    public static void main(String[] args) {
        WordsInTheArrays.sizeLettersChanger(new String[]{"Ola", "ma", "koTA", "a", "kot", "ma", "OLE"});
    }

    private static void sizeLettersChanger(String[] array) {
        for (int i=0; i < array.length; i++){
            String result = "";
            for (int j=0; j<array[i].length();j++) {
                char temp;
                if (j == 0 ) {
                temp = Character.toUpperCase(array[i].charAt(0));
                }else {
                temp = Character.toLowerCase(array[i].charAt(j));
                }
                result += temp;
            }
            array[i] = result;
        }
        System.out.println(Arrays.toString(array));
    }

}
