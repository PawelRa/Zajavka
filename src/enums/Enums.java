package enums;

public class Enums {
    public static void main(String[] args) {
        Volkswagen volkswagen = Volkswagen.GOLF;
//        System.out.println(volkswagen);

        if (Volkswagen.ARTEON.equals(volkswagen)){
            System.out.println("My car is Arteon");
        } else {
            System.out.println("My car is not Arteon");
        }

        Volkswagen volkswagenMethod = getEnum();
        switch (volkswagenMethod){
            case ARTEON:
            case PASSAT:
                System.out.println("Passat or Arteon");
                break;
            case GOLF:
                System.out.println("Golf");
                break;
            case TIGUAN:
            case TOUAREG:
                System.out.println("Isn't it a SUV car?");
                break;
        }

    }

    private static Volkswagen getEnum() {
        return Volkswagen.GOLF;
    }


}
