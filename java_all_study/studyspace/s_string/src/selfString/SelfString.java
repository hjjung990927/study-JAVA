package selfString;

import java.util.Iterator;
import java.util.Scanner;

public class SelfString {
	public static void main(String[] args) {
//		1 ~ 10까지 배열에 담고 출력
//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			System.out.print(arData[i]);
//		}
		
	
//		1 ~ 100까지 배열에 담은 후 홀수만 출력
//		int[] arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			if((arData[i]) % 2 == 0) {
//				System.out.println(arData[i] - 1);
//			}
//		}
		
		
//		001.png ~ 010.png 를 배열에 담고 출력
//		String[] arData = new String[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = String.format("%03d.png", i + 1);
//			String.format(): 문자열을 형식화하는 데 사용되는 메소드
//			i + 1: 인덱스는 0부터 시작하므로 파일 번호는 1부터 시작
//			%03d.png: 3자리 정수로 표현, 빈자리는 0으로 채움, .png 파일 확장자 추가
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		
//		1 ~ 100까지 배열에 담은 후 짝수의 합 출력
//		int[] arData = new int[100];
//		int sum = 0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			if((i + 1) % 2 == 0) {
//				sum = arData[i] + sum;
//			}
//		}
//		System.out.println(sum);
		
		
//		A ~ F까지 배열에 담고 출력
//		char[] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//			System.out.println(arData[i]);
//		}
		
		
//		A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		char[] arData = new char[5];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)((i > 1 ? 66 : 65) + i);
//			System.out.println(arData[i]);
//		}
		
		
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		단, 같은 수는 없다고 가정한다.
//		Scanner sc = new Scanner(System.in);
//		int[] arData = new int[5];
//		int max = 0, min = 0;
//		System.out.println("정수 5개 입력하기");
//
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = sc.nextInt();
//		}
//		max = arData[0];
//		min = arData[0];
//		for (int i = 0; i < arData.length; i++) {
//			if(max < arData[i]) {
//				max = arData[i];
//			}
//			if(min > arData[i]) {
//				min = arData[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
		
		
		
//		사용자에게 칸 수를 입력받고, 그 칸 수만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.
		
		
//		(1) 1~100까지 중 홀수만 배열에 담기
//		(2) 1~100까지 중 짝수만 배열에 담기
//		(3) 두 배열을 합쳐서 1~100까지 배열에 담고 각 요소 출력하기
		
		
//		당신은 3칸 방이 있는 건물주이다.
//		각 방에는 세입자가 살고있다.
//		방마다 월세를 받아서 총 월세와 평균 월세를 구해주는 프로그램.
//		Scanner sc = new Scanner(System.in);
//		
//		int[] room = new int[3];
//		int pay = 0; 
//		double payavg = 0.0;
//		System.out.println("각 방의 월세를 입력하시오.");
//		for (int i = 0; i < room.length; i++) {
//			room[i] = sc.nextInt();
//		}
//		for (int i = 0; i < room.length; i++) {
//			pay = room[i] + pay;
//			payavg = (pay / 3);
//		}
//		System.out.println("총 월세: " + pay);
//		System.out.println("평균 월세: " + payavg);
	}
}
