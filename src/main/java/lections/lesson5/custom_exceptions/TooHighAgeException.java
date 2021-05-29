package lections.lesson5.custom_exceptions;

public class TooHighAgeException extends IllegalAgeException {

    public TooHighAgeException() {
        super("Слишком большой возраст для человека");
    }
}
