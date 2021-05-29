package lections.lesson5.custom_exceptions;

public class ZeroAgeException extends IllegalAgeException {

    public ZeroAgeException() {
        super("Возраст не может быть равен нулю");
    }
}
