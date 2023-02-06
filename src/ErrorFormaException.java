public class ErrorFormaException extends Exception{

    public ErrorFormaException() {
    }

    public ErrorFormaException(String message) {
        super(message);
    }

    public ErrorFormaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorFormaException(Throwable cause) {
        super(cause);
    }

    public ErrorFormaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
