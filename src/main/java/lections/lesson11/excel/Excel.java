package lections.lesson11.excel;

// Создать метод, принимающий в качестве параметра строку, содержащую путь к файлу Excel.
//
// Метод должен открыть данный файл, прочитать 3 первых строки с данными человека,
// сформировать из них список List<Human> и вернуть его в качестве результата метода

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

    public static List<Human> readFirstThreeHumanFromExcelFile(String path) {
        Workbook workbook = openExcelFile(path);
        Sheet sheet = workbook.getSheet("Persons1");
        List<Row> rows = getThreeRowsFromSheet(sheet);
        return convertRowsToHumans(rows);
    }

    private static Workbook openExcelFile(String path) {
        try {
            FileInputStream file = new FileInputStream(new File(path));
            return new XSSFWorkbook(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Row> getThreeRowsFromSheet(Sheet sheet) {
        List<Row> rows = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Row row = sheet.getRow(i);
            rows.add(row);
        }
        return rows;
    }

    private static List<Human> convertRowsToHumans(List<Row> rows) {
        List<Human> persons = new ArrayList<>();
        for (Row row : rows) {
            Human person = convertRowToHuman(row);
            persons.add(person);
        }
        return persons;
    }

    private static Human convertRowToHuman(Row row) {
        String lastName = row.getCell(0).getStringCellValue();
        String firstName = row.getCell(1).getStringCellValue();
        String patronymic = row.getCell(2).getStringCellValue();
        String birthDateAsString = row.getCell(3).getStringCellValue();
        LocalDate birthDate = LocalDate.parse(birthDateAsString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String series = row.getCell(4).getStringCellValue();
        String number = row.getCell(5).getStringCellValue();
        return new Human(lastName, firstName, patronymic, birthDate, series, number);
    }
}
