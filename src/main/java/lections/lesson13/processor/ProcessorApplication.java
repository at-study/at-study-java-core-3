package lections.lesson13.processor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import lections.lesson8.animals.Cat;

public class ProcessorApplication {
    public static void main(String[] args) {
        UnaryProcessor<String> stringConcatenator =
                (str1, str2) -> str1 + str2;

        Processor<String, Integer, Boolean> stringLengthValidator =
                (str, len) -> str.length() == len;

        Processor<String, Integer, Cat> catGenerator = Cat::new;

        Set<Integer> numbers = new TreeSet<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(5);
            add(8);
        }};
        List<String> words = Arrays.asList("Пятница", "это", "лучший", "день", "недели");

        Processor<Set<Integer>, List<String>, Map<Integer, String>> mapCreator =
                (keys, values) -> {
                    if (keys.size() != values.size()) {
                        throw new IllegalArgumentException("Set size differs from List size");
                    }
                    Map<Integer, String> result = new TreeMap<>();
                    int index = 0;
                    for (Integer key : keys) {
                        result.put(key, values.get(index++));
                    }
                    return result;
                };

        Object o = mapCreator.process(numbers, words);

        System.out.println(stringConcatenator.process("Hello", "World"));
        System.out.println(stringLengthValidator.process("Hello World", 11));
        System.out.println(stringLengthValidator.process("Hello World", 12));
    }
}
