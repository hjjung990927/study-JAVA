package selfInterface;

public class SelfCar01 implements SelfVehicle01{
//인터페이스를 다른 클래스에 지정할때 사용하는 implements
//지정된 클래스에서 구현
	@Override
	public void start() {
		System.out.println("시동 키기");
		
	}

	@Override
	public void stop() {
		System.out.println("시동 끄기");
		
	}

	@Override
	public void accelerate() {
		System.out.println("엑셀 밟기");
		
	}

	@Override
	public void horn() {
		System.out.println("빵빵");
		
	}
	
}
