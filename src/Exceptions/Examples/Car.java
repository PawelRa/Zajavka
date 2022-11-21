package Exceptions.Examples;

import java.io.IOException;

public class Car extends Vehicle{
    @Override
    public void drive() throws NullPointerException{
        System.out.println("Driving.");
    }
    public void driveNotReally() throws Exception{
        System.out.println("....");
    }

    public void driveNotReally(int i) throws IOException, DriverToYoungException{
        System.out.println("....");
    }
}
