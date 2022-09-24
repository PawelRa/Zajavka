package inheritance;

import inheritance.animal.Animal;
import inheritance.animal.Cat;
import inheritance.animal.Labrador;

public class InheritanceExample {
    public static void main(String[] args) {
//        Cat cat = new Cat("white", "mruczek");
//        System.out.println(cat.toString());
        Animal animal1 = new Animal(1, "mruczek");
        Animal animal2 = new Animal(2, "burek");
        Labrador labrador1 = new Labrador("labladudel", "white");

//        System.out.println(animal1);
//        System.out.println(animal2);
        System.out.println(labrador1);

    }
}
