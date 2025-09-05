package inputTest;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//		두 정수를 입력받은 뒤 곱셈 결과를 출력한다.
//		단, nextInt()가 아닌 next()로 사용한다.
		Scanner scanner = new Scanner(System.in);
//		사용자로부터 입력을 받을 수 있게 도와주는 스캐너를 생성한다.
		String message = "두 개의 정수를 입력하세요.";
//		변수 message 에 문자열 "두 개의 정수를 입력하세요."를 선언한다.
		String example = "예)4 5";
//		변수 example 에 문자열 "예)4 5"를 선언한다.
		String format = "%d * %d = %d";
//		변수 format 에 문자열 "%d * %d = %d"를 선언한다.
		
		int number1 = 0, number2 = 0,result = 0;
//		변수 number1, number2, result 를 정수형으로 선언한다.
		
		System.out.println(message);
//		변수 message 를 출력한다.
		System.out.println(example);
//		변수 example 을 출력한다.
		number1 = Integer.parseInt(scanner.next());
//		사용자로부터 입력 받은 문자열을 정수형으로 변환해 변수 number1에 선언한다.
		number2 = Integer.parseInt(scanner.next());
//		사용자로부터 입력 받은 문자열을 정수형으로 변환해 변수 number2에 선언한다.
		result = number1 * number2;
//		변수 result 에 변수 number1, number2 두 개를 곱한 값을 선언한다.
		System.out.printf(format, number1, number2, result);
//		변수 format, number1, number2, result 를 출력한다.

	}
}
