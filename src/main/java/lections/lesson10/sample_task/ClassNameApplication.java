package lections.lesson10.sample_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ClassNameApplication {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src/main/java/lections/lesson10/Sample.java");
        List<String> content = Files.readAllLines(filePath);
        String classSignature = getClassSignature(content);
        String className = extractClassName(classSignature);

        System.out.println(className);
    }

    private static String getClassSignature(List<String> content) {
        for (String line : content) {
            if (line.contains("class")) {
                return line;
            }
        }
        throw new IllegalStateException("No class signature in file");
    }

    private static String extractClassName(String classSignature) {
        String[] split = classSignature.split(" ");
        List<String> signatureElements = Arrays.asList(split);
        int classIndex = signatureElements.indexOf("class");
        if (classIndex == -1) {
            throw new IllegalStateException("No class matching in line");
        }
        return signatureElements.get(classIndex + 1);
    }

}
