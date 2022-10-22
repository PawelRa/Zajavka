package enums.exercises;

public enum Day implements WorkingDay, Weekend{
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THU"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");

    private String shortcut;

    Day(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getShortcut() {
        return shortcut;
    }

    @Override
    public boolean isWeekend() {
//        if ((shortcut == "SAT") || (shortcut == "SUN")){
        return (shortcut == "SAT") || (shortcut == "SUN");
    }

    @Override
    public boolean isWorkingDay() {
//        if (((shortcut != "SAT") && (shortcut != "SUN"))){
        return (shortcut != "SAT") && (shortcut != "SUN");
    }
}
