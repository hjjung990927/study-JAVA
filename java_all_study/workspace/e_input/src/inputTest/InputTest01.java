package inputTest;

import java.util.Scanner;

public class InputTest01 {
	public static void main(String[] args) {
		String nameMessage = "이름: ";
//		변수 nameMessage에 문자형 "이름: "을 선언한다.
		String name = "";
//		변수 name 에 문자형을 선언한다.
		Scanner sc = new Scanner(System.in);
//		사용자로부터 입력을 받을 수 있게 도와주는 스캐너를 생성한다.
		System.out.println(nameMessage);
//		변수 nameMessage를 출력한다.
		name = sc.next();
//		메소드 next 를 사용해 사용자로부터 입력을 받는다.
		System.out.println(name);
//		변수 name 을 선언한다
	}
}
