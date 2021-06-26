package lections.lesson8.animals;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            animals.add(AnimalFactory.getRandomAnimal());
        }

        Animal animal = animals.get(2);
        animal.voice();

        int catsCount = 0;
        int dogsCount = 0;
        int lionsCount = 0;
        int homeAnimalsCount = 0;
        int wildAnimalsCount = 0;
        for (Animal current : animals) {
            if (current instanceof Cat) {
                catsCount++;
            }
            if (current instanceof Dog) {
                dogsCount++;
            }
            if (current instanceof Lion) {
                lionsCount++;
            }
            if (current instanceof HomeAnimal) {
                homeAnimalsCount++;
            }
            if (current instanceof WildAnimal) {
                wildAnimalsCount++;
            }
        }
        System.out.println("Количество котов: " + catsCount);
        System.out.println("Количество собак: " + dogsCount);
        System.out.println("Количество львов: " + lionsCount);
        System.out.println("Количество домашних животных: " + homeAnimalsCount);
        System.out.println("Количество диких животных: " + wildAnimalsCount);

        List<HomeAnimal> homeAnimals = new ArrayList<>();
        for (Animal current : animals) {
            if (current instanceof HomeAnimal) {
                homeAnimals.add((HomeAnimal) current);
            }
        }

    }
}
