package lections.lesson13.strings;

public class OperatorApplication {

    public static void main(String[] args) {
        StringOperator same = input -> input;

        StringOperator reverse = in -> new StringBuilder(in).reverse().toString();
        System.out.println(reverse.process("Hello, world"));

        StringOperator upper = String::toUpperCase;
        String uppered = upper.process("Hello, world");
        System.out.println(uppered);
    }

}
