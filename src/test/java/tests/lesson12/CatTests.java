package tests.lesson12;

import org.junit.jupiter.api.Test;

import lections.lesson11.json.JsonUtils;
import lections.lesson12.inheritance.Animal;
import lections.lesson12.inheritance.Cat;

public class CatTests {

    @Test
    public void catSerializationTest() {
        Animal cat = new Cat("Барсик", 3, 4);
        String json = JsonUtils.serialize(cat);
        System.out.println(json);

        String catAsJson = "{\n" +
                "\t\"name\": \"Мурзик\",\n" +
                "\t\"weight\": 4\n" +
                "}";
        Cat deserializedCat = JsonUtils.deserialize(catAsJson, Cat.class);
    }

}
