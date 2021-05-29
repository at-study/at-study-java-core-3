package lections.lesson5.checked_exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsExample {

    public static void main(String[] args) throws ParseException {
        String input = "22-04.1988";
        System.out.println(a(input));
    }

    private static Date a(String input) throws ParseException {
        return b(input);
    }

    private static Date b(String input) throws ParseException {
        return parse(input);
    }

    private static Date parse(String input) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.parse(input);
    }

}
