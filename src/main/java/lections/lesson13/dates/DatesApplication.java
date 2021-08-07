package lections.lesson13.dates;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static java.time.format.DateTimeFormatter.ofPattern;

public class DatesApplication {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "22.08.1991",
                "21.08.1991",
                "22.08.1992",
                "18.04.1980",
                "16.07.2002",
                "14.11.1999",
                "17.01.2003"
        );

        strings.sort((o1, o2) -> {
            LocalDate d1 = LocalDate.parse(o1, ofPattern("dd.MM.yyyy"));
            LocalDate d2 = LocalDate.parse(o2, ofPattern("dd.MM.yyyy"));
            return d2.compareTo(d1);
        });


        System.out.println(strings);
    }
}
