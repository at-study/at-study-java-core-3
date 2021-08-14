package lections.lesson14.functional_interfaces.predicates;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import lections.lesson14.Passport;

public class PredicateApplication {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;
        isPositive.test(25);

        Predicate<Boolean> predicate = b -> b == null ? false : b;
        // true -> true
        // false -> false
        // null -> false

        Predicate<String> upperCaseValidator =
                str -> str.equals(str.toUpperCase());
        System.out.println(upperCaseValidator.test("ASDASD"));
        System.out.println(upperCaseValidator.test("ASDasd"));
        // "ASDASD_!" -> true
        // "asfAFW_!" -> false

        Predicate<Passport> passportChecker =
                pass -> pass.getSeries() != null && pass.getNumber() != null;

        Passport p1 = new Passport(null, null);
        Passport p2 = new Passport("1234", null);
        Passport p3 = new Passport(null, "567890");
        Passport p4 = new Passport("1234", "567890");

        System.out.println(passportChecker.test(p1));
        System.out.println(passportChecker.test(p2));
        System.out.println(passportChecker.test(p3));
        System.out.println(passportChecker.test(p4));


        BiPredicate<String, Integer> lengthChecker =
                (str, len) -> str.length() == len;
        BiPredicate<List<String>, String> twiceContainsChecker =
                (list, str) -> {
                    int count = 0;
                    for (String current : list) {
                        if (current.equals(str)) {
                            count++;
                        }
                    }
                    return count == 2;
                };
    }
}
