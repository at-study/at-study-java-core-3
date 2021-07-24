package lections.lesson10faq;

public class Human {
    private String name;
    private int age;

    private Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Human createHuman(String name, int age) {
        if (name.matches("^[А-Я][а-я]+$")) {
            return new Human(name, age);
        }
        throw new InvalidNameException();
    }
}
