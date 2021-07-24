package tests.lesson11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import lections.lesson11.StringContainer;
import lections.lesson11.excel.Excel;
import lections.lesson11.excel.Human;
import lections.lesson11.json.JsonUtils;
import lections.lesson11.json.id.Id;
import lections.lesson3.Cat;

public class JsonTests {

    @Test
    public void serializationTest() {
        Human human = new Human("Иванов", "Валерий", "Петрович", LocalDate.of(1990, Month.JANUARY, 15), "4444", "555555");
        String json = new Gson().toJson(human);
        Assertions.assertEquals(
                "{\"lastName\":\"Иванов\",\"firstName\":\"Валерий\",\"patronymic\":\"Петрович\",\"birthDate\":{\"year\":1990,\"month\":1,\"day\":15},\"series\":\"4444\",\"number\":\"555555\"}",
                json
        );
    }

    @Test
    public void deserializationTest() {
        String json = "{\"lastName\":\"Иванов\",\"firstName\":\"Валерий\",\"patronymic\":\"Петрович\",\"birthDate\":{\"year\":1990,\"month\":1,\"day\":15},\"series\":\"4444\",\"number\":\"555555\"}";
        Human human = new Gson().fromJson(json, Human.class);

        Assertions.assertNotNull(human);
        Assertions.assertEquals("Иванов", human.getLastName());
        Assertions.assertEquals("Валерий", human.getFirstName());
        Assertions.assertEquals("Петрович", human.getPatronymic());
        Assertions.assertEquals(LocalDate.of(1990, Month.JANUARY, 15), human.getBirthDate());
        Assertions.assertEquals("4444", human.getSeries());
        Assertions.assertEquals("555555", human.getNumber());
    }

    @Test
    public void listSerializationTest() {
        List<Human> persons = Excel.readFirstThreeHumanFromExcelFile("src/main/java/homework_task/lesson11/persons.xlsx");
        String json = new Gson().toJson(persons);
        System.out.println(json);
    }

    @Test
    public void specificDeserializationTest() {
        String json = "{\n" +
                "\"lastName\": \"Иванов\",\n" +
                "\"firstName\": \"Владимир\",\n" +
                "\"patronymic\": \"Михайлович\",\n" +
                "\"birthDate\": \"14.01.1990\",\n" +
                "\"series\": \"4510\",\n" +
                "\"number\": \"155442\"\n" +
                "\t}";
        Human human = JsonUtils.deserialize(json, Human.class);

        Assertions.assertNotNull(human);
        Assertions.assertEquals("Иванов", human.getLastName());
        Assertions.assertEquals("Владимир", human.getFirstName());
        Assertions.assertEquals("Михайлович", human.getPatronymic());
        Assertions.assertEquals(LocalDate.of(1990, Month.JANUARY, 14), human.getBirthDate());
        Assertions.assertEquals("4510", human.getSeries());
        Assertions.assertEquals("155442", human.getNumber());

        System.out.println(JsonUtils.serialize(human));
    }

    @Test
    public void collectionJsonExampleTest() {
        StringContainer container = new StringContainer();
        String json = JsonUtils.serialize(container);

        StringContainer deserialized = JsonUtils.deserialize(json, StringContainer.class);

        Map<String, Object> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", "строка");
        map.put("third", null);
        map.put("fourth", new Cat("Васька", 5, 4));

        System.out.println(JsonUtils.serialize(map));
    }

    @Test
    public void idDeserializationTest() throws IOException {
        String path = "src/main/java/lections/lesson11/json/id/id.json";
        List<String> content = Files.readAllLines(Paths.get(path));
        String json = String.join("", content);
        Id id = JsonUtils.deserialize(json, Id.class);

        Assertions.assertNotNull(id);
        Assertions.assertNotNull(id.getFirstName());
        Assertions.assertNotNull(id.getPassport());
        Assertions.assertNotNull(id.getLiveAddress());
        Assertions.assertNull(id.getRegistration());

        Assertions.assertEquals("value1", id.getFirstName());

        Assertions.assertEquals("5400", id.getPassport().getSeria());
        Assertions.assertEquals("123000", id.getPassport().getNumber());

        Assertions.assertEquals("ул.Мясницкая", id.getLiveAddress().getStreet());
        Assertions.assertEquals(15, id.getLiveAddress().getHouseNumber());
        Assertions.assertEquals(268, id.getLiveAddress().getFlatNumber());

    }
}
