package lections.lesson5faq.arrays;

public class Application {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 6, 2},
                {6, 2, 3, 1, 5},
                {4, 3, 0, 9, 4},
                {5, 5, 8, 1, 2}
        };

        int length = matrix.length;
        int sum = 0;

        // o(n)
        for (int i = 0; i < length; i++) {
            sum += matrix[i][length - i - 1];
        }

        System.out.println(sum);
    }

}
