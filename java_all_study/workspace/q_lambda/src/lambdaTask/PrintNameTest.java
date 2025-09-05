package lambdaTask;

public class PrintNameTest {
	public void printFullName(PrintName printName, String firstName, String lastName) {
		System.out.println(printName.getFullName(firstName, lastName));
	}
	
	public static void main(String[] args) {
		PrintNameTest printNameTest = new PrintNameTest();
		printNameTest.printFullName((f , ㅣ) -> f + ㅣ, "정", "희준");
	}
}
