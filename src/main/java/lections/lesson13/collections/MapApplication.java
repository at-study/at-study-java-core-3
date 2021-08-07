package lections.lesson13.collections;

import java.util.Map;
import java.util.TreeMap;

public class MapApplication {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>() {{
            put("key1", "value1");
            put("key2", "value2");
            put("key3", "value3");
            put("key4", "value4");
            put("key5", "value5");
        }};

        //    key1 : value1
        map.forEach((key, value) -> System.out.printf("%s : %s%n", key, value));
    }

}
