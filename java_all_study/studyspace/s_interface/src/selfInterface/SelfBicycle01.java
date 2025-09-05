package selfInterface;

public class SelfBicycle01 implements SelfVehicle01{

	@Override
	public void start() {
		System.out.println("따르릉");
	}

	@Override
	public void stop() {
		System.out.println("끼익");
		
	}

	@Override
	public void accelerate() {
		System.out.println("슈웅");
	}

	@Override
	public void horn() {
		System.out.println("딸랑딸랑");
	}

}
