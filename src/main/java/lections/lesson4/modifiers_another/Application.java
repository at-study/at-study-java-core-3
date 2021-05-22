package lections.lesson4.modifiers_another;

import lections.lesson4.humans.Human;
import lections.lesson4.modifiers.Modifiers;

public class Application extends Modifiers {

    public static void main(String[] args) {
        Modifiers instance = new Modifiers();

        // instance.privateVariable = 3;  - Данная переменная не видна.
        instance.publicVariable = 4;
        // instance.protectedVariable = 5;  - Данная переменная не видна.
        // instance.defaultVariable = 3;  - Данная переменная не видна.

        Human human = Human.createHuman();
    }

}
