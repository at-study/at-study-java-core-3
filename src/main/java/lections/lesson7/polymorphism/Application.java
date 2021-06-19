package lections.lesson7.polymorphism;

public class Application {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Bird chicken = new Chicken();
        chicken.fly();
    }

}
