package lections.lesson7.tasks.figures;

import java.util.Set;

import lections.lesson7.tasks.chess.Field;

public class Figure {

    protected Field position;
    protected String name;
    protected Color color;

    Figure(Field position, Color color) {
        this.position = position;
        this.color = color;
    }

    public Set<Field> getAvailableMoves() {
        throw new IllegalStateException();
    }

    public enum Color {
        BLACK,
        WHITE
    }

}