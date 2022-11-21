package Exceptions.Examples;

import java.io.IOException;

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

        Car car = new Car();

        try {
            car.driveNotReally(20);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (DriverToYoungException ed) {
            System.out.println(ed.getMessage());
        }

    }

    public static void exceptionalMethod() throws Exception {
        throw new Exception("My exception message");
    }
}
