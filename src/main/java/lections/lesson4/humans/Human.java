package lections.lesson4.humans;

import java.util.Objects;

public class Human {

    private String name;
    private int age;

    private Human() {
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "Имя не может быть null");
        if (name.matches("^[А-Я][а-я]{2,}$")) {
            this.name = name;
        } else {
            System.out.println("Имя должно начинаться с большой буквы и быть не менее 3 символов");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть положительным");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greet() {
        System.out.printf("Привет, меня зовут %s, мой возраст %d лет%n", name, age);
    }

    public static Human createHuman() {
        return new Human();
    }

}
