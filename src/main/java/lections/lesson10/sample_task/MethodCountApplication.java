package lections.lesson10.sample_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MethodCountApplication {
    private static final String PATTERN = "^.* .+ .+\\(.*\\) \\{$";

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/main/java/lections/lesson10/Sample.java");
        List<String> content = Files.readAllLines(filePath);
        int methodCount = 0;
        for (String line : content) {
            if (line.matches(PATTERN)) {
                methodCount++;
            }
        }
        System.out.println("Количество методов в Sample.java: " + methodCount);
    }

}
