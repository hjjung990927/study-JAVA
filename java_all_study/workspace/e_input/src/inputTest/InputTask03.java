package inputTest;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {
		int n1 = 0, n2 = 0, n3 = 0, sum = 0;
//		변수 n1, n2, n3, sum 에 정수형을 선언한다.
		String message = "3개의 정수를 입력하시오. ";
//		변수 message 에 문자열 "3개의 정수를 입력하시오. "를 선언한다.
		System.out.println(message + "\n예시)1 2 3");
//		변수 message 를 출력한다.
		Scanner sc = new Scanner(System.in);
//		사용자로부터 입력을 받을 수 있게 도와주는 스캐너를 생성한다.
		n1 = sc.nextInt();
//		메소드 next 를 사용해 사용자로부터 입력을 받은 수를 변수 n1에 선언한다.
		n2 = sc.nextInt();
//		메소드 next 를 사용해 사용자로부터 입력을 받은 수를 변수 n2에 선언한다.
		n3 = sc.nextInt();
//		메소드 next 를 사용해 사용자로부터 입력을 받은 수를 변수 n3에 선언한다.

		sum = n1 + n2 + n3;
//		변수 sum 에 n1, n2, n3를 더한 값을 선언한다.
		
		System.out.println("결과: " + sum);
//		변수 sum 을 출력한다.
		
	}
}
