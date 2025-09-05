package selfException;

public class SelfGameException extends Exception{
	public SelfGameException() {
		;
	}
	
	public SelfGameException(String message) {
		super(message);
	}
}
