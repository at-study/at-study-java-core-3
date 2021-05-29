package lections.lesson5;

import java.time.LocalDate;

import lections.lesson5.checked_exceptions.ParseDateExample;
import lections.lesson5.custom_exceptions.IllegalNameException;

public class NewHumanApplication {

    public static void main(String[] args){
        String birthday = "20-04-1991";
        LocalDate date = ParseDateExample.parseLocalDate(birthday);
        Human human = new Human();
        human.setBirthDate(date);
        human.setAge(15);
        human.greet();
        try {
            human.setName("Ив");
        } catch (IllegalNameException exception) {
            exception.printStackTrace();
            StackTracePrinter.print(exception);
            // Сообщение из исключения:
            String message = exception.getMessage();

            // Стектрейс из исключения:
            StackTraceElement[] stackTrace = exception.getStackTrace();

            // Экземпляр исключения, из-за которого возникло наше исключение (корневого исключения)
            Throwable rootCause = exception.getCause();

            // Работа с элементом стектрейса
            StackTraceElement element = stackTrace[0];

            String className = element.getClassName();
            String methodName = element.getMethodName();
            int lineNumber = element.getLineNumber();
            String fileName = element.getFileName();
        }
    }


}
