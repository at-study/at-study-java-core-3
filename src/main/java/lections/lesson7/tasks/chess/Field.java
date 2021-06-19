package lections.lesson7.tasks.chess;

public class Field implements Comparable<Field> {
    char x;
    int y;

    public Field(char x, int y) {
        this.x = x;
        this.y = y;
    }

    public char getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Field field = (Field) o;

        if (x != field.x) {
            return false;
        }
        return y == field.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(x) + y;
    }

    @Override
    public int compareTo(Field other) {
        return (x == other.x)
                ? y - other.y
                : x - other.x;

        // this == A5,  other == A7
        // this == A7,  other == A5
    }
}
