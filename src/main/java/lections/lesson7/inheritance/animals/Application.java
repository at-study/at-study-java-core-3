package lections.lesson7.inheritance.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            animals.add(getRandomAnimal());
        }

        Animal first = animals.get(0);
        Cat cat = (Cat) first;
        // cat.voice();


        Dog dog1 = new Dog("Шарик", 3);
        Dog dog2 = new Dog("Шарик", 3);
        System.out.println(dog1.equals(dog2));

    }

    public static Animal getRandomAnimal() {
        return new Random().nextBoolean()
                ? new Dog("Случайная собака", 1)
                : new Cat("Случайная кошка", 2);
    }
}
