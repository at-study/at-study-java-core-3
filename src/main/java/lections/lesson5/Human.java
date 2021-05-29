package lections.lesson5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import lections.lesson5.custom_exceptions.IllegalNameException;
import lections.lesson5.custom_exceptions.NegativeAgeException;
import lections.lesson5.custom_exceptions.TooHighAgeException;
import lections.lesson5.custom_exceptions.ZeroAgeException;

public class Human {

    private String name;
    private int age;
    private LocalDate birthDate;

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setName(String name) throws IllegalNameException {
        Objects.requireNonNull(name, "Имя не может быть null");
        if (name.matches("^[А-Я][а-я]{2,}$")) { //   АВЫОТАцоатцоу, АВта, АВТОУАап,
            this.name = name;
        } else {
            throw new IllegalNameException("Имя должно начинаться с большой буквы и быть не менее 3 символов");
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new NegativeAgeException();
        }
        if (age == 0) {
            throw new ZeroAgeException();
        }
        if (age > 150) {
            throw new TooHighAgeException();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greet() {
        System.out.printf("Привет, меня зовут %s, мой возраст %d лет, моя дата рождения: %s%n", name, age, birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }

}
