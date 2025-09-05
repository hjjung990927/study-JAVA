package selfException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelfExceptionTest01 {
	public static void main(String[] args) {
//		try {
//			System.out.println(10 / 5);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("분모에 0이 올 수 없다.");
//		} catch (Exception e) {
//			System.out.println("다시 시도하소.");
//		}
		
//		사용자에게 정수 1개를 입력받고 출력한다.
//		만약, 사용자가 정수가 아닌 문자열을 입력하면 런타임 오류가 발생한다.
//		이 때, 예외처리를 사용해서 프로그램이 강제 종료되는 것을 막아본다.
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("정수 입력: ");
		try {
			number = sc.nextInt();
						
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력 가능");
		} catch (Exception e) {
			System.out.println("다시 하소");
		}
		System.out.println(number);
		
	}
}
