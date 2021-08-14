package lections.lesson14.streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiApplication {

    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(1, 2, 5, 3, 4, 7, 1, 2, 7, 4, 6, 7, 4);
        int sum = list.stream()
                .distinct()
                .limit(5)
                .reduce(Integer::sum)
                .orElse(0);
        //System.out.println(sum);
        // Посчитать сумму первых пяти уникальных чисел.

        //List<String> content = Files.readAllLines(Paths.get("src/main/resources.file"));
        //Files.lines(Paths.get("src/main/resources.file"));
        String result = "Какая-то строка".chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
