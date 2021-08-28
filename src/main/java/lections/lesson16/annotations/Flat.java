package lections.lesson16.annotations;

public class Flat {

    @Dimension("Ширина")
    private int width;

    @Dimension("Длина")
    private int length;

    @Dimension("Высота")
    private int height;

    public Flat(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
