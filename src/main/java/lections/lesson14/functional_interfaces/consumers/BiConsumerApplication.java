package lections.lesson14.functional_interfaces.consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

import org.junit.jupiter.api.Assertions;

import lections.lesson14.Passport;

public class BiConsumerApplication {

    public static void main(String[] args) {
        BiConsumer<String, Integer> isLengthEqual =
                (str, len) -> System.out.println(str.length() == len);
        isLengthEqual.accept("Пять", 5);
        isLengthEqual.accept("Пять", 4);
        isLengthEqual.accept("Пять", 7);

        BiConsumer<Passport, String> passportSeriesSetter = Passport::setSeries;
        BiConsumer<Passport, String> passportNumberSetter = Passport::setNumber;

        Passport passport = new Passport();
        System.out.println(passport);
        passportSeriesSetter.accept(passport, "12 34");
        passportNumberSetter.accept(passport, "567890");
        System.out.println(passport);

        BiConsumer<Passport, List<String>> passportSetter = (pass, list) -> {
            pass.setSeries(list.get(0));
            pass.setNumber(list.get(1));
        };

        Passport passport2 = new Passport();
        passportSetter.accept(passport2, Arrays.asList("5555", "666666"));
        System.out.println(passport2);


        BiConsumer<Object, Object> asserter =
                (o1, o2) -> Assertions.assertEquals(o1, o2, "Сравнение объектов на равенство");
    }
}
