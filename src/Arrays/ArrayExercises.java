package Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
//        System.out.println(reverseString("testowy tekst"));
        System.out.println(palindrome("nowy tekst"));
        System.out.println(palindrome("Kobyła ma mały bok"));

    }

    private static String reverseString(String string) {
        String[] arrayTemp = string.split("");
        String result = "";
        for (int i = (arrayTemp.length) - 1; i >= 0; i--) {
            result += arrayTemp[i];
        }
        return result;
    }

    private static String palindrome(String text){
        String temp = text.trim().toLowerCase().replace(" ","");

        if (temp.equals(reverseString(temp))) {
            return "tekst \"" + text + "\" jest palindromem";
        } else {
            return "tekst \"" + text + "\" NIE jest palindromem";
        }
    }

}
