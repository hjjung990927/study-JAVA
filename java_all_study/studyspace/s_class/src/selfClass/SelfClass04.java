package selfClass;

//동물 클래스 선언

//변수
//이름, 나이, 체력, 먹이 개수, 먹이 종류

//메소드
//먹기, 산책하기

//먹기
//체력 1증가, 먹이 개수 1감소

//산책
//체력 1감소

class Animal {
	String name;
	int age;
	int hp;
	int foodcount;
	String foodvalue;
	
	public Animal(String name, int age, int hp, int foodcount, String foodvalue) {
		this.name = name;
		this.age = age;
		this.hp = hp;
		this.foodcount = foodcount;
		this.foodvalue = foodvalue;
	}
	void eatFood() {
		hp++;
		foodcount--;
		System.out.println("냠냠");
	}
	void walk() {
		hp--;
		System.out.println("헉헉");
	}
}

public class SelfClass04 {
	public static void main(String[] args) {
		Animal rabbit = new Animal("끼", 2, 3, 10, "당근");
		Animal panda = new Animal("바오", 3, 2, 10, "대나무");
		panda.eatFood();
		rabbit.walk();
	}
}

//	!!!!!
//	여기서 Animal rabbit = new Animal(); 일 때
//	rabbit.walk(); 입력 시 
//	콘솔 창에 이름과 냠냠이 같이 출력하는 방법
//	!!!!!
