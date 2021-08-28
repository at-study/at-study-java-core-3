package lections.lesson16.annotations;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) throws IllegalAccessException {
        Flat flat = new Flat(15, 20, 3);

        int w = getDimension(flat, "Ширина"); // 15
        int l = getDimension(flat, "Длина"); // 20
        int h = getDimension(flat, "Высота"); // 3
        int exc = getDimension(flat, "Значения нет"); // IllegalStateException
    }

    private static int getDimension(Flat object, String description) throws IllegalAccessException {
        Class<Flat> clazz = Flat.class;

        Field field = Stream.of(clazz.getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(Dimension.class))
                .filter(f -> f.getAnnotation(Dimension.class).value().equals(description))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(
                        String.format("No annotation @Dimension(\"%s\") found", description)
                ));

        field.setAccessible(true);
        return (int) field.get(object);
    }

}
