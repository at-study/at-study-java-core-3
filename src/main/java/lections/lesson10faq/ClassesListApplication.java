package lections.lesson10faq;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ClassesListApplication {

    public static void main(String[] args) {
        File directory = new File("src/main/java/lections/lesson8");
        File[] files = directory.listFiles();
        for (File file : files) {
            extractAndPrintClassSignature(file);
        }
    }

    private static void extractAndPrintClassSignature(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                extractAndPrintClassSignature(file1);
            }
        } else {
            try {
                List<String> content = Files.readAllLines(file.toPath());
                String classSignature = getClassSignature(content);
                System.out.println(classSignature);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static String getClassSignature(List<String> content) {
        for (String line : content) {
            if (line.endsWith("{")) {
                return line;
            }
        }
        throw new IllegalStateException("No class signature in list");
    }


}
