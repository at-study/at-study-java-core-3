package lections.lesson4.modifiers;

public class Modifiers {

    // Виден только внутри класса, где объявлен
    private int privateVariable = -1;

    // Виден везде
    public int publicVariable = 1;

    // Видны в пределах пакета + видны у наследников.
    protected int protectedVariable = 3;

    // Package-private / default - виден только в пределах пакета
    int defaultVariable = 5;

    public void someMethod() {
        privateVariable = 3;
        publicVariable = 2;
        protectedVariable = 4;
        defaultVariable = 5;
    }

}
