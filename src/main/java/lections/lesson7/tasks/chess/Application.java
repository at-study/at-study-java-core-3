package lections.lesson7.tasks.chess;

import lections.lesson7.tasks.figures.Figure;
import lections.lesson7.tasks.figures.Horse;
import lections.lesson7.tasks.figures.Rook;

public class Application {

    public static void main(String[] args) {
        System.out.println(ChessBoard.BOARD);

        Figure figure = new Rook(new Field('D', 6), Figure.Color.BLACK);
        System.out.println(figure.getAvailableMoves());

        Figure figure1 = new Horse(new Field('E', 4), Figure.Color.BLACK);
        System.out.println(figure1.getAvailableMoves());
    }

}
