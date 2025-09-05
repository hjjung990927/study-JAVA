package arrayTest;

public class ArTest {
	public static void main(String[] args) {
//		int[] arData = {2, 4, 5, 6, 8};
//		
//		System.out.println(arData);
//		System.out.println(arData[0]);
//		
//		for(int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
//		
//		5칸 배열 선언 후, 5, 4, 3, 2, 1 넣고 출력
		int[] arData = new int[5];
//		정수형 배열 arData에 5칸의 값을 선언한다.
		for (int i = 0; i < arData.length; i++) {
//		배열 arData은 5칸을 갖고 있어 i < 5와 같은 의미를 갖는다.
//		하지만 가독성과 유지보수성 때문에 주로 i < 배열명.length; 를 사용한다.
			arData[i] = 5 - i;
		}				
//		배열 arData의 각 값에 5 - i 값을 저장한다.
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
//		배열 arData의 모든 값을 순서대로 출력한다.
	}
}
