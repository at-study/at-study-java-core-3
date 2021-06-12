package lections.lesson6.generics.with_generic;

public class Container<T> {

    private T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
