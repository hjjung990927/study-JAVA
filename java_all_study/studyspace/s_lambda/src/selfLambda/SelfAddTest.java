package selfLambda;

public class SelfAddTest {
	void printResult(SelfAdd c, int a, int b) {
		System.out.println("결과: " + c.getNumber(a, b));
	}
	
	public static void main(String[] args) {
		SelfAddTest selfAddTest = new SelfAddTest();
		selfAddTest.printResult((a , b) -> a + b, 5, 10);
	}
}
