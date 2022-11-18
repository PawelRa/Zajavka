package Exceptions.Examples;

public class Driver {
    private int age;

    public Driver(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//    public void setAge(int age) throws  DrivingException{
        if (age < 18) {
            throw new DriverToYoungException("You cannot drive below 18. Provided " + age + " years.");
        }
        System.out.println("Setting driver's age to " + age);
        this.age = age;
    }
}
