package classTest;

//Car 클래스 정의
class Car {
//	Car 클래스에서 자동차의 브랜드, 가격, 색상을 저장하는 객체 변수
	String brand;
	int price;
	String color;

//	브랜드, 가격, 색상을 초기화하는 생성자
	Car(String brand, int price, String color) {
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
//	브랜드를 제외하고 가격과 색상만 초기화하는 생성자
	Car(int price, String color) {
		this.price = price;
		this.color = color;
	}
	
//	브랜드와 가격을 제외하고 색상만 초기화 하는 생성자
	Car(String color) {
		this.color = color;
	}

	void printInfo() {
		System.out.println(brand + ", " + price + ", " + color);
	}
}

public class ClassTest02 {
	public static void main(String[] args) {
//		오버로딩
		Car mom = new Car("BMW", 15000, "White");
		Car daddy = new Car("Blue");
		Car mine = new Car(5000, "Black");
		
		mom.printInfo();
		daddy.printInfo();
		mine.printInfo();
	}
}
