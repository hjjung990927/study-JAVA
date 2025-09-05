package constantTest;

public class ConstantTest {
	public static void main(String[] args) {
		final int ON = 187568;
//		변수 ON을 변경할 수 없는 값 187568로 선언한다.
		final int OFF = 187455;
//		변수 OFF를 변경할 수 없는 값 187455로 선언한다.
		System.out.println(ON);
//		변수 ON을 출력한다.
		System.out.println(OFF);
//		변수 OFF를 출력한다.
		
		final int LOGIN_SUCCESS_STATUS = 0;
//		변수 LOGIN_SUCCESS_STATUS를 변경할 수 없는 값 0으로 선언한다.
		final int LOGIN_FAIL_STATUS = 1;
//		변수 LOGIN_FAIL_STATUS를 변경할 수 없는 값 1으로 선언한다.
		final int LOGIN_ADMIN_STATUS = 2;
//		변수 LOGIN_ADMIN_STATUS를 변경할 수 없는 값 2으로 선언한다.
		
		System.out.println(LOGIN_SUCCESS_STATUS);
//		변수 LOGIN_SUCCESS_STATUS를 선언한다.
		System.out.println(LOGIN_FAIL_STATUS);
//		변수 LOGIN_FAIL_STATUS를 선언한다.
		System.out.println(LOGIN_ADMIN_STATUS);
//		변수 LOGIN_ADMIN_STATUS를 선언한다.
	}
}
