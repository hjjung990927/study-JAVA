package selfException;

import java.util.Scanner;

public class SelfAge {
	public void checkAge(int age) throws SelfAgeException {
		if(age > 149 || age < 1) {
			throw new SelfAgeException();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelfAge age = new SelfAge();
		
		while(true) {
			System.out.println("나이 입력: ");
			int inputAge = sc.nextInt();	
			try {
				age.checkAge(inputAge);
				System.out.println(inputAge);
			} catch (SelfAgeException e) {
				System.out.println("150살 이상이거나 0살은 살아있지 않아요");
			}
		}
	}
}



