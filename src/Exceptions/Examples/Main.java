package Exceptions.Examples;

public class Main {
    public static void main(String[] args) {
        Driver andrzej = new Driver(36);
        Driver ryszard = new Driver(16);

        try {
        andrzej.setAge(37);
        ryszard.setAge(17);}
        catch (DriverToYoungException e){
            System.out.println(e.getMessage() );
        }
//        try {
//            ryszard.setAge(17);
//            andrzej.setAge(37);
//        } catch (DrivingException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            exceptionalMethod();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }

    public static void exceptionalMethod() throws Exception {
        throw new Exception("My exception message");
    }
}
