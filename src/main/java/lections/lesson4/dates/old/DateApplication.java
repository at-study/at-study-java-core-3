package lections.lesson4.dates.old;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApplication {

    public static void main(String[] args) throws ParseException {

        // Конструктор без параметров = текущая дата (текущий момент времени)
        Date date = new Date();
        System.out.println(date);

        // 01.01.1970г. + количество миллисекунд, которое указано в параметре
        long d = 900_000_000_000L;
        Date presetDate = new Date(d);
        System.out.println(presetDate);

        // SimpleDateFormat - класс для работы с датами/строками
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
        Date parsedDate = sdf.parse("2021-08-11");
        String formattedString = sdf.format(presetDate);

        System.out.println(parsedDate);
        System.out.println(formattedString);


        int length = 1_000_000;
        Human[] humans = new Human[length];
        long before = new Date().getTime();
        for (int i = 0; i < length; i++) {
            humans[i] = new Human("", "", new Date());
        }
        long after = new Date().getTime();
        System.out.printf("Time taken: %d ms%n", after - before);

        long count = getSecondsAmountBetweenTwoDates("07.11.2021", "09.11.2021");
        System.out.println(count);

        String source = "2021-12-01"; // yyyy-MM-dd;
        String destination = formatDate(source, "yyyy-MM-dd", "dd.MM.yyyy");
        System.out.println(destination); // "01.12.2021"

        Date date1 = new Date();
        Date date2 = new Date();

        // Сравнение 2 дат:
        boolean bool1 = date1.before(date2); // true, если date1 ДО date2
        boolean bool2 = date1.after(date2);  // true, если date1 ПОСЛЕ date2

    }

    public static String formatDate(String sourceDate, String sourcePattern, String destinationPattern)
            throws ParseException {
        final SimpleDateFormat SOURCE_FORMATTER = new SimpleDateFormat(sourcePattern);
        final SimpleDateFormat DESTINATION_FORMATTER = new SimpleDateFormat(destinationPattern);

        Date date = SOURCE_FORMATTER.parse(sourceDate);
        return DESTINATION_FORMATTER.format(date);
    }

    public static long getSecondsAmountBetweenTwoDates(String start, String end) throws ParseException {
        final SimpleDateFormat SDF = new SimpleDateFormat("dd.MM.yyyy");
        Date startDate = SDF.parse(start);
        Date endDate = SDF.parse(end);
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        return (endTime - startTime) / 1000;
    }
}
