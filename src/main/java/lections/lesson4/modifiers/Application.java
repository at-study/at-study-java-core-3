package lections.lesson4.modifiers;

public class Application {

    public static void main(String[] args) {
        Modifiers instance = new Modifiers();

        // instance.privateVariable = 3; - Данная переменная не видна.
        instance.publicVariable = 4;
        instance.protectedVariable = 5;
        instance.defaultVariable = 3;
    }

}
