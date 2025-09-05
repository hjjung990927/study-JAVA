package selfInterface;

public class SelfVehicleTest01 {
	public static void main(String[] args) {
		SelfVehicle01 car = new SelfCar01();
		SelfVehicle01 bicycle = new SelfBicycle01();
		
		System.out.println("자동차");
		car.start();
		car.stop();
		car.accelerate();
		car.horn();
		
		System.out.println("자전거");
		bicycle.start();
		bicycle.stop();
		bicycle.accelerate();
		bicycle.horn();
	}
}
