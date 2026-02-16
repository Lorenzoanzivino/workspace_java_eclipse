package Utenti.exceptions;

public class CredenzialiErrateException extends Exception {
    private static final long serialVersionUID = 1L;

	public CredenzialiErrateException(String message) {
        super(message);
    }
}
