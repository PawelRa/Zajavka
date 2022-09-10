public class ReverseString {
    public static void main(String[] args) {
        reverse("testowy tekst");
    }

    private static void reverse (String string) {
        String[] arrayTemp = string.split("");
        String result = "";
        for (int i = (arrayTemp.length)-1; i >= 0; i--) {
            result += arrayTemp[i] ;
        }
        System.out.println(result);
    }
}
