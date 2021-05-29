package lections.lesson5.checked_exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class ParseDateExample {

    public static void main(String[] args) {
        System.out.println(parse("25.03.2021"));
        System.out.println(parse("11-04-1991"));
        System.out.println(parse("11_04_1991"));
    }

    public static Date parse(String input) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = sdf.parse(input);
            System.out.println("Дата успешно распарсена");
            return date;
        } catch (ParseException exception) {
            try {
                Date date = sdf2.parse(input);
                System.out.println("Дата успешно распарсена (2 попытка)");
                return date;
            } catch (ParseException exception2) {
                System.out.println("Неверный формат даты " + input);
                return null;
            } finally {
                System.out.println("Преобразование даты завершено (2 попытка)");
            }
        } finally {
            System.out.println("Преобразование даты завершено");
        }
    }

    public static LocalDate parseLocalDate(String input) {
        try {
            return LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException exception) {
            throw new RuntimeException(exception);
        }
    }
}
