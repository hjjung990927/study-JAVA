package selfLambda;

public class SelfPrintNameTest {
	void printFullName(SelfPrintName printName, String firstName, String lastName) {
		System.out.println("이름: " + printName.getFullName(firstName, lastName));
	}
	
	public static void main(String[] args) {
		SelfPrintNameTest selfPrintNameTest = new SelfPrintNameTest();
		selfPrintNameTest.printFullName((f , l) -> f + l, "정", "희준");
	}
}
