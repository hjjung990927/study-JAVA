package inheritanceTest;

class A {
	String name;
	int age;
	
	public A() {
		System.out.println("부모 생성자");
	}

	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

class B extends A {
	String gender;
	
	public B() {
		System.out.println("자식 생성자");
	}

	public B(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		B obj = new B("B" , 20, "남");
//		obj.name = "B";
		System.out.println(obj.name);
	}
	
}
