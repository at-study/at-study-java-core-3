package lections.lesson7.tasks.figures;

import java.util.Set;
import java.util.TreeSet;

import lections.lesson7.tasks.chess.ChessBoard;
import lections.lesson7.tasks.chess.Field;

import static java.lang.Math.abs;

public class Horse extends Figure {

    public Horse(Field position, Color color) {
        super(position, color);
        this.name = "Конь";
    }

    @Override
    public Set<Field> getAvailableMoves() {
        Set<Field> result = new TreeSet<>();
        for (Field currentChessField : ChessBoard.BOARD) {
            char x = currentChessField.getX();
            int y = currentChessField.getY();
            char lx = position.getX();
            int ly = position.getY();

            int dy = ly - y;
            int dx = lx - x;
            if ((abs(dx) == 1 && abs(dy) == 2) || (abs(dx) == 2 && abs(dy) == 1)) {
                result.add(currentChessField);
            }

        }
        return result;
    }
}
