package homework_solution.lesson2.task5;

import java.util.Random;

public class TranspositionUsingDecomposition {

    // От 3 до 5.

    // От 0 до 2 при этом прибавить 3

    public static void main(String[] args) {
        final int M = new Random().nextInt(3) + 3;
        final int N = new Random().nextInt(3) + 3;
        int[][] sourceMatrix = createArray(M, N);
        int[][] destinationMatrix = transposeArray(sourceMatrix);
        printArray(sourceMatrix);
        printArray(destinationMatrix);
    }

    /**
     * Создает двумерный массив размером m x n и заполняет его случайными значениями
     *
     * @param m - размерность M
     * @param n - размерность N
     * @return массив со случайными значениями
     */
    static int[][] createArray(int m, int n) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = new Random().nextInt(10);
            }
        }
        return result;
    }

    /**
     * Транспонирует матрицу
     *
     * @param sourceArray - исходная матрица
     * @return транспонированная матрица
     */
    static int[][] transposeArray(int[][] sourceArray) {
        final int M = sourceArray.length;
        final int N = sourceArray[0].length;
        int[][] result = new int[N][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                result[j][i] = sourceArray[i][j];
            }
        }
        return result;
    }

    /**
     * Выводит матрицу на экран
     *
     * @param matrix - матрица
     */
    static void printArray(int[][] matrix) {
        final int M = matrix.length;
        final int N = matrix[0].length;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
