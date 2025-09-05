package classTest;

//	동물 클래스 선언

//	변수
//	이름, 나이, 체력, 먹이 개수, 먹이 종류

//	메소드
//	먹기, 산책하기

//	먹기
//	체력 1증가, 먹이 개수 1감소

//	산책
//	체력 1감소
class Pet {
	String name;
	int age;
	int strength;
	int foodcount;
	String foodvalue;

	public Pet(String name, int age, int strength, int foodcount, String foodvalue) {
		this.name = name;
		this.age = age;
		this.strength = strength;
		this.foodcount = foodcount;
		this.foodvalue = foodvalue;
	}

	void eatFood() {
		strength++;
		foodcount--;
	}

	void walk() {
		strength--;
	}

}

public class ClassTask04 {
	public static void main(String[] args) {
		Pet rabbit = new Pet("톡이", 2, 10, 3, "당근");
		Pet wolf = new Pet("늑이", 4, 15, 2, "토끼");

		if (rabbit.foodcount > 0) {
			rabbit.eatFood();
			System.out.println("냠");
		}

		if (rabbit.strength > 0) {
			rabbit.walk();
			System.out.println("헉헉");
		}
	}
}
