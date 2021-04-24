package lections.lesson2;

public class BreakAndContinue {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, -2, 0, 5, 2};
        for (int current : array) {
            if (current < 0) {
                break;
            }
            System.out.print(current + " ");
        }

        System.out.println();

        int index = 0;
        while (true) {
            int current = array[index++];
            if (current < 0 || index == array.length) {
                break;
            }
            System.out.print(current + " ");
        }

        System.out.println();

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] % 3 == 0) {
                    break;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        String[] strings = {"Семь", "Пятниц", "На", "Неделе"};
        for (String string : strings) {
            if (string.length() <= 5) {
                continue;
            }
            System.out.println(string);
        }

    }

}
