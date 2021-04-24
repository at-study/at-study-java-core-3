package lections.lesson1;

public class Rectangle {

    public int height;
    public int width;

    int getPerimeter() {
        return 2 * (height + width);
    }

    public int getSquare() {
        return height * width;
    }

    boolean isSquare() {
        return height == width;
    }

}
