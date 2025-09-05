package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		1 ~ 10까지 배열에 담고 출력
//		int[] arData1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		배열 arData1에 1~10까지의 수를 입력한다.
//		for (int i = 0; i < arData1.length; i++) {
//			System.out.print(arData1[i] + " ");
//		}
//		배열 arData1의 값을 차례로 띄어쓰며 출력한다.
//		
//		System.out.println("\n");
//		가독성을 위한 줄바꿈
//		
//		10 ~ 1까지 중 짝수만 배열에 담고 출력
//		int[] arData2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//		배열 arData2에 1~10까지의 수를 거꾸로 입력한다.
//		for (int i = 0; i < arData2.length; i++) {
//			if((arData2[i] + 1) % 2 == 0) {
//			배열 arData[i] 값이 짝수인지 검사한다.
//				System.out.print(arData2[i] + 1 + " ");
//				짝수가 맞다면 출력한다.
//			}
//		}
//		
//		System.out.println("\n");
//		가독성을 위한 줄바꿈
//		
//		1 ~ 100까지 배열에 담은 후 홀수만 출력
//		int[] arData3 = new int[100];
//		배열 arData3에 100칸의 값을 저장한다.
//		for (int i = 0; i < arData3.length; i++) {
//			arData3[i] = i + 1;
//		}
//		배열 arData3에 1부터 순서대로 값이 입력된다.
//		for (int i = 0; i < arData3.length; i++) {
//			if(arData3[i] % 2 == 1) {
//			배열 arData3[i] 값이 홀수인지 검사한다.
//				System.out.print(arData3[i] + " ");
//				홀수가 맞다면 출력한다.
//			}
//		}
//		
//		System.out.println("\n");
//		
//		001.png ~ 010.png 를 배열에 담고 출력
//      i / 10 < 1      : 00
//      i / 10 < 10      : 0
//      i / 10 < 100   : 
//		
//		String[] arData4 = new String[10];
//		
//		for (int i = 0; i < 10; i++) {
//		매 반복마다 이전 값을 초기화 해준다.
//			String imageName = "";
//			String zero = "";
//			
//			if ((i + 1) / 10 < 1) {
//				zero = "00";
//			}
//			1의 자리수는 앞에 0을 2개 붙인다.
//			else if ((i + 1) / 10 < 10) {
//				zero = "0";
//			}
//			10의 자리수는 앞에 0을 1개 붙인다.
//			
//			만약 위 조건식이 모두 false 이면 zero 에는 초기값인 ""이 들어있다.
//			100의 자리수는 앞에 0을 붙이지 않는다.
//			
//			imageName += zero;
//			앞에 붙여야 할 0을 붙여준다.
//			imageName += i + 1;
//			이미지 번호를 붙여준다.
//			imageName += ".png ";
//			확장자를 붙여준다.
//			arData4[i] = imageName;		
//			각 파일의 이름을 배열에 담아준다.
//		}
//		
//		for (int i = 0; i < arData4.length; i++) {
//			System.out.print(arData4[i]);
//		}
//		
//		System.out.println("\n");
//	
//      1 ~ 100까지 배열에 담은 후 짝수의 합 출력		
//		int[] arData5 = new int[100];
//		int sum = 0;
//		for (int i = 0; i < arData5.length; i++) {
//			arData5[i] = i + 1;
//		}
//		for (int i = 0; i < arData5.length; i++) {
//			if((arData5[i]) % 2 == 0) {
//				sum = arData5[i] + sum;
//			}
//		}
//		System.out.print(sum);
//		
//		System.out.println("\n");
//		
//      A ~ F까지 배열에 담고 출력
//		char[] arData6 = new char[6];
//		for(int i = 0; i < 6; i++) {
//			arData6[i] = (char)(65 + i);
//			System.out.print(arData6[i]);
//		}
//		
//		System.out.println("\n");
//		
//      A ~ F까지 중 C를 제외하고 배열에 담은 후 출력
//		char[] arData7 = new char[6];
//		for (int i = 0; i < arData7.length; i++) {
//			if(i < 2) {
//				arData7[i] = (char)(65 + i);
//			}
//			else if(i == 2) {
//				continue;
//			}
//			else if(i > 2) {
//				arData7[i] = (char)(65 + i);
//			}
//			System.out.print(arData7[i]);
//		}
//		
//		System.out.println("\n");
//		
//		5개의 변수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		단, 같은 수는 없다고 가정한다.
//		Scanner sc1 = new Scanner(System.in);
//		String message = "5개의 정수를 입력하시오. ";
//		System.out.println(message);
//		int[] arData8 = new int[5];
//		int max = 0;
//		int min = 0;
//		for (int i = 0; i < arData8.length; i++) {
//			arData8[i] = sc1.nextInt();
//		}
//		max = arData8[0];
//		min = arData8[0];
//		for (int i = 0; i < arData8.length; i++) {
//			if(arData8[i] > max) {
//				max = arData8[i];
//			}
//			if(arData8[i] < min) {
//				min = arData8[i];
//			}
//		}
//		System.out.println("최대 값: " + max);
//		System.out.println("최소 값: " + min);
		
