package staticDef;

import static staticDef.B.CONST;

public class StaticExamples {
    public static void main(String[] args) {
        Dog dog1 = new Dog("burek");
        System.out.println("Dog1 static: " + dog1.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog1: " + dog1.howManyDogWeHaveInOurProgram);
        Dog dog2 = new Dog("azor");
        System.out.println("Dog2 static: " + dog2.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog2: " + dog2.howManyDogWeHaveInOurProgram);
        System.out.println("Dog1 static: " + dog1.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog1: " + dog1.howManyDogWeHaveInOurProgram);
        Dog dog3 = new Dog("szczekacz");
        System.out.println("Dog3 static: " + Dog.howManyDogsWeHaveInOurProgram); //odwołanie do pola statycznego przez klasę
        System.out.println("Dog3 : " + dog3.howManyDogWeHaveInOurProgram);
        System.out.println("Dog2 static: " + Dog.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog2 : " + dog2.howManyDogWeHaveInOurProgram);
        System.out.println("Dog static1: " + Dog.howManyDogsWeHaveInOurProgram);
        System.out.println("Dog1 : " + dog1.howManyDogWeHaveInOurProgram);
        System.out.println("----------------");
//        Dog.staticExample();
        System.out.println(dog1.staticExample());
        System.out.println(Dog.staticExample()); //odwołanie do metody statycznej przez klasę
        System.out.println("----------------");
        System.out.println("Dog number of legs: " + Dog.NUMBER_OF_LEGS);
        System.out.println("----------------");
        System.out.println("----------------");
        Car car1 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        Car car2 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        Car car3 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        Car car4 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        Car car5 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);

        System.out.println("----------------");
        System.out.println(car1.numberOfCarsCreated);
        System.out.println(car2.numberOfCarsCreated);
        System.out.println(car3.numberOfCarsCreated);
        System.out.println(car4.numberOfCarsCreated);
        System.out.println(car5.numberOfCarsCreated);
        System.out.println("----------------");
        System.out.println("----------------");
        B b = new B();
        b.printB();


        A ab = new B();
        ab.print();
//        a.printB();

        C c = new C();
        c.print();

        A ac = new C();
        ac.print();

//        System.out.println(B.CONST);
        System.out.println(CONST);
    }
}
