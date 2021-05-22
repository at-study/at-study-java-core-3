package lections.lesson4.dates.current;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateApplication {

    public static void main(String[] args) {

        // LocalDate - класс для работы с датами
        // LocalDateTime - класс для работы с датами и временем

        LocalDate date = LocalDate.now(); // Текущая дата
        LocalDateTime dateTime = LocalDateTime.now(); // Текущая дата и время

        // Относительная и абсолютная даты:
        LocalDate preset = LocalDate.of(2021, 12, 1);
        LocalDate based = LocalDate.now()
                .minusYears(1).plusDays(5).plusMonths(2);
        System.out.println(based);


        String basedAsString = based.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String isoDate = based.format(DateTimeFormatter.ISO_ORDINAL_DATE);

        String dateString = "03.04.1999";
        LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println(parsedDate);

        int length = 1_000_000;
        Human[] humans = new Human[length];
        LocalDateTime before = LocalDateTime.now();
        for (int i = 0; i < length; i++) {
            humans[i] = new Human("", "", LocalDate.now());
        }
        LocalDateTime after = LocalDateTime.now();
        long time = ChronoUnit.MILLIS.between(before, after);
        System.out.printf("Time taken: %d ms%n", time);

        // Сравнение дат / дат со временем
        parsedDate.isAfter(parsedDate);
        parsedDate.isBefore(parsedDate);

        long count = getSecondsAmountBetweenTwoDates("07.11.2021", "09.11.2021");
        System.out.println(count);

        String source = "2021-12-01"; // yyyy-MM-dd;
        String destination = formatDate(source, "yyyy-MM-dd", "dd.MM.yyyy");
        System.out.println(destination); // "01.12.2021"
    }

    public static String formatDate(String sourceDate, String sourcePattern, String destinationPattern) {
        final DateTimeFormatter SOURCE_FORMATTER = DateTimeFormatter.ofPattern(sourcePattern);
        final DateTimeFormatter DESTINATION_FORMATTER = DateTimeFormatter.ofPattern(destinationPattern);
        LocalDate date = LocalDate.parse(sourceDate, SOURCE_FORMATTER);
        String result = date.format(DESTINATION_FORMATTER);
        return result;
    }

    public static long getSecondsAmountBetweenTwoDates(String start, String end) {
        final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime startDate = LocalDate.parse(start, FORMATTER).atStartOfDay();
        LocalDateTime endDate = LocalDate.parse(end, FORMATTER).atStartOfDay();
        return ChronoUnit.SECONDS.between(startDate, endDate);
    }

}
