package lections.lesson13.calculator;

public class CalculatorApplication {

    public static void main(String[] args) {
        NumberOperation summarization = Integer::sum;
        System.out.println(summarization.calculate(5, 3));

        NumberOperation multiplier = (x, y) -> x * y;
        System.out.println(multiplier.calculate(5, 3));

        NumberOperation power = CalculatorApplication::power;
        System.out.println(power.calculate(5, 3));

        NumberOperation max = Math::max;
        System.out.println(max.calculate(15, 18));
    }

    private static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
