package lections.lesson16.annotations.helper;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.stream.Stream;

import org.reflections.Reflections;

import lections.lesson16.annotations.pages.Page;
import lections.lesson16.annotations.pages.Title;

public class Application {

    public static void main(String[] args) throws Exception {
        String user2 = getFieldValue("Страница пользователей", "Пользователь 2"); // user_2
        System.out.println(user2);
        String passw = getFieldValue("Страница авторизации", "Пароль"); // pass
        System.out.println(passw);
    }

    private static String getFieldValue(String classTitle, String fieldTitle)
            throws Exception {
        Class<? extends Page> clazz = getPageClassByTitle(classTitle);
        Field field = getFieldByTitle(clazz, fieldTitle);
        field.setAccessible(true);
        Page object = clazz.getDeclaredConstructor().newInstance();
        return (String) field.get(object);
    }

    private static Class<? extends Page> getPageClassByTitle(String title) {
        Set<Class<? extends Page>> pageClasses = new Reflections("lections.lesson16.annotations.pages")
                .getSubTypesOf(Page.class);
        return pageClasses.stream()
                .filter(cl -> cl.isAnnotationPresent(Title.class))
                .filter(cl -> cl.getAnnotation(Title.class).value().equals(title))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("No @Title found"));
    }

    private static Field getFieldByTitle(Class<? extends Page> clazz, String title) {
        return Stream.of(clazz.getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(Title.class))
                .filter(f -> f.getAnnotation(Title.class).value().equals(title))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("No @Title found on field"));
    }
}
