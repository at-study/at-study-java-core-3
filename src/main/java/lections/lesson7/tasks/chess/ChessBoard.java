package lections.lesson7.tasks.chess;

import java.util.Set;
import java.util.TreeSet;

public class ChessBoard {

    public static final Set<Field> BOARD = new TreeSet<>();

    static {
        for (char i = 'A'; i <= 'H'; i++) {
            for (int j = 1; j <= 8; j++) {
                BOARD.add(new Field(i, j));
            }
        }
    }

}
