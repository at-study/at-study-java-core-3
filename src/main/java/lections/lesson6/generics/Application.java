package lections.lesson6.generics;

import lections.lesson6.enums.DayOfWeek;
import lections.lesson6.generics.old.BooleanContainer;
import lections.lesson6.generics.old.IntContainer;
import lections.lesson6.generics.with_generic.Container;

public class Application {

    public static void main(String[] args) {
        IntContainer int1 = new IntContainer(5);
       // System.out.println(int1.getValue());

        BooleanContainer bool1 = new BooleanContainer(false);
       // System.out.println(bool1.getValue());

        // Immutable-классы:
        Boolean boolA;
        Byte byteA = 10;
        Short shortA = 25;
        Integer intA;
        Long longA = 6L;
        Character charA = 'c';
        Float floatA = 1.25f;
        Double doubleA = 1.15;

        Integer a = 130;
        Integer b = 130;
        System.out.println(a.equals(b));

        Container<Integer> int2 = new Container<>(25);
        Container<Long> long2 = new Container<>(25L);
        Container<String> str2 = new Container<>("Строка");
        Container<Boolean> bool2 = new Container<>(false);
        Container<DayOfWeek> monday = new Container<>(DayOfWeek.MONDAY);
        DayOfWeek value = monday.getValue();

        Container obj2 = new Container("asfdd");
        DayOfWeek value2 = (DayOfWeek) obj2.getValue();

    }
}
