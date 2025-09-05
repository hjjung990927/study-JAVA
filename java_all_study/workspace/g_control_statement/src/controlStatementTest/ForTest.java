package controlStatementTest;

public class ForTest {
	public static void main(String[] args) {
//		이름 10번 출력
//		for(int i = 0; i < 10; i = i + 1) {
//			System.out.println(i + 1 + ".정희준");
//		}
		
//		이름 10번 출력
//		대신 i 는 10~1까지 역순으로 출력한다.
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i + ".정희준");
		}
//		변수 i 를 10에서부터 1까지 감소시키며 ".정희준"을 출력한다.
//		for 문 => 몇 번 반복할 지 알 때 사용한다.
	}
}
