package controlStatementTest;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		
//      //      심리 테스트
//      
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
      
		Scanner sc = new Scanner(System.in);
		String title = "Q. 당신이 좋아하는 색을 선택하세요.";
		String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
		int choice = 0;
		String redMessage = "불같고 열정적이고 적극적이다.";
		String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "잘못 입력하셨습니다.";
		String resultMessage = "";
      
		boolean condition1 = false, condition2 = false;
		boolean condition3 = false, condition4 = false;
//		boolean 형은 초기값을 false 로 설정된다.
//		예시)int 형: 0, String 형: "",...
      
		System.out.println(title);
		System.out.println(menu);
      
		choice = sc.nextInt();
      
		condition1 = choice == 1;
//		사용자로부터 입력 받은 값이 1과 같은지 비교해 condition1에 참과 거짓을 선언한다.
		condition2 = choice == 2;
//		사용자로부터 입력 받은 값이 2와 같은지 비교해 condition2에 참과 거짓을 선언한다.
		condition3 = choice == 3;
//		사용자로부터 입력 받은 값이 3과 같은지 비교해 condition3에 참과 거짓을 선언한다.
		condition4 = choice == 4;
//		사용자로부터 입력 받은 값이 4와 같은지 비교해 condition1에 참과 거짓을 선언한다.
      
		if(condition1) {
			resultMessage = redMessage;
//		condition1에 참이 되는 입력을 받았으면 resultMessage에 redMessage를 저장한다.
         
		} else if(condition2) {
			resultMessage = yellowMessage;
//		condition2에 참이 되는 입력을 받았으면 resultMessage에 yellowMessage를 저장한다.
         
		} else if(condition3) {
			resultMessage = blackMessage;
//		condition3에 참이 되는 입력을 받았으면 resultMessage에 blackMessage를 저장한다.         
		} else if(condition4) {
			resultMessage = whiteMessage;
//		condition4에 참이 되는 입력을 받았으면 resultMessage에 whiteMessage를 저장한다.
		} else {
			resultMessage = errorMessage;
//		모든 조건이 거짓일 때 resultMessage에 errorMessage를 저장한다. 
		}
      
		System.out.println(resultMessage);
   
	}
}
