package enums;

import java.util.Arrays;

public class Enums {
    public static void main(String[] args) {
//        Volkswagen volkswagen = Volkswagen.GOLF;
//        System.out.println(volkswagen);

//        if (Volkswagen.ARTEON.equals(volkswagen)){
//            System.out.println("My car is Arteon");
//        } else {
//            System.out.println("My car is not Arteon");
//        }
//
//        Volkswagen volkswagenMethod = getEnum();
//        switch (volkswagenMethod){
//            case ARTEON:
//            case PASSAT:
//                System.out.println("Passat or Arteon");
//                break;
//            case GOLF:
//                System.out.println("Golf");
//                break;
//            case TIGUAN:
//            case TOUAREG:
//                System.out.println("Isn't it a SUV car?");
//                break;
//        }

//        Volkswagen volkswagen = Volkswagen.GOLF;
//        System.out.println(volkswagen.getColors());
////        System.out.println(Volkswagen.TIGUAN.getColors());
////        System.out.println(Volkswagen.TIGUAN.getProductionYear());
//        volkswagen.setColors("brown");
//        System.out.println(volkswagen.getColors());
//        System.out.println("------------------");
//        System.out.println(Volkswagen.GOLF.getColors());
//        Volkswagen.GOLF.setColors("yellow");
//        System.out.println(Volkswagen.GOLF.getColors());
//        System.out.println("------------------");
//        System.out.println(Volkswagen.GOLF);
//
//        //ITEROWANIE PO ELEMENTACH
//        Volkswagen[] values = Volkswagen.values();
//        System.out.println(Arrays.toString(values));
//        for (Volkswagen value : values) {
//            System.out.println(value);
//        }
//        System.out.println("------------------");
//        Volkswagen golf = Volkswagen.valueOf("GOLF");
//        System.out.println(golf);

        System.out.println(Volkswagen.GOLF.doSomething());
        System.out.println(Volkswagen.TIGUAN.doSomething());

        //porónanie dwóch enumów
//        Volkswagen v1 = null;
        Volkswagen v1 = getV1();
        Volkswagen v2 = getV2();
        System.out.println("------------------");
        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));

        System.out.println("------------------");
        System.out.println(v1.ordinal() == 2);

        System.out.println(getV1().name());


    }

    private static Volkswagen getV1() {
        return Volkswagen.TOUAREG;
    }

    private static Volkswagen getV2() {
        return Volkswagen.ARTEON;
    }

//    private static Volkswagen getEnum() {
//        return Volkswagen.GOLF;
//    }


}
