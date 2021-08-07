package lections.lesson13.flyable;

public class Application {

    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.flyUp();
        bird.flyDown();
        flyAirplane();
    }

    private static void flyAirplane() {
        class Airplane implements Flyable {
            private int speed;

            public Airplane(int speed) {
                this.speed = speed;
            }

            @Override
            public void flyUp() {
                System.out.println("Самолет взлетает, максимальная скорость: " + speed);
            }

            @Override
            public void flyDown() {
                System.out.println("Самолет садится, максимальная скорость: " + speed);
            }
        }
        Airplane airplane1 = new Airplane(900);
        airplane1.flyUp();
        airplane1.flyDown();
        Airplane airplane2 = new Airplane(1100);
        airplane2.flyUp();
        airplane2.flyDown();
    }

}
