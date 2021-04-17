package lections.lesson1;

public class LazyExecution {

    /*
     * Таблица истинности логических вычислений:
     *
     *   a      b      И      ИЛИ
     *  true   true   true    true
     *  true   false  false   true
     *  false  true   false   true
     *  false  false  false   false
     */

    public static void main(String[] args) {
        boolean a = true;
        boolean b = !a;

        boolean c = true;
        boolean d = true;

        boolean or = c || d;
        boolean and = c && d;

        byte b1 = 5;  //  00000101
        byte b2 = 4;  //  00000100
                      //  00000101

        byte b3 = (byte) (b1 | b2);
        LazyExecution instance = new LazyExecution();
        boolean result = instance.a() && instance.b() || instance.c();

        int x = (instance.a())
                ? 5
                : 3;
        System.out.println(x);
    }

    boolean a() {
        System.out.print("A");
        return true;
    }

    boolean b() {
        System.out.print("B");
        return true;
    }

    boolean c() {
        System.out.print("C");
        return true;
    }

}
