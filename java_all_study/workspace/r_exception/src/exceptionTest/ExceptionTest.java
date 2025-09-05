package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
//		런타임 오류
//		System.out.println(10 / 0);

//		try {
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//			System.out.println("분모가 0입니다.");
//		}
//
//		System.out.println("반드시 실행해야 하는 문장");
		
//		사용자에게 정수 1개를 입력받고 출력한다.
//		만약, 사용자가 정수가 아닌 문자열을 입력하면 런타임 오류가 발생한다.
//		이 때, 예외처리를 사용해서 프로그램이 강제 종료되는 것을 막아본다.
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("정수를 입력하시오");
		
		try {		
			number = sc.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해주세요");
			
		} catch (Exception e) {
			System.out.println("다시 시도해주세요");
		}
	
		System.out.println(number);
		
	}
}
