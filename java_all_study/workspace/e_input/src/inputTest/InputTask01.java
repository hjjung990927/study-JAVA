package inputTest;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
		String petNameMessage = "반려동물의 이름을 입력해주세요.";
//		변수 petNameMessage에 문자열 "반려동물의 이름을 입력해주세요."를 선언한다.
		String petName = "";
//		변수 petName을 문자열로 선언한다.
		
		Scanner sc = new Scanner(System.in);
//		사용자로부터 입력을 받을 수 있게 도와주는 스캐너를 생성한다.
		System.out.println(petNameMessage);
//		변수 petNameMessage를 출력한다.
		petName = sc.next();
//		메소드 next 를 사용해 사용자로부터 입력을 받는다.
		
		System.out.println(petName);
//		변수 petName을 출력한다.
	}
}
