package lections.lesson2;

public class Arrays {

    public static void main(String[] args) {
        // Объявление массивов
        int[] array;
        int[] array2 = new int[5];
        int[] array3 = {1, 2, 3, 4};

        final int[] finalArray = new int[6];
        finalArray[0] = 3;
        finalArray[4] = 4;
        // finalArray = new int[5]; <- нельзя, т.к. final

        // Двумерный массив
        int[][] matrix = new int[3][4];
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {}, {11}};
        System.out.println(matrix2[1][2]);

        // ArrayIndexOutOfBoundsException
        // System.out.println(matrix2[3][0]);
        // System.out.println(matrix2[-5][0]);

    }

}
