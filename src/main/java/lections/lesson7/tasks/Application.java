package lections.lesson7.tasks;

import java.util.List;

import lections.lesson7.inheritance.animals.Animal;

import static lections.lesson7.inheritance.animals.Application.getRandomAnimal;

public class Application {

    public static void main(String[] args) {
        List<Animal> animals = new AnimalList<>();
        animals.add(getRandomAnimal());
        animals.add(getRandomAnimal());
        animals.add(getRandomAnimal());

        Animal animal = animals.get(1);

    }
}
