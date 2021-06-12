package lections.lesson6.enums;

import java.util.Objects;

public enum DayType {
    WORKING,
    DAY_OFF;

    public static DayType getDayType(DayOfWeek dayOfWeek) {
        Objects.requireNonNull(dayOfWeek, "Day of week can't be null");
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return WORKING;
            case SATURDAY:
            case SUNDAY:
                return DAY_OFF;
        }
        return null;
    }
}
