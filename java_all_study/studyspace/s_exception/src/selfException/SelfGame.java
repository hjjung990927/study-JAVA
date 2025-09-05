package selfException;

import java.util.Scanner;

public class SelfGame {
	public void checkNickname(String nickName) throws SelfGameException{
		if(nickName.contains("운영자") || nickName.contains("관리자") || nickName.contains("admin")) {
			throw new SelfGameException();			
		}
								
	}
																				
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelfGame game = new SelfGame();
		
		System.out.println("닉네임 입력: ");
		String nickName = sc.next();
		
		try {
			game.checkNickname(nickName);
		} catch (SelfGameException e) {
			System.out.println("닉네임에 제한되는 단어가 있다.");
		}
		System.out.println(nickName);
		
	}
}

