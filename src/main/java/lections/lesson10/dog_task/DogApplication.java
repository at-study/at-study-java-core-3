package lections.lesson10.dog_task;

import lections.lesson9.xml_task.Dog;

public class DogApplication {

    public static void main(String[] args) {
        Dog dog = DogFileOperations.readDog();
        System.out.println(dog);

        dog.incrementAge();

        DogFileOperations.saveDog(dog);
    }
}
