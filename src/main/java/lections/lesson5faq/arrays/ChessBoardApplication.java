package lections.lesson5faq.arrays;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.abs;

public class ChessBoardApplication {

    // |dx| = 2 && |dy| = 1
    // |dx| = 1 && |dy| = 2

    public static void main(String[] args) {
        // Координаты ладьи:
        int sx = new Random().nextInt(8);
        int sy = new Random().nextInt(8);

        int[][] chessBoard = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int dx = i - sx;
                int dy = j - sy;
                chessBoard[i][j] = (abs(dx) == 2 && abs(dy) == 1) || (abs(dx) == 1 && abs(dy) == 2) ? 1 : 0;
            }
        }

        System.out.printf("Координаты ладьи: [%d, %d]%n", sx, sy);

        printMatrix(chessBoard);

    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
