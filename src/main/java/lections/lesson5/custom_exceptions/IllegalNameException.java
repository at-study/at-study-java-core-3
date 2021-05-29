package lections.lesson5.custom_exceptions;

public class IllegalNameException extends Exception {

    public IllegalNameException() {
        super();
    }

    public IllegalNameException(String message) {
        super(message);
    }

    public IllegalNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalNameException(Throwable cause) {
        super(cause);
    }

    protected IllegalNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
