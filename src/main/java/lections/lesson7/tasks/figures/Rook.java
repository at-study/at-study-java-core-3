package lections.lesson7.tasks.figures;

import java.util.Set;
import java.util.TreeSet;

import lections.lesson7.tasks.chess.ChessBoard;
import lections.lesson7.tasks.chess.Field;

public class Rook extends Figure {

    public Rook(Field position, Color color) {
        super(position, color);
        this.name = "Ладья";
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
            if (dy == 0 && dx != 0) {
                result.add(currentChessField);
            }
            if (dx == 0 && dy != 0) {
                result.add(currentChessField);
            }
        }
        return result;
    }
}
