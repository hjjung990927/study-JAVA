package selfInterface;

public class SelfPitcher02 implements SelfLotte02{

	@Override
	public void strike() {
		System.out.println("굳");
	}

	@Override
	public void ball() {
		System.out.println("공 빠졌다");
	}

	@Override
	public void homeRun() {
		System.out.println("망했다");
	}

	@Override
	public void strikeOut() {
		System.out.println("좋다");
	}

}
