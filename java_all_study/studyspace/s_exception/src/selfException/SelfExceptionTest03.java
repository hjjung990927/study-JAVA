package selfException;

import java.util.Scanner;

public class SelfExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int[] arData = new int[5];
		int index = 0;
		
		while(true) {
			System.out.println("정수 입력");
			String input = sc.next();
			
			if(input.equals("q")) {
				System.out.println("종료");
				break;
			}
			try {
				arData[index] = Integer.parseInt(input);
				index++;
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개만 입력 가능");
				break;
			} catch (Exception e) {
				System.out.println("다시하소");
			}
		}
		System.out.print("결과: ");
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i]);
		}
	}
}
