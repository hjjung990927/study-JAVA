package castingTest;

public class CastingTest02 {
	public static void main(String[] args) {
		System.out.println("" + 3 + 8);
//		""는 문자열이라 +는 연산이 아닌 연결의 역할을 하게 된다.

		System.out.println(3 + 8 + "");
//	 	3+8의 합 11과 문자열 ""이 합쳐져도 11로 출력된다.

		int data = 4;
//		변수 data 에 정수형 4을 선언한다.
		System.out.println("1 + 3 = " + data);
//		"1 + 3 = "은 문자열로 콘솔창에 그대로 출력되고 변수 data 에 4를 선언했기 때문에
//		"1 + 3 = 4가 출력된다.
		
		String name = "한동석";
//		변수 name 에 문자열 한동석을 선언한다.
		String message = name + "님 환영합니다.";
//		변수 message 에 변수 name 과 문자열 "님 환영합니다."을 선언한다.
		System.out.println(message);
//		변수 message 를 출력한다.
	}
}
