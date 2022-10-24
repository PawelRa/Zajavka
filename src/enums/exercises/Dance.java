package enums.exercises;

import java.util.Arrays;

public enum Dance {
    HIPHOP(new String[]{"12:00", "13:30"}, new Day[]{Day.MONDAY, Day.SUNDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    },
    JAZZ(new String[]{"16:10", "19:20"}, new Day[]{Day.SATURDAY, Day.THURSDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    },
    IRISH(new String[]{"19:20", "20:15"}, new Day[]{Day.MONDAY, Day.WEDNESDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    },
    SWING(new String[]{"18:20", "20:15"}, new Day[]{Day.TUESDAY, Day.THURSDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    },
    BALLET(new String[]{"20:10", "21:00"}, new Day[]{Day.WEDNESDAY, Day.FRIDAY}) {
        @Override
        public Dance getAlternative() {
            return BALLET;
        }
    };

    private final String[] hours;
    private final Day[] days;

    Dance(String[] hours, Day[] days) {
        this.hours = hours;
        this.days = days;
    }

    public String getHours() {
        return Arrays.toString(hours);
    }

    public String getDays() {
        return Arrays.toString(days);
    }

    public abstract Dance getAlternative();
}