//		사용자에게 칸 수를 입력받고, 그 칸 수 만큼 정수를 다시 입력받는다.
//		입력한 정수들의 평균값을 구한다.
//      int[] arData = null;
//      int length = 0;
//      int total = 0;
//      double average = 0.0;
//      Scanner scanner = new Scanner(System.in);
//      String lengthMessage = "몇 개의 정수를 입력하시나요?";
//      String numberMessage = "개의 정수를 입력해주세요\n예)3 4 1 2";
//      
//      System.out.println(lengthMessage);
//      length = scanner.nextInt();
//      
//      arData = new int[length];
//      
//      System.out.println(length + numberMessage);
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = scanner.nextInt();
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         total += arData[i];
//      }
//      
//      average = (double)total / arData.length;
//      
//      System.out.println(average);
		
//		(1) 1~100까지 중 홀수만 배열에 담기
//		(2) 1~100까지 중 짝수만 배열에 담기
//		(3) 두 배열을 합쳐 1~100까지 배열에 담고 각 요소 출력하기	
//		int length = 50;
//		
//	    int[] arOddData = new int[length];
//	    int[] arEvenData = new int[length];
//	    int[] arData = new int[length * 2];
//	      
//	    for (int i = 0; i < arOddData.length; i++) {
//	       arOddData[i] = i * 2 + 1;
//	       arEvenData[i] = (i + 1) * 2;
//	    }
//	      
//	    for (int i = 0; i < arEvenData.length; i++) {
//	       arData[i * 2 + 1] = arEvenData[i];
//	    }
//	    for (int i = 0; i < arOddData.length; i++) {
//	       arData[i * 2] = arOddData[i];
//	    }
//	      
//	    for (int i = 0; i < arData.length; i++) {
//	       System.out.println(arData[i]);
//	    }
	
//		당신은 3칸 방이 있는 건물주이다.
//		각 방에는 세입자가 살고 있다.
//		방마다 월세를 받아서 총 월세와 평균 월세를 구해주는 프로그램을 만들고자 한다.
//		Scanner sc = new Scanner(System.in);
//		
//		int[] room = new int[3];
//		int pay = 0; 
//		double payavg = 0.0;
//		for (int i = 0; i < room.length; i++) {
//			System.out.println("10" + (i + 1) + " 호의 월세를 입력하시오.");
//			room[i] = sc.nextInt();
//		}
//		for (int i = 0; i < room.length; i++) {
//			pay = room[i] + pay;
//			payavg = (double)pay / room.length;
//			payavg = Double.parseDouble(String.format("%.3f", payavg));
//		}
//		System.out.println("총 월세: " + pay);
//		System.out.println("평균 월세: " + payavg);
		
		
		int[] arOriginalData = { 9, 1, 9, 2, 9 };
//		배열 arOriginalData에 9, 1, 9, 2, 9 5개의 정수를 선언한다.
        boolean[] arCheck = new boolean[5];
//      배열 arCheck에 5칸의 논리형을 선언합니다.
        int[] arData = null;
//      배열 arData에 null 값을 선언합니다.
//      중복 제거 후 담을 새 배열
        int count = 0, index = 0;
//		변수 count, index 에 0을 선언합니다.
//      count = 중복된 값의 수 , index = 중복 제거 후 새 배열에 값을 넣을 위치
        for (int i = 0; i < arOriginalData.length - 1; i++) {
           for (int j = i + 1; j < arOriginalData.length; j++) {
              if (arOriginalData[i] == arOriginalData[j]) {
                 count++;
                 arCheck[i] = true;
//               i 번째 요소에 중복된 값이 있으면 true
                 break;
              }
           }
        }
//      arCheck 경우의 수
//      i = 0 => 9 ! true ! 
//      j = 1 => 1 , j = 2 => 9 , 중복 발생
        
//		i = 1 => 1 ! false !
//      j = 2 => 9 , j = 3 => 2 , j = 4 => 9 , 중복 발생 x
        
//      i = 2 => 9 ! true !
//      j = 3 => 2 , j = 4 => 9 , 중복 발생
        
//      i = 3 => 2 ! false !
//      j = 4 => 9 , 중복 발생 x
        
//      i = 4 => 마지막으로 비교 x ! false !
        
        arData = new int[arOriginalData.length - count];
//      중복이 발생된 갯수만큼 줄인 배열 생성
//      즉, 5칸 중 중복된 갯수 2개를 줄인 3칸을 가진 배열이 생성된다.
        for (int i = 0; i < arCheck.length; i++) {
           if(!arCheck[i]) {
              arData[index++] = arOriginalData[i];
           }
//         ! = NOT
//         arCheck에서 true 가 아닌 false 값, 즉 중복이 없는 값을 arData에 담는다.
        }
        
        for (int i = 0; i < arData.length; i++) {
           System.out.println(arData[i]);
        }
	}			
}
