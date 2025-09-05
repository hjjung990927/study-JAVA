package operTest;

import java.util.Scanner;

public class OperTest02 {
	public static void main(String[] args) {
//		두 정수 입력받기(nextInt())
		int a = 0, b = 0;
//		변수 a,b 를 정수형으로 선언한다.
		String result = "";
//		변수 result 를 문자열로 선언한다.
		String message = "두 정수를 입력하시오. \n예시)1 2";
//		변수 message 를 문자열 "두 정수를 입력하시오. \n예시)1 2"로 선언한다.
//		\n 은 줄바꿈을 의미한다.
		Scanner sc = new Scanner(System.in);
//		사용자로부터 입력을 받을 수 있게 도와주는 스캐너를 생성한다.
		System.out.println(message);
//		변수 message 를 출력한다.
		a = sc.nextInt();
//		메소드 next 를 사용해 사용자로부터 입력을 받는다.
		b = sc.nextInt();
//		메소드 next 를 사용해 사용자로부터 입력을 받는다.	
		
//		두 정수 비교
//		더 큰 값을 출력한다.
//		단, 두 수가 같을 경우 "두 수가 같습니다" 출력
		result = a > b ? "더 큰 값: " + a : 
			a == b ? "두 수가 같습니다." : "더 큰 값: " + b;
//		조건 ? 참 : 거짓 => 조건식이 참이면 참, 거짓이면 거짓에 있는 값을 출력하는 삼항 연산자.
//		a 와 b 가 같은 수 일때 "두 수가 같습니다"를 출력한다.
		System.out.println(result);
//		변수 result 를 출력한다.
	}
}
