package operTest;

public class OperTest01 {
	public static void main(String[] args) {
		
		boolean isTrue1 = 10 == 11;
//		참과 거짓을 구분하는 boolean 형
//		==는 비교 연산자로 10과 11이 같은가를 비교한다
		boolean result = isTrue1 && 10 <= 20;
//		&&는 논리 연산자(AND)를 의미한다.
//		모두 참이여야 true 를 출력한다.
//		isTrue1은 거짓(false)이므로 false 가 출력된다.
		System.out.println(10 == 11);
//		10과 11은 같지 않으므로 false 가 출력된다.
		System.out.println(10 > 3);
//		10은 3보다 크기 때문에 true 가 출력된다.
		System.out.println(isTrue1);
//		isTrue1은 거짓(false)이므로 false 가 출력된다.	
		System.out.println(result);
//		result 는 거짓(false)이므로 false 가 출력된다.
		
//		isTrue && 10 <= 20의 결과를 true 가 나오도록 변경하기
//		단, 숫자는 변경하지 않는다.
		
		boolean isTrue2 = isTrue1 || 10 <= 20;
//		||는 논리 연산자(OR)를 의미한다.
//		둘 중 하나만 참이여도 true 를 출력한다.
//		10이 20보다 작기 때문에 true 가 출력된다.
		System.out.println(isTrue2);
//		isTrue2는 참(true)이므로 true 가 출력된다.
		System.out.println(!result);
//		!는 NOT을 의미해 참과 거짓을 반대로 바꾼다.
//		result 는 거짓이므로 true 가 출력된다.
	}
}
