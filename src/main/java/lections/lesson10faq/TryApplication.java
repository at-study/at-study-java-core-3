package lections.lesson10faq;

public class TryApplication {

    private static class CheckedException extends Exception {
        byte[] bytes = new byte[255];

    }

    public static void main(String[] args) throws CheckedException {
        a();
    }

    private static void a() throws CheckedException {
        b();
    }

    private static void b() throws CheckedException {
        c();
    }

    private static void c() throws CheckedException {
        d();
    }

    private static void d() throws CheckedException {
        e();
    }

    private static void e() throws CheckedException {
        throw new CheckedException();
    }
}
