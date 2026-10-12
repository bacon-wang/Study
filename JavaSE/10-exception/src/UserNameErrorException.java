public class UserNameErrorException extends Exception /*RuntimeException*/ {
    public UserNameErrorException(Throwable cause) {
        super(cause);
    }

    public UserNameErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameErrorException(String message) {
        super(message);
    }

    public UserNameErrorException() {
    }
}
