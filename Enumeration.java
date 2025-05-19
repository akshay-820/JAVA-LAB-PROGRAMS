public class Enumeration {

    public enum DayOfWeek {
        SATURDAY,
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY;

        public boolean isWorkDay() {
            return this != SATURDAY && this != SUNDAY;
        }
    }

    public static void main(String[] args) {
        System.out.println(DayOfWeek.MONDAY.isWorkDay()); // true
        System.out.println(DayOfWeek.SUNDAY.isWorkDay()); // false
    }
}
