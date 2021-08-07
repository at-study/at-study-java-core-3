package lections.lesson13.flyable;

public class AnonApplication {

    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.flyUp();
        bird.flyDown();
        flyAirplane();
    }

    private static void flyAirplane() {
        Flyable airplane = new Flyable() {
            private int speed;

            @Override
            public void flyUp() {
                System.out.println("Самолет взлетает, максимальная скорость: 900");
            }

            @Override
            public void flyDown() {
                System.out.println("Самолет садится, максимальная скорость: 900");
            }

            public void customFly() {

            }
        };
        Bird chicken = new Bird() {
            @Override
            public void flyUp() {
                throw new IllegalStateException("Курица летать не умеет");
            }

            @Override
            public void flyDown() {
                throw new IllegalStateException("Курица летать не умеет");
            }
        };

        Bird bird1 = new Bird() {};
        Bird bird2 = new Bird() {};

        boolean areClassesEquals = bird1.getClass().equals(bird2.getClass());

        airplane.flyUp();
        airplane.flyDown();
        chicken.flyUp();
    }

}
