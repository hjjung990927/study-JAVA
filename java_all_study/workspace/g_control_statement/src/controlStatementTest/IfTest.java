package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {

//		두 정수 입력받기
		int a = 0, b = 0;
		String result = "";
		String message = "두 정수를 입력하시오. \n예시)1 2";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			result = "큰 값: " + a;
//		각각 입력 받은 값이 b 보다 a 가 크다면 result 에 "큰 값: " + a 값을 출력한다.
		}
		else if(a < b) {
			result = "큰 값: " + b;
//		각각 입력 받은 값이 a 보다 b 가 크다면 result 에 "큰 값: " + b 값을 출력한다.
		}
		else {
			result = "두 수는 같습니다.";
//		각각 입력 받은 값이 a 보다 b 가 크지 않고 b 보다 a 가 크지 않다면,
//		result 에 "두 수는 같습니다."를 저장한다.
		}
		
		System.out.println(result);
	}
}
