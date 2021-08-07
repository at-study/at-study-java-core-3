package lections.lesson13.collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class SetApplication {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(new Random().nextInt(500));
        }
        numbers.removeIf(v -> v <= 200);
        numbers.forEach(x -> System.out.println(x));
    }
}
