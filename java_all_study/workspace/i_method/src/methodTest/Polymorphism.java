package methodTest;

public class Polymorphism {
	int add(int number1, int number2) {
		System.out.println("두 정수의 덧셈");
		return number1 + number2;
	}
	
	int add(int number1, int number2, int number3) {
		System.out.println("세 정수의 덧셈");
		return number1 + number2 + number3;
	}
	
	double add(double number1, double number2) {
		System.out.println("두 실수의 덧셈");
		return number1 + number2;
	}
	
	public static void main(String[] args) {
		new Polymorphism().add(1.5, 3.0);	
	}
}
