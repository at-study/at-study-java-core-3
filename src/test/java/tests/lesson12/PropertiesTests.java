package tests.lesson12;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lections.lesson11.json.JsonUtils;
import lections.lesson12.properties.PropertyUtils;

public class PropertiesTests {

    @Test
    public void fileNotFoundTest() {
        try {
            PropertyUtils.getJsonObjectFromPropertiesFile("C:/afasfasfsa.properties");
            Assertions.fail();
        } catch (RuntimeException e) {
            Assertions.assertEquals(RuntimeException.class, e.getClass());
            Assertions.assertEquals(FileNotFoundException.class, e.getCause().getClass());
        }
    }
    
    @Test
    public void propertiesToJsonObjectTest() {
        final String PATH = "src/main/resources/application.properties";
        String json = PropertyUtils.getJsonObjectFromPropertiesFile(PATH);

        TestPropertyModel expectedObject = new TestPropertyModel();
        TestPropertyModel actualObject = JsonUtils.deserialize(json, TestPropertyModel.class);

        Assertions.assertEquals(expectedObject, actualObject);
    }
}
