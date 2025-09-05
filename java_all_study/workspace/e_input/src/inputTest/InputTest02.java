package inputTest;

import java.util.Scanner;

public class InputTest02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		사용자로부터 입력을 받을 수 있게 도와주는 스캐너를 생성한다.
	    int age = 0;
//	    변수 age 에 정수형을 선언한다.
	    String message = "이름을 입력해주세요.";
//	    변수 message 에 문자열 "이름을 입력해주세요."를 선언한다.
	    String ageMessage = "나이를 입력해주세요.";
//	    변수 ageMessage 에 문자열 "나이를 입력해주세요."를 선언한다.
	    String name = "";
//	    변수 name 에 문자열을 선언한다.
	      
	    System.out.println(ageMessage);
//	    변수 ageMessage를 출력한다.
	    age = scanner.nextInt();	
//	    메소드 next 를 사용해 사용자로부터 입력을 받은 수를 변수 age 에 선언한다.
		scanner.nextLine();
//      nextLine()은 앞에서의 엔터(\n)를 먹기 때문에
//      기존 입력 알고리즘에 문제가 생길 수 있다.
//      따라서 nextLine()으로 입력받기 전 다른 입력이 실행되었다면,
//      반드시 \n 을 먹어줄 nextLine()을 사용해준다.
		
		System.out.println(message);
//		변수 message 를 출력한다
	    name = scanner.nextLine();
//	    메소드 nextLine 을 사용해 사용자로부터 입력을 받은 수를 변수 name 에 선언한다.
	    System.out.println(name);
//	    변수 name 을 출력한다.
	    System.out.println(age + "살");
//	    변수 age 와 뒤에 "살"을 같이 출력한다.
	}
}
