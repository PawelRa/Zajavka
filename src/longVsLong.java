public class longVsLong {
    public static void main(String[] args) {
        Long sum = 0L; //13s
//        long sum = 0L; //3s
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
