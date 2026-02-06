package Utenti.exceptions;

public class UsernameInUsoException extends Exception{
	private static final long serialVersionUID = 1L;

	public UsernameInUsoException(String message) {
		super(message);
	}
}
