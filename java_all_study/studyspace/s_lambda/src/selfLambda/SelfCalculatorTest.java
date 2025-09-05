package selfLambda;

public class SelfCalculatorTest {
	void printResult(SelfCalculator c, int a, int b) {
		System.out.println("결과: " + c.getNumber(a, b));
	}
	
	public static void main(String[] args) {
		SelfCalculatorTest selfCalculatorTest = new SelfCalculatorTest();
		selfCalculatorTest.printResult((a , b) -> a + b, 10, 5);
		selfCalculatorTest.printResult((a , b) -> a - b, 10, 5);
		selfCalculatorTest.printResult((a , b) -> a * b, 10, 5);
		selfCalculatorTest.printResult((a , b) -> a / b, 10, 5);
		selfCalculatorTest.printResult((a , b) -> a % b, 10, 5);
	}
}
