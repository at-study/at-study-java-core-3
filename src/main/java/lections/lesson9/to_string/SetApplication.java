package lections.lesson9.to_string;

import java.util.Set;
import java.util.TreeSet;

public class SetApplication {

    public static void main(String[] args) {
        Set<Integer> ints = new TreeSet<>();
        ints.add(4);
        ints.add(399);
        ints.add(25);
        System.out.println(ints);

        Set<String> strings = new TreeSet<>();
        strings.add("4");
        strings.add("399");
        strings.add("25");
        System.out.println(strings);
    }

}
