package lections.lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    private static class Human implements Comparable<Human> {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Human other) {
            return this.name.compareTo(other.name);
        }
    }

    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Иван", 15));
        humans.add(new Human("Алексей", 13));
        humans.add(new Human("Михаил", 12));
        humans.add(new Human("Владимир", 17));
        Collections.sort(humans);
        for (Human human : humans) {
            System.out.println("name: " + human.name + ", age: " + human.age);
        }
    }

    private static List<Human> getHumans() {
        return Collections.emptyList();
    }

}
