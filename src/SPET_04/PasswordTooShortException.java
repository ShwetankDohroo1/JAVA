package SPET_04;

public class PasswordTooShortException extends Exception{
    public PasswordTooShortException(String message) {
        super(message);
    }
}