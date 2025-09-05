package controlStatementTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message = "1.통신 요금 조회\n2.번호 변경\n3.통신사 변경\n0.상담원 연결";
//		변수 message 를 문자열로 선언한다.
		Scanner scanner = new Scanner(System.in);
//		사용자로부터 입력을 받을 수 있게 도와주는 스캐너를 생성한다.
	    int choice = 0;
//	    변수 choice 를 정수형으로 선언한다.
	    do {
	       System.out.println(message);
	       choice = scanner.nextInt();
	    } while(choice != 0);
//	    사용자가 0을 입력할 때까지 메시지를 출력하고 입력받는다.
//	    do~while 문 => 무조건 한번은 실행해야 할 때 사용된다.
	}
}