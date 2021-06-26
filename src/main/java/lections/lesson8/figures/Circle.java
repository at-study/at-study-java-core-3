package lections.lesson8.figures;

public class Circle extends Shape {

    public int radius;

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }
}
