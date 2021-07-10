package lections.lesson10.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OldFileApplication {

    public static void main(String[] args) {
        // Чтение из файла
        File file = new File("src/main/java/lections/lesson10/sample.txt");
        byte[] content;
        try (InputStream is = new FileInputStream(file)) {
            int size = is.available();
            content = new byte[size];
            is.read(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String fileContent = new String(content);
        System.out.println(fileContent);

        String replacedString = fileContent.replace("\r\n", " ");
        System.out.println(replacedString);

        // Запись в файл
        File outputFile = new File("src/main/java/lections/lesson10/output.txt");
        try (OutputStream os = new FileOutputStream(outputFile, true)) {
            byte[] outputContent = replacedString.getBytes();
            os.write(outputContent);
            os.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
