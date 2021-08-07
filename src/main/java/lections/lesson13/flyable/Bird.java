package lections.lesson13.flyable;

public class Bird implements Flyable {
    @Override
    public void flyUp() {
        System.out.println("птица взлетает");
    }

    @Override
    public void flyDown() {
        System.out.println("птица садится");
    }
}
