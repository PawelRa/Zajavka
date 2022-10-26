package staticDef;

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
    }
}
