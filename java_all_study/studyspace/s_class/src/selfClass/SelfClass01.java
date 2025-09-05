package selfClass;

//	사람이 3명
//	모든 사람은 이름, 나이, 성별이 있다.
//	3명은 각자 자기소개를 할 수 있다.
//	클래스를 활용하여 3명이 자기소개할 수 있게 구현한다.

class People {
	String name;
	int age;
	String gender;
	public People(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void introduce() {
		System.out.println("이름 " + name);
		System.out.println("나이 " + age);
		System.out.println("성별 " + gender);
	}
}

public class SelfClass01 {
	public static void main(String[] args) {
		People hj = new People("희준", 27, "남");
		hj.introduce();
	}
}
