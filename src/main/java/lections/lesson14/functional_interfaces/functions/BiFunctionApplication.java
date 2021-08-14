package lections.lesson14.functional_interfaces.functions;

import java.util.function.BiFunction;

import lections.lesson14.Passport;

public class BiFunctionApplication {

    public static void main(String[] args) {
        BiFunction<String, String, Passport> passportGenerator = Passport::new;

        System.out.println(passportGenerator.apply("1234", "555555"));

        BiFunction<Integer, Integer, Boolean> comparator = (a, b) -> a > b;

        BiFunction<Object, Object, Boolean> equalsTester = Object::equals;

        Passport passport1 = passportGenerator.apply("1234", "567890");
        Passport passport2 = passportGenerator.apply("1234", "567890");
        System.out.println(equalsTester.apply(passport1, passport2));
    }
}
