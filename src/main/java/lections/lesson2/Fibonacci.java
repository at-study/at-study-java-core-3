package lections.lesson2;

public class Fibonacci {


    // Реализовать метод, который в качестве параметра принимает целое число N и выводит на экран N-ный член ряда Фибоначчи

    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

    public static void main(String[] args) {
        getFibonacciElement(1);
        getFibonacciElement(2);
        getFibonacciElement(9);
    }

    static void getFibonacciElement(final int N) {
        int[] fibonacciArray = new int[100];
        fibonacciArray[1] = 1;
        fibonacciArray[2] = 1;
        for (int i = 3; i <= N; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
        int result = fibonacciArray[N];
        System.out.println(result);
    }
}
