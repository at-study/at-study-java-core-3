package lections.lesson5.errors;

public class StackOverflowError {

    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        a();
    }
}
