package lections.lesson8.priority;

import homework_solution.lesson11.task3.Generator;

public interface TestingInterface {

    String s = getAndPrintRandomString();

    static String getAndPrintRandomString() {
        String randomString = Generator.randomString(5, 12);
        System.out.println(randomString);
        return randomString;
    }
}
