package lections.lesson1;

public class Executor {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 7;
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.isSquare());

        Rectangle square = new Rectangle();
        square.height = 6;
        square.width = 6;
        System.out.println(square.getPerimeter());
        System.out.println(square.getSquare());
        System.out.println(square.isSquare());
    }

}
