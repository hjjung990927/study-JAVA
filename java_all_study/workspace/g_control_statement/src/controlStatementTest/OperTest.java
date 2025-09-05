package controlStatementTest;

public class OperTest {
	public static void main(String[] args) {
//		1 ~ 10까지 중 4까지만 출력한다.
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i + 1);
//			if(i == 3) {
//				break;
//			}
//		}
		
//		1 ~ 10까지 중 4를 제외하고 출력한다.
		for(int i = 0; i < 10; i++) {
//		i 는 0부터 9까지 총 10번을 반복한다.
			if(i == 3) {
				continue;
			}
			System.out.println(i + 1);
//			i == 3일 때의 값을 건너뛰고 나머지 값은 (i+1)을 출력한다.
		}				
	}
}
