package lections.lesson10.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NewFileApplication {

    public static void main(String... args) {
        Path path = Paths.get("src/main/java/lections/lesson10/sampl.txt");
        // byte[] content = Files.readAllBytes(path);
        try {
            List<String> content = Files.readAllLines(path);
            String stringContent = String.join("\r\n", content);
            System.out.println(stringContent);

            String replaced = stringContent.replace("\r\n", " ");
            Path outputPath = Paths.get("src/main/java/lections/lesson10/output.txt");
            byte[] outputContent = replaced.getBytes();
            Files.write(outputPath, outputContent, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
