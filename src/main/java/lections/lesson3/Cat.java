package lections.lesson3;

import java.util.Random;

public class Cat {

    final String name;
    int age;
    int weight;
    static int count = 0;
    final static String DESCRIPTION;

    static {
        DESCRIPTION = "Кот";
    }

    Cat(Cat otherCat) {
        this(otherCat.name, otherCat.age, otherCat.weight);
    }

    Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        count++;
        printCount();
        this.voice();
    }

    Cat(int age, int weight) {
        this("Безымянный кот", age, weight);
    }


    void voice() {
        System.out.println("Мяу");
    }

    void sayMyName() {
        System.out.println(name);
    }

    static void printCount() {
        System.out.println("Текущее количество котов: " + count);
    }

    static Cat generateRandomCat() {
        String name = "Случайное имя " + new Random().nextInt(100);
        int age = new Random().nextInt(20);
        int weight = new Random().nextInt(10);
        Cat cat = new Cat(name, age, weight);
        return cat;
    }

    static Cat[] generateRandomCats(int amount) {
        Cat[] cats = new Cat[amount];
        for (int i = 0; i < amount; i++) {
            cats[i] = generateRandomCat();
        }
        return cats;
    }

    @Override
    protected void finalize() throws Throwable {
        // Есть вероятность, что будет вызван этот метод, когда сборщик мусора удалит этот объект
    }
}
