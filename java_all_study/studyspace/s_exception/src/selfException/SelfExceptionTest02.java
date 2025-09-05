package selfException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelfExceptionTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력");
		
		
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();			
			System.out.println(a / b);
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		} catch (Exception e) {
			System.out.println("다시 시작");
		}
		
	}
}
