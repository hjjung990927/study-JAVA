package arrayTest;

public class ArrTest {
	public static void main(String[] args) {
//		arrData에 2차원 배열을 선언한다.
		int[][] arrData = {
				{3, 4, 5},
				{7, 8, 9}
		};
		
//		2차원 배열은 행부터 정리해야 한다.
//		2차원 배열 arrData의 행(row)의 길이를 구한다.
//		int rowLength = arrData.length;
//		2차원 배열 arrData의 열(column)의 길이를 구한다.
//		int colLength = arrData[0].length;
//		2차원 배열 arrData 전체 요소의 갯수(행 * 열)를 구한다.
//		int length = rowLength * colLength;
//		
//		for (int i = 0; i < length; i++) {
//			System.out.println(arrData[i / 3][i % 3]);
//		}
		
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}
	}
}
