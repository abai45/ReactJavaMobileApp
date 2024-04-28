package kz.group.reactAndSpring.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) {
        super(message);
    }
    public ApiException() {
        super("An error occured");
    }
}
