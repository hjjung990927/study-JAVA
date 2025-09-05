package classTest;

class A {
	int data;
//	전역 변수(global variable)
//	자동 초기화
//	프로그램 종료 시 메모리 해제

	A() {
		System.out.println("생성자 호출");
	}
//	기본 생성자
	
	void printData() {
		int data = 10;
//		지역 변수(local variable)
//		직접 초기화
//		해당 영역이 끝날 때

//		System.out.println(this);

		System.out.println(data);
		System.out.println(this.data); // 필드에 있는 데이터 = 전역 변수
	}
}

public class ClassTest01 {
//	프로그램을 만들어주는 메소드
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(); // new 를 할 때 마다 다른 주소값을 할당

//		System.out.println(a1);
//		System.out.println(a2);

		a1.data = 100;
		a1.printData();

		a2.data = 20;
		a2.printData();

	}
}
