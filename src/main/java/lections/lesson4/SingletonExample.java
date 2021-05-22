package lections.lesson4;

/**
 * Необходимо создать класс и гарантировать, что у данного класса есть только один объект.
 */

// Синглтон:
public class SingletonExample {

    public static final SingletonExample instance = new SingletonExample();

    private SingletonExample() {
    }

}
