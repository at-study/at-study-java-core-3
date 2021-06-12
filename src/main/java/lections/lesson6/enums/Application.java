package lections.lesson6.enums;

public class Application {

    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek tuesday = DayOfWeek.TUESDAY;

        DayOfWeek otherMonday = DayOfWeek.MONDAY;

        boolean isEqual = (monday == otherMonday);

        // Возвращает объект enum-а из строки:
        DayOfWeek weekDay = DayOfWeek.valueOf("WEDNESDAY");

        // Все объекты enum:
        DayOfWeek[] allDays = DayOfWeek.values();

        //
        int index = weekDay.ordinal();
        index = DayOfWeek.WEDNESDAY.ordinal();
        String name = weekDay.name();

        DayType working = DayType.getDayType(DayOfWeek.FRIDAY);
        DayType dayOff = DayType.getDayType(DayOfWeek.SATURDAY);

        // DayType nullDayType = DayType.getDayType(null);

        Season summer = Season.SUMMER;
        System.out.println(summer.getDescription());

    }

}
