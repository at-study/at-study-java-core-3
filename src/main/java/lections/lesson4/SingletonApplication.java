package lections.lesson4;

public class SingletonApplication {

    public static void main(String[] args) {
        SingletonExample ex1 = SingletonExample.instance;
        SingletonExample ex2 = SingletonExample.instance;

        System.out.println(ex1 == ex2);

    }
}
