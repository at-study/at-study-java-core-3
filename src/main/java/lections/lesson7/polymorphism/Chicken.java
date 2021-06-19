package lections.lesson7.polymorphism;

public class Chicken extends Bird {

    @Override
    public void fly() {
        throw new IllegalStateException("Курица летать не умеет!");
    }

}
