package lections.lesson6.enums;

import java.time.LocalDate;

public enum Season {
    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето", LocalDate.of(2020, 6, 1), LocalDate.of(2020, 8, 31)),
    AUTUMN("Осень");

    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    Season(String description) {
        this.description = description;
    }

    Season(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }
}
