package selfException;

public class SelfAgeException extends Exception{
	public SelfAgeException() {
		;
	}
	
	public SelfAgeException(String message) {
		super(message);
	}
}
