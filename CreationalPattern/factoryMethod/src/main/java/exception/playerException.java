package exception;

public class playerException extends Exception {
    public playerException() {
    }

    public playerException(String message) {
        super(message);
    }

    public playerException(String message, Throwable cause) {
        super(message, cause);
    }

    public playerException(Throwable cause) {
        super(cause);
    }

    public playerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
