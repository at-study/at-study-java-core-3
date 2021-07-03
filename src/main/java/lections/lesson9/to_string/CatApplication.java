package lections.lesson9.to_string;

import java.util.List;

/**
 * Необходимо создать реализацию списка котов, которая при передаче в System.out.println будет выводить данные в формате:
 *
 * В списке находится <N> котов:
 * - Имя кота: <Имя1>, возраст: <Возраст1>, вес: <Вес1>
 * - Имя кота: <Имя2>, возраст: <Возраст2>, вес: <Вес2>
 * - Имя кота: <Имя3>, возраст: <Возраст3>, вес: <Вес3>
 */
public class CatApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat("Мурзик", 3, 4);
        Cat cat2 = new Cat("Барсик", 2, 3);
        Cat cat3 = new Cat("Леопольд", 1, 2);

        List<Cat> cats = new CatArrayList<>();
        List<Lion> lions = new CatArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println(cats);

        Cat cat4 = (Cat) cat3.clone();
    }

}
