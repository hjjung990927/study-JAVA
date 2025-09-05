package controlStatementTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
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
 
		System.out.println(title);
		System.out.println(menu);
      
		choice = sc.nextInt();
		
//		switch 문에서 실수는 사용할 수 없다.
		switch(choice) {
		case 1:
			resultMessage = redMessage;
			break;
//		입력 받은 수가 1이면 resultMessage값에 redMessage를 저장하고,
//		break 가 있어 실행 후 switch 문을 종료한다.
		case 2:
			resultMessage = yellowMessage;	
			break;
//		입력 받은 수가 2라면 resultMessage값에 yellowMessage를 저장하고,
//		break 가 있어 실행 후 switch 문을 종료한다.		
		case 3:
			resultMessage = blackMessage;
			break;
//		입력 받은 수가 3이라면 resultMessage값에 blackMessage를 저장하고,
//		break 가 있어 실행 후 switch 문을 종료한다.	
		case 4:
			resultMessage = whiteMessage;
			break;
//		입력 받은 수가 4라면 resultMessage값에 whiteMessage를 저장하고,
//		break 가 있어 실행 후 switch 문을 종료한다.	
		default:
			resultMessage = errorMessage;
			break;
//		어느 경우에도 해당하지 않는다면 resultMessage값에 errorMessage를 저장하고,
//		break 가 있어 실행 후 switch 문을 종료한다.	
		}
  
		System.out.println(resultMessage);
	}
}
