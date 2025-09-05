package lambdaTest;

@FunctionalInterface
public interface OperCheck {
//	전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상 메소드 선언(함수형 인터페이스 제작) - OperCheck
	String[] getOpers(String expression);
}
