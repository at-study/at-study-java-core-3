package lections.lesson14.functional_interfaces.suppliers;

import java.util.Random;
import java.util.function.Supplier;

import homework_solution.lesson10.task4.helpers.StringGenerator;
import lections.lesson14.Passport;

public class SupplierApplication {

    public static void main(String[] args) {
        Supplier<String> helloWorldSupplier = () -> "Hello, world!";

        System.out.println(helloWorldSupplier.get());

        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);
        System.out.println(randomNumberSupplier.get());

        Supplier<String> randomStringSupplier4 = () -> StringGenerator.generate(4, "0123456789");
        Supplier<String> randomStringSupplier6 = () -> StringGenerator.generate(6, "0123456789");

        Supplier<Passport> randomPassportSupplier = () -> new Passport(
                randomStringSupplier4.get(),
                randomStringSupplier6.get()
        );

        Passport passport = randomPassportSupplier.get();
        System.out.println(passport);
    }
}
