package lections.lesson13.processor;

@FunctionalInterface
public interface Processor<K1, K2, R> {

    R process(K1 key1, K2 key2);

}
