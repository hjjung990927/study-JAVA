package selfException;

import java.util.Scanner;

public class SelfChatting {
//  throws: 메소드 내에서 해당 예외를 처리하지 않고
//  메소드를 사용한 부분에서 처리할 때 사용한다.
//  하나의 메소드 내에 같은 예외가 반복해서 발생하면,
//  매번 try ~ catch 문을 사용하는 것은 번거롭기 때문에
//  throws 를 작성한 뒤 해당 메소드를 사용한 부분에서 
//  딱 1번만 try ~ catch 문을 사용한다.
	public void chat(String message) throws SelfChattingException{
		if(message.contains("바보")) {
			throw new SelfChattingException();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SelfChatting chatting = new SelfChatting();
		
		while(true) {
			System.out.println("메세지: ");
			String context = sc.next();
			try {
				chatting.chat(context);
				System.out.println(context);
			} catch (SelfChattingException e) {
				System.out.println("삐~");
			}
		}
	}
}
