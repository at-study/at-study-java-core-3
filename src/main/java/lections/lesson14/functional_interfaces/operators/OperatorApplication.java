package lections.lesson14.functional_interfaces.operators;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorApplication {

    public static void main(String[] args) {
        UnaryOperator<Integer> multiplierOn2 = i -> 2 * i;
        System.out.println(multiplierOn2.apply(10));

        UnaryOperator<Integer> powerOn2 = i -> i * i;

        UnaryOperator<String> reverser = str -> new StringBuilder(str).reverse().toString();
        System.out.println(reverser.apply("Hello, world!"));

        UnaryOperator<Boolean> inverter = b -> b == null ? null : !b;

        System.out.println(inverter.apply(true));
        System.out.println(inverter.apply(false));
        System.out.println(inverter.apply(null));

        BinaryOperator<Integer> max = Math::max;
        BinaryOperator<Integer> pow = (a, b) -> (int) Math.pow(a, b);
        BinaryOperator<Integer> pow2 = (a, b) -> {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        };

        int result = pow2.apply(2, 5);
        System.out.println(result);
    }
}
