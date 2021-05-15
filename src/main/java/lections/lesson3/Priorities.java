package lections.lesson3;

public class Priorities {

    static int variable = initInt();

    static {
        System.out.println("Статический блок кода");
    }

    static int initInt() {
        System.out.println("Статический метод");
        return 5;
    }

    Priorities() {
        System.out.println("Конструктор");
    }

    Priorities method() {
        System.out.println("Метод объекта");
        return this;
    }

}
