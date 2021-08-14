package lections.lesson14.optionals;

import java.util.Optional;

public class OptionalApplication {

    public static void main(String[] args) {
        // Создание Optional.
        Optional.empty();                // Создает объект Optional, внутри null
        Optional.of("Строка");           // Создает объект Optional, внутри объект.
        Optional.ofNullable("Строка");   // Создает объект Optional, внутри объект либо null.

        // Изменение Optional.
        Optional<String> stringOptional = Optional.of("Семь");
        Optional<String> filteredOptional = stringOptional.filter(s -> s.length() == 4);    // "Семь" внутри Optional
        Optional<String> filteredOptional2 = stringOptional.filter(s -> s.contains("АБВ")); // null внутри Optional

        Optional<Integer> intOptional = stringOptional.map(str -> str.length()); // 4
        Optional<Integer> intOptional2 = stringOptional.map(str -> null);
        Optional<Integer> intOptional3 = stringOptional.map(null);

        Optional<StringBuilder> stringBuilderOptional = stringOptional.flatMap(str -> Optional.of(new StringBuilder(str)));

        // Получение объекта из Optional
        String str1 = stringOptional.get();
        String str2 = stringOptional.orElse("Резервный объект");
        String str3 = stringOptional.orElseGet(() -> {
            System.out.println("Внутри optional нет объекта, используем резервный объект");
            return "Резервный объект";
        });
        String str4 = stringOptional.orElseThrow(() -> new IllegalStateException("Внутри Optional нет объекта"));

        // Операции
        boolean isPresent = stringOptional.isPresent();
        stringOptional.ifPresent(str -> System.out.println(str));
    }


}
