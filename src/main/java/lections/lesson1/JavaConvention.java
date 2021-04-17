package lections.lesson1;

// Классы у нас называются с большой буквы.
// Если слов несколько, то каждое слово с большой буквы.
public class JavaConvention {

    // Конвенция о наименованиях Java:
    // С маленькой буквы. Если одно слово:
    int number;
    // Если в названии переменной несколько слов, то первое с маленькой буквы, остальные слова слитно с большой буквы
    // Camel Case
    long greatNumber;
    char myNewCharacter;

    // Для констант - все названия пишутся заглавными буквами.
    final double PI = 3.14159265;
    // Если в названии несколько слов, то между ними "_".
    final int LESSON_COUNT = 16;

    // Для методов конвенция аналогична конвенции для переменных
    void print(int numberToPrint) {
        System.out.println(numberToPrint);
    }

    void printNumberIfGreaterThan5(int numberToPrint) {
        if (numberToPrint > 5) {
            System.out.println(numberToPrint);
        }
    }

    // Ctrl + Alt + L - автоматический формат кода
    // Shift + F6 - реформат/переименование
    // Ctrl + D - копирование строки
    // Alt + F8 - evaluate-режим.

}
