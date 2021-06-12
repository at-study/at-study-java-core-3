package lections.lesson6.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import homework_solution.lesson11.task3.Generator;
import lections.lesson3.Cat;

public class Application {

    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("строка3");
        strings.add("строка1");
        strings.add("строка5");
        strings.add("строка3");
        strings.remove("строка3");

        for (String current : strings) {
            // System.out.println(current);
        }

        Set<Integer> integers = new TreeSet<>();
        for (int i = 0; i < 30; i++) {
            integers.add(Generator.randomInteger(0, 200));
        }
        for (Integer current : integers) {
            // System.out.println(current);
        }

        Cat cat1 = new Cat("Барсик", 3, 2);
        Cat cat2 = new Cat("Барсик", 3, 2);
        Cat cat3 = new Cat("Мурзик", 3, 2);
        Cat cat4 = new Cat("Пушок", 3, 2);
        Cat cat5 = new Cat("Еще один кот", 3, 2);

        boolean areCatsEqual = cat1.equals(cat2);
        System.out.println(areCatsEqual);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        System.out.println(cats.size());

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next();
            if (cat.getName().equals("Барсик")) {
                iterator.remove();
            }
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
    }

}
