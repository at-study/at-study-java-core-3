package tests.lesson11;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lections.lesson11.excel.Excel;
import lections.lesson11.excel.Human;

//Иванов	Владимир	Михайлович	14.01.1990	4510	155442
//Петров	Михаил	Валерьевич	12.06.1984	4511	523533
//Васильев	Валерий	Александрович	17.12.1991	4512	325235
public class PersonExcelTests {

    @Test
    @DisplayName("Тестирование чтения 3 человек из excel-файла")
    public void readThreePersonsTest() {
        List<Human> persons = Excel.readFirstThreeHumansFromExcelFile("src/main/java/homework_task/lesson11/persons.xlsx");

        Assertions.assertNotNull(persons);
        Assertions.assertEquals(3, persons.size());

        Human first = persons.get(0);
        Assertions.assertNotNull(first);
        Assertions.assertEquals("Иванов", first.getLastName());
        Assertions.assertEquals("Владимир", first.getFirstName());
        Assertions.assertEquals("Михайлович", first.getPatronymic());
        Assertions.assertEquals(
                LocalDate.of(1990, Month.JANUARY, 14),
                first.getBirthDate()
        );
        Assertions.assertEquals("4510", first.getSeries());
        Assertions.assertEquals("155442", first.getNumber());

        Human second = persons.get(1);
        Assertions.assertNotNull(first);
        Assertions.assertEquals("Петров", second.getLastName());
        Assertions.assertEquals("Михаил", second.getFirstName());
        Assertions.assertEquals("Валерьевич", second.getPatronymic());
        Assertions.assertEquals(
                LocalDate.of(1984, Month.JUNE, 12),
                second.getBirthDate()
        );
        Assertions.assertEquals("4511", second.getSeries());
        Assertions.assertEquals("523533", second.getNumber());
    }

}
