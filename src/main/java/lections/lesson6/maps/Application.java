package lections.lesson6.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import lections.lesson6.enums.DayOfWeek;

public class Application {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        String previousValue = map.put(15, "Пятнадцать");
        String previousValue2 = map.put(15, "Пятнадцать333");
        map.put(2, "Два");
        map.put(5, "Пять");
        map.put(7, "Семь");
        map.put(5, "Пятерка");
        map.put(3, "Три");

        String value = map.get(15);
        String absentValue = map.get(13); //null
        map.remove(15);

        boolean containsKey = map.containsKey(15);
        boolean containsValue = map.containsValue("Пятнадцать");

        // Множество ключей мапы:
        Set<Integer> keys = map.keySet();

        // Коллекция значений мапы:
        Collection<String> values = map.values();

        // Множество всех пар <ключ, значение из мапы>
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.printf("%s=%s%n", entry.getKey(), entry.getValue());
        }

        Map<DayOfWeek, String> days = new TreeMap<>();
        days.put(DayOfWeek.MONDAY, "Понедельник");
        days.put(DayOfWeek.TUESDAY, "Вторник");
        days.put(DayOfWeek.WEDNESDAY, "Среда");
        days.put(DayOfWeek.THURSDAY, "Четверг");

    }

}
