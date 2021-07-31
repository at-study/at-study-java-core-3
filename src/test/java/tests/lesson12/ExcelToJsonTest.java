package tests.lesson12;

import java.util.List;

import org.junit.jupiter.api.Test;

import lections.lesson11.excel.Excel;
import lections.lesson11.excel.Human;
import lections.lesson11.json.JsonUtils;

public class ExcelToJsonTest {

    @Test
    public void excelToJsonTest() {
        List<Human> persons = Excel.readHumansFromExcelFile("src/main/java/homework_task/lesson11/persons.xlsx");
        String json = JsonUtils.serialize(persons);
        System.out.println(json);
    }
}
