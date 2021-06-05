package lections.lesson5faq.arrays;

import java.util.Arrays;
import java.util.Random;

public class Application2 {

    public static void main(String[] args) {
        final int N = 9;
        int[][] matrix = generateSquareMatrix(N);
        printMatrix(matrix);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                max = Math.max(matrix[i][j], max);
            }
        }
        System.out.println(max);
    }

    static int[][] generateSquareMatrix(final int length) {
        int[][] result = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result[i][j] = new Random().nextInt(19) - 9; // [0...18]  -9
            }
        }
        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
