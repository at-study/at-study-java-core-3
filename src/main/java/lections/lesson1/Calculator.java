package lections.lesson1;

/**
 * Класс-калькулятор
 */
public class Calculator {

    // Однострочный комментарий

    /*
           Многострочный
           комментарий
     */

    /**
     * Вычисление суммы двух чисел
     *
     * @param first  - первое число
     * @param second - второе число
     * @return сумму чисел first и second
     */

    int sum(int first, int second) {
        int result = first + second; // Сумма двух чисел
        return result;
    }

    /**
     * Вычисление разницы двух чисел
     *
     * @param first  - уменьшаемое
     * @param second - вычитаемое
     * @return разность
     */

    int subtract(int first, int second) {
        return first - second;
    }

    /**
     * Вычисление частного двух чисел
     *
     * @param first  - делимое
     * @param second - делитель
     * @return частное
     */

    double divide(int first, int second) {
        return 1.0 * first / second;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Calculator instance = new Calculator();
        int a = 7;
        int b = 3;
        int c = instance.sum(a, b);
        System.out.println(c);
        System.out.println();
        double d = instance.divide(a, b);
        System.out.println(d);
        int e = a % b;
        System.out.println(e);
        System.out.println(instance.isEven(10));
        System.out.println(instance.isEven(15));
    }
}
