package selfLambda;

public class SelfCheckNumberTest {
	void runCheck(SelfCheckNumber checker, int number) {
		String result = checker.check(number);
		System.out.println("결과는: " + result);
	}
	
	public static void main(String[] args) {
		SelfCheckNumberTest selfChecker = new SelfCheckNumberTest();
		selfChecker.runCheck(n -> (n % 2 == 0) ? "짝수":"홀수", 27);
//		매개변수 n -> 리턴값;  문법사용

//		까먹지말고 조건식이 하나밖에 없을 때 삼항 연산자를 쓰자
//		조건식 ? 참일 때 값 : 거짓일 때 값;
		
		selfChecker.runCheck(n -> {
			if(n > 0) return "양수";
			else if(n < 0) return "음수";
			else return "0";
		}, 0);
		
//		매개변수 n -> {실행할 문장; return 리턴값;};  문법사용
		
	}
}
