package lections.lesson8.figures;

public class Rectangle extends Shape {

    public int width;
    public int height;

    @Override
    public int getArea() {
        return width * height;
    }
}
