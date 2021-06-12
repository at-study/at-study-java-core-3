package lections.lesson6.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import lections.lesson3.Cat;
import lections.lesson6.enums.DayOfWeek;

public class Application {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        // Добавление элементов:
        list.add("А");
        list.add("Б");
        list.add("В");
        System.out.println(list);
        list.add(2, "Г");
        list.add(2, "Г");
        System.out.println(list);
        list.set(1, "Д");
        System.out.println(list);
        list.remove("Г");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        boolean isEmpty = list.isEmpty();
        int size = list.size();
        int index = list.indexOf("Д");
        boolean contains = list.contains("Д");

        String element = list.get(1);

        for (String current : list) {
            System.out.println(current);
        }

        Integer[] ints = {1, 2, 3, 4, 5, 6};
        List<Integer> integers = Arrays.asList(ints);
        List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);

        List<DayOfWeek> days = Arrays.asList(DayOfWeek.values());
        List<DayOfWeek> days2 = Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.FRIDAY, DayOfWeek.MONDAY);


        Cat cat1 = new Cat("Барсик", 3, 2);
        Cat cat2 = new Cat("Барсик", 3, 2);
        Cat cat3 = new Cat("Мурзик", 3, 2);
        Cat cat4 = new Cat("Пушок", 3, 2);
        Cat cat5 = new Cat("Еще один кот", 3, 2);

        boolean areCatsEqual = cat1.equals(cat2);
        System.out.println(areCatsEqual);

        List<Cat> cats = new ArrayList<>();
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
    }

}
