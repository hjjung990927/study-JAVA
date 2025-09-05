package selfInterface;

public class SelfHitter02 implements SelfLotte02{

	@Override
	public void strike() {
		System.out.println("아쉽다");
	}

	@Override
	public void ball() {
		System.out.println("잘 참았다");
	}

	@Override
	public void homeRun() {
		System.out.println("야호");
	}

	@Override
	public void strikeOut() {
		System.out.println("망했다");
	}

}
