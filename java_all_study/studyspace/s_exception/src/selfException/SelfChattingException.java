package selfException;

public class SelfChattingException extends Exception{
	public SelfChattingException() {
		;
	}
	public SelfChattingException(String message) {
		super(message);
	}

}
