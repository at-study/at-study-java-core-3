package lections.lesson13.strings;

public class ConsumerApplication {

    public static void main(String[] args) {
        StringConsumer printer = System.out::println;
        printer.consume("qwerty");

        StringConsumer lengthPrinter = str -> System.out.println(str.length());
        lengthPrinter.consume("qwertyuiop");

        StringConsumer lowerCaseLengthPrinter =
                str -> printLowerCaseCharsCount(str);
        lowerCaseLengthPrinter.consume("QWErtyui"); // 5
    }

    private static void printLowerCaseCharsCount(String in) {
        int lowerCaseCharsCount = getLowerCaseCharsCount(in);
        System.out.println(lowerCaseCharsCount);
    }

    private static int getLowerCaseCharsCount(String in) {
        int lowerCaseCharCount = 0;
        for (char c : in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                lowerCaseCharCount++;
            }
        }
        return lowerCaseCharCount;
    }

}
