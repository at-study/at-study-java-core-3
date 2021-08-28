package lections.lesson16.cats;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LionApplication {

    public static void main(String[] args) throws Exception {
        Lion lion = new Lion(70);

        Class<Lion> clazz = Lion.class;
        Field[] lionFields = clazz.getDeclaredFields();
        Field[] catFields = clazz.getSuperclass().getDeclaredFields();

        Set<Field> allLionFields = getAllFields(Lion.class);

        Field ageField = clazz.getSuperclass().getDeclaredField("age");
        ageField.setAccessible(true);
        int age = (int) ageField.get(lion);
    }

    private static Set<Field> getAllFields(Class<?> clazz) {
        Set<Field> currentClassFields = Stream.of(clazz.getDeclaredFields()).collect(Collectors.toSet());
        while (clazz.getSuperclass() != Object.class) {
            Class superClass = clazz.getSuperclass();
            currentClassFields.addAll(getAllFields(superClass));
            clazz = superClass;
        }
        return currentClassFields;
    }

}
