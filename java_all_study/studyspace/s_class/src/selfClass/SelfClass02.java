package selfClass;

//슈퍼카 2대를 만들어야 한다.
//모든 슈퍼카는 브랜드, 색상, 가격이 있다.
//시동 켜기, 시동 끄기 기능이 있다.

//※ 메소드
//시동 켜기
//이미 시동이 켜져있으면 "시동이 켜져있습니다" 출력
//시동이 꺼져있으면 시동 켜기

//시동 끄기
//이미 시동이 꺼져있으면 "시동이 꺼져있습니다" 출력
//시동이 켜져있으면 시동 끄기

class SuperCar {
	String brand;
	String color;
	int price;
	boolean engineCheck;
	public SuperCar(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		if(engineCheck) {
			System.out.println(brand + ": 시동이 이미 켜져 있습니다.");
		} else {
			engineCheck = true;
			System.out.println(brand + ": 시동을 켰습니다.");
		}
	}
	void engineStop() {
		if(!engineCheck) {
			System.out.println(brand + ": 시동이 이미 꺼져 있습니다.");
		} else {
			engineCheck = false;
			System.out.println(brand + ": 시동을 껐습니다.");
		}
	}
}

public class SelfClass02 {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("페라리", "흰색", 18000);
		SuperCar ram = new SuperCar("람보", "흰색", 18000);
		
		ferrari.engineStart();
		ferrari.engineStart();
		System.out.println();
		ram.engineStart();
		ram.engineStop();
		ram.engineStop();
	}
}

// !!!!!
// while, if문이 바로 안떠오른다
// 이렇게 해도 되는지??
// !!!!!
