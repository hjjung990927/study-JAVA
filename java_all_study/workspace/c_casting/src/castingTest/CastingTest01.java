package castingTest;

public class CastingTest01 {
	public static void main(String[] args) {
//		자동 형변환
		System.out.println(5 / 2);
//		5/2의 결과값을 출력한다.
//		5와 2는 모두 정수이기에 2만 출력된다.
		System.out.println(5 / 2.0);
//		5/2.0의 결과값을 출력한다.
//		위와 다르게 2.0은 실수이므로 2.5가 출력된다.
	
//		강제 형변환
		System.out.println(5 / (double)2);
//		2를 double 형으로 변환해 5/2의 결과값을 출력한다.
//		2를 double 형으로 변환했기에 나누기 연산이 double 형으로 처리된다.
		System.out.println((int)2.9 + 5);
//		2.9를 int 형으로 변환해 정수만 남아 2+5의 결과를 출력한다.		
		System.out.println("=============================");
		
		double number1 = 8.43, number2 = 2.59;
//		변수 number1에 8.43, number2에 2.59를 선언한다.
		int result = (int)number1 + (int)number2;
//		number1과 number2가 double 형 이므로 int 형으로 강제 형변환한 뒤 더한다.
		
		System.out.println(result);
//		result 결과값을 출력한다.
	}
}
