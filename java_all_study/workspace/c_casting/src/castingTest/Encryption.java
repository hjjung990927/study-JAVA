package castingTest;

public class Encryption {
	public static void main(String[] args) {
		String password = "ehdtjrdl1234";
//		변수 password 에 문자열 ehdtjrdl1234를 선언한다.
		String encryptedPassword = "", decryptedPassword = "";
//		두 개의 변수 encryptedPassword 와 decrtyptedPassword 에 각각 문자열을 선언한다.
		final int KEY = 3;
//		변수 KEY 에 정수형 3을 선언하되, 값을 변경할 수 없도록 선언한다.
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char)(password.charAt(i) * KEY);
		}
		
		System.out.println(encryptedPassword);
//		변수 encryptedPassword를 출력한다.
		for (int i = 0; i < encryptedPassword.length(); i++) {
			decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
		}
		
		System.out.println(decryptedPassword);
//		변수 decryptedPassword를 출력한다.
	}
}
