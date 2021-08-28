package lections.lesson16.humans;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {

    public static void main(String[] args)
            throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Human human = new Human("Сергей", 25);

        Class<? extends Human> clazz = human.getClass();

        Field firstNameField = clazz.getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        String firstName = (String) firstNameField.get(human);

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        int age = (int) ageField.get(human);

        System.out.println(firstName);
        System.out.println(age);

        ageField.set(human, 35);

        Method greetMethod = clazz.getDeclaredMethod("greet");
        greetMethod.setAccessible(true);
        greetMethod.invoke(human);

        Method sayMethod = clazz.getDeclaredMethod("say", String.class, Integer.TYPE);
        sayMethod.setAccessible(true);
        sayMethod.invoke(human, "Текст", 125);

        Method getFirstNameMethod = clazz.getDeclaredMethod("getFirstName");
        getFirstNameMethod.setAccessible(true);
        String firstName1 = (String) getFirstNameMethod.invoke(human);

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Human ivan = (Human) constructor.newInstance();

    }

}
