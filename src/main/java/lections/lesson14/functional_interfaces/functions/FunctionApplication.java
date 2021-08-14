package lections.lesson14.functional_interfaces.functions;

import java.util.function.Function;

import lections.lesson14.Passport;

public class FunctionApplication {

    public static void main(String[] args) {
        Function<String, Integer> stringToLengthConverter = String::length;
        int count = stringToLengthConverter.apply("Hello"); // 5

        Function<Object, String> toStringConverter = obj -> {
            System.out.println(obj);
            return obj.toString();
        };

        Passport p1 = new Passport("1234", "567888");
        String passport = toStringConverter.apply(p1);

        Function<String, Integer> intParser = str -> {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return 0;
            }
        };

        System.out.println(intParser.apply("362"));
        System.out.println(intParser.apply("362f"));

        // "563" -> 563
        // "dsf563" -> 0

    }
}
