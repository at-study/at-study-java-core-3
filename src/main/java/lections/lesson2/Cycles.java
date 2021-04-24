package lections.lesson2;

public class Cycles {

    public static void main(String[] args) {
        int[] numbers = {6, 4, 7, 21, 0, 6, 3, 4, 8, 5, 11, 12, 14};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Сумма элементов массива равна " + sum);

        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            }
        }
        System.out.println("Сумма четных элементов массива равна " + evenSum);

        sum = 0;
        int index = 0;
        for (int current : numbers) {
            sum += current;
            index++;
        }
        System.out.println("Сумма элементов массива равна " + sum);


        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {}, {11}};
        for (int current : matrix2[2]) {
            System.out.print(current + " ");
        }
        System.out.println();

        sum = 0;
        index = 0;
        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        System.out.println("Сумма элементов массива равна " + sum);

        do {
            // Выполняемые операции
        } while (true);
    }

}
