package lambdaTest;

@FunctionalInterface
public interface Calc {
//	두 정수를 전달받은 후 int로 리턴하는 calc 추상 메소드 선언(함수형 인터페이스 제작) - Calc
	int calc(int number1, int number2);
}
