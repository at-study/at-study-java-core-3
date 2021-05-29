package lections.lesson5.unchecked_exceptions;

public class Application {

    public static void main(String[] args) {
        System.out.println(divide(5, 0));
    }

    public static int divide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Делить на ноль нельзя!");
        }
        return result;
    }
}
