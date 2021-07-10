package lections.lesson10.dog_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import lections.lesson9.xml_task.Dog;

public class DogFileOperations {

    public static Dog readDog() {
        // Прочитать файл
        // Преобразовать в строку
        // Создать объект и вернуть его.
        try {
            byte[] content = Files.readAllBytes(Paths.get("src/main/java/lections/lesson10/dog.txt"));
            String xml = new String(content);
            return new Dog(xml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveDog(Dog dog) {
        // Получить XML из собаки.
        // Получить массив байт из XML
        // Записать в файл.
        try {
            String xml = dog.toXml();
            byte[] content = xml.getBytes();
            Files.write(Paths.get("src/main/java/lections/lesson10/dog.txt"), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
