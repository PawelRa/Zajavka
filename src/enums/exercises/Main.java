package enums.exercises;

public class Main {
    public static void main(String[] args) {
//        Day[] days = Day.values();
//        for (Day day : days) {
//            System.out.println(day + " Is working day?: " + day.isWorkingDay() + " Is weekend?: " + day.isWeekend());
//        }
//        exercise1();
//        System.out.println("-----------------------");
        exercise2();
    }


    private static void exercise1() {
        Day sunday = Day.valueOf("SUNDAY");
        for (Day day : Day.values()) {
            System.out.println(day + " Is working day?: " + day.isWorkingDay() + " Is weekend?: " + day.isWeekend());
        }
    }

    private static void exercise2() {
        Dance hiphop = Dance.HIPHOP;
        System.out.println(hiphop + ": possible hours: "
                + hiphop.getHours() + ", days: "
                + hiphop.getDays() + ", alternative: "
                + hiphop.getAlternative()
        );
        Dance irish = Dance.IRISH;
        System.out.println(irish + ": possible hours: "
                + irish.getHours() + ", days: "
                + irish.getDays() + ", alternative: "
                + irish.getAlternative()
        );
    }
}
