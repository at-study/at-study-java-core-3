package lections.lesson1;

public class Application {

    int number1;
    long longNumber1;

    double a;
    double b = 1.15;

    char ch1 = 49;
    char ch2 = 'x';

    boolean bool1 = true;
    boolean bool2 = false;

    public static void main(String[] args) {
        Application instance = new Application();
        instance.number1 = 3;

        int number2;
        long number3;
        number2 = 4;
        number3 = number2;
        number2 = (int) number3;
        instance.longNumber1 = 3;
        instance.longNumber1 = 2_147_483_648L;

        instance.a = 1.38;

        System.out.println(instance.longNumber1);
        System.out.println(instance.longNumber1);

        char ch3 = 'A';
        ch3++;
        System.out.println(ch3);
    }

}
