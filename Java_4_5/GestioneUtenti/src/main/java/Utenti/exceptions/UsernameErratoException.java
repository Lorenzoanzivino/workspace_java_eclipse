package Utenti.exceptions;

public class UsernameErratoException extends Exception {
    private static final long serialVersionUID = 1L;

	public UsernameErratoException(String message) {
        super(message);
    }
}
