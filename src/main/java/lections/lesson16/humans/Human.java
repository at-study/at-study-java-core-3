package lections.lesson16.humans;

import java.util.Random;

public class Human {

    private String firstName;
    private int age;

    private Human() {
        this("Иван", new Random().nextInt(25));
    }

    public Human(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    private String getFirstName() {
        return firstName;
    }

    private void greet() {
        System.out.println("Привет, меня зовут " + firstName + ", мне " + age + " лет");
    }

    private void say(String text, int number) {
        System.out.println(text + number);
    }

}
