package lections.lesson2;

import lections.lesson1.Rectangle;

public class Strings {

    public static void main(String[] args) {
        // Объявление строки:
        String string = "Строка";
        String string2 = "Строка";
        String string3 = new String("Строка");

        // Строки сравниваем через equals!
        boolean areStringsSame = string == string3;
        System.out.println(areStringsSame);
        boolean areStringsEqual = string.equals(string2);

        // Получение символа из строки по его индексу
        char ch = string.charAt(2);
        System.out.println(ch);

        // Длина строки
        int length = string.length();
        System.out.println(length);

        // Проверить строку на какие-то условия.
        boolean startsWith = string.startsWith("Стр");
        boolean endsWith = string.endsWith("ока");
        boolean contains = string.contains("трок");
        String series = "1234";
        String number = "793538";
        String passport = series + " " + number;
        boolean matches = passport.matches("^\\d{4}\\s\\d{6}$"); //  ^\d{4}\s\d{6}$
        System.out.println(matches);

        // Выделение подстроки из строки:
        String s = "Новая строка";
        String substring = s.substring(3, 8);

        String lower = s.toLowerCase();
        String upper = s.toUpperCase();

        String numString = series + (1 + 2);
        System.out.println(numString);

        // String.valueOf()

        int var1 = 65;
        char var2 = 65;

        String boolString = String.valueOf(true);
        String intString = String.valueOf(var1); // "65"
        String charString = String.valueOf(var2); // "A"

        String s1 = "1234";

        int num1 = Integer.parseInt(s1);
        double dbl1 = Double.parseDouble(s1);
        boolean bool = Boolean.parseBoolean(s1);



        String replacedString = s.replace("о", "0");
        String regexReplacedString = s.replaceAll("о[вк]", "123");

        String newString = System.lineSeparator();
        String str = "Нов\\ая \"стр\tока\"\n"; // Нов\ая "стр ока"

        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 7;
        System.out.println("Площадь прямоугольника со сторонами " + rectangle.width + " и " + rectangle.height + " равна " + rectangle.getSquare());

        String output = String.format("Площадь прямоугольника со сторонами %d и %d равна %d%n", rectangle.width, rectangle.height, rectangle.getSquare());
        System.out.println(output);
        // %s - строка
        // %d - целое число
        // %f - число с плавающей точкой
        // %b - логическая переменная
        // %n - переход на новую строку
        final double PI = 3.1415926;
        System.out.println(String.format("Число пи: %.3f", PI));

        validatePassword("Th3pas!!!!!!!!word");
        validatePassword("Th3pas$");
        validatePassword("th3pas$word");
        validatePassword("TH3PAS$WORD");
        validatePassword("Thepas$word");
        validatePassword("Th3password");

    }

    /**
     * Проверяет пароль на требования:
     * Длина - не менее 8 символов
     * Содержит как минимум 1 заглавную букву
     * Содержит как минимум 1 строчную букву
     * Содержит как минимум 1 цифру
     * Содержит как минимум 1 спецсимвол [ !@#$%^&*() ]
     *
     * @param password - передаваемый пароль
     */
    static void validatePassword(String password) {
        final String VALID_PASSWORD = "Пароль соответствует требованиям";
        final String INVALID_PASSWORD = "Пароль НЕ соответствует требованиям";
        boolean result = true;
        if (!password.matches("^.{8,}$")) { // password.length() < 8
            result = false;
        }
        if (!password.matches("^.*[A-Z].*$")) { // password.toLowerCase().equals(password)
            result = false;
        }
        if (!password.matches("^.*[a-z].*$")) { // password.toUpperCase().equals(password)
            result = false;
        }
        if (!password.matches("^.*\\d.*$")) {
            result = false;
        }
        if (!password.matches("^.*[!@#$%^&*()].*$")) {
            result = false;
        }
        System.out.println(result ? VALID_PASSWORD : INVALID_PASSWORD);
    }

}
