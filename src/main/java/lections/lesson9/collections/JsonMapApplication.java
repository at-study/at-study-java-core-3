package lections.lesson9.collections;

import java.util.Map;

import lections.lesson9.to_string.Human;

public class JsonMapApplication {

    public static void main(String[] args) {
        Map<String, Object> data = new JsonMap();
        data.put("value1", null);
        data.put("value2", 5);
        data.put("value3", 5.5d);
        data.put("value4", "str");
        data.put("value5", new JsonMap());

        Map<String, Object> internal = new JsonMap();
        internal.put("internalValue1", "abc");
        internal.put("internalValue2", 15);

        data.put("value6", internal);
        data.put("value7", false);
        data.put("value8", new Human("Иванов", "Сергей", "Петрович"));

        System.out.println(data);
    }

}
