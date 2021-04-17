package lections.lesson1;

public class Room {

    Bed bed;
    Shelf shelf;
    Table table;
    int height;
    int width;

    static class Bed {

        int personCount;
        int height;
        int width;

    }

    static class Shelf {

        String material;
        int height;
        int width;
        int depth;

    }

    static class Table {

        TransformMechanism transformMechanism;
        int height;
        int width;
        int depth;

        static class TransformMechanism {

            int transformationTime;

            void transform() {
                System.out.println("Стол трансформировался");
            }

        }

    }

}
