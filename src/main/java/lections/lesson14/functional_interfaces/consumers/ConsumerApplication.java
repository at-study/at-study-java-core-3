package lections.lesson14.functional_interfaces.consumers;

import java.util.function.Consumer;

import lections.lesson3.Cat;

public class ConsumerApplication {

    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;

        printer.accept("Hello, world!");
        printer.accept("qwerty");

        Consumer<String> lengthPrinter = str -> System.out.println(str.length());
        lengthPrinter.accept("Hello, world!");

        Consumer<Integer> isPositivePrinter = value -> System.out.println(value > 0);
        isPositivePrinter.accept(150);
        isPositivePrinter.accept(0);
        isPositivePrinter.accept(-150);

        Consumer<Object> notNullPrinter = o -> {
            if (o != null) {
                System.out.println(o);
            }
        };

        notNullPrinter.accept(null);
        notNullPrinter.accept(new Cat("Барсик", 5, 4));
    }
}
