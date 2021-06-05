package lections.lesson5faq.arrays;

import java.util.Arrays;

import static lections.lesson5faq.arrays.Application2.generateSquareMatrix;
import static lections.lesson5faq.arrays.Application2.printMatrix;

public class IntegerCountersApplication {

    public static void main(String[] args) {
        int length = 5;
        int[][] matrix = generateSquareMatrix(length);
        printMatrix(matrix);

        int[] positiveCounters = new int[10];
        int[] negativeCounters = new int[10];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int current = matrix[i][j];
                if (current >= 0) {
                    positiveCounters[current]++;
                } else {
                    negativeCounters[-current]++;
                }
            }
        }

        System.out.println("Массивы счетчиков повторений чисел:");
        System.out.println(Arrays.toString(positiveCounters));
        System.out.println(Arrays.toString(negativeCounters));

        int maxCount = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            maxCount = Math.max(positiveCounters[i], maxCount);
            maxCount = Math.max(negativeCounters[i], maxCount);
        }

        System.out.println("Наиболее встречающиеся элементы:");
        for (int i = 0; i < 10; i++) {
            if (maxCount == positiveCounters[i]) {
                System.out.print(i + " ");
            }
            if (maxCount == negativeCounters[i]) {
                System.out.print(-i + " ");
            }
        }

    }

}
