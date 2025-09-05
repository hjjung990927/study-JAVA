package inheritanceTest;

class Animal {
	String name;
	int age;
	String feed;

//	{;} 일부러 비워둔거니 작업 x

	public Animal() {;}

	public Animal(String name, int age, String feed) {
		super();
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	void walk() {
		System.out.println("걷기");
	}
	
	void run() {
		System.out.println("뛰기");
	}
	
	void eat() {
		System.out.println("먹기");
	}
	
}

class Lion extends Animal {
	public Lion() {;}
	
//	Override
	void walk() {
		System.out.println("네 발로 ");
		super.walk();
	}
	
	void hunt() {
		System.out.println("사냥");
	}
}
public class InheritanceTest02 {
	public static void main(String[] args) {
	
		Lion lion = new Lion();
		lion.walk();
	}
}
