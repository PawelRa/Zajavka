package staticDef.exercises;

import static staticDef.exercises.Global.GLOBAL_CONSTANT;

public class Main {
    public static void main(String[] args) {
exercise2();
    }

    private static void exercise1() {
        String globalConstant = GLOBAL_CONSTANT;
        String globakConstant2 = GLOBAL_CONSTANT;
    }

    private static void exercise2(){
        Static static1 = new Static("Static1");
        System.out.println("Static name " + static1.getName() + ", counter = " + Static.getCounter());
        Static static2 = new Static("Static2");
        System.out.println("Static name " + static2.getName() + ", counter = " + Static.getCounter());
        Static static3 = new Static("Static3");
        System.out.println("Static name " + static3.getName() + ", counter = " + Static.getCounter());
        Static static4 = new Static("Static4");
        System.out.println("Static name " + static4.getName() + ", counter = " + Static.getCounter());
        Static static5 = new Static("Static5");
        System.out.println("Static name " + static5.getName() + ", counter = " + Static.getCounter());
    }
}