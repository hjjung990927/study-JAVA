package projectlogin;

import java.util.Scanner;

public class LoginPage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LoginService loginService = new LoginService();

		while (true) {
			System.out.println("==========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 회원 전체 보기");
			System.out.println("0. 종료");
			System.out.print("선택 > ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if (choice == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (choice == 1) {
				System.out.print("아이디: ");
				String id = sc.nextLine();
				
				System.out.print("비밀번호: ");
				String password = sc.nextLine();
				
				System.out.print("주소: ");
				String address = sc.nextLine();
				
				System.out.print("이메일: ");
				String email = sc.nextLine();
				
				User newUser = new User(id, password, address, email);
				loginService.join(newUser);
				
			} else if (choice == 2) {
				System.out.print("아이디: ");
				String id = sc.nextLine();
				
				System.out.print("비밀번호: ");
				String password = sc.nextLine();
				
				loginService.login(id, password);
				
			} else if (choice == 3) {
				
			} else if (choice == 4) {
				
			} 
		}
	}
}
