package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중
//		소문자는 모두 대문자로, 대문자는 모두 소문자로 변경한다.
//		소문자 범위: 97 ~ 122
//		대문자 범위: 65 ~ 90
//		String message = "문자열을 입력하시오.";
//		String data = null, result = "";
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print(message);
//		
//		data = sc.nextLine();
//		
//		for (int i = 0; i < data.length(); i++) {
//			char c = data.charAt(i);
//			
//			if(c >= 97 && c <= 122) {
//				result += (char)(c - 32);
//			}
//			else if(c >= 65 && c <= 90) {
//				result += (char)(c + 32);
//			}
//			else {
//				result += c;
//			}
//		}
//		System.out.print(result);
		
//      사용자에게 입력받은 문자열 중
//      소문자의 총 개수를 출력한다.
//		String message = "문자열을 입력하시오.";
//		String data = null;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print(message);
//		
//		int scount = 0, bcount = 0;
//		소문자, 대문자 갯수 
//		data = sc.nextLine();
//		
//		for (int i = 0; i < data.length(); i++) {
//			char c = data.charAt(i);
//			
//			if(c >= 97 && c <= 122) {
//				scount++;
//			}
//			소문자 갯수
//			else if (c >= 65 && c <= 97) {
//				bcount++;
//			}
//			대문자 갯수
//		}
//		System.out.println("소문자 갯수: " + scount);
//		System.out.print("대문자 갯수: " + bcount);
		
//      아래의 주소에서 "/samsung"만 분리하여 출력한다.
//      www.naver.com/baseball/giants
//		String url = "www.naver.com/baseball/lottegiants";
//		int fromIndex = url.lastIndexOf("l");
//		System.out.print(url.substring(fromIndex));
		
//      아래의 주소들을 배열에 담고, 마지막 경로가 samsung인 것만 출력한다.
//      www.naver.com/baseball/samsung
//      www.naver.com/baseball/lg
//      www.naver.com/baseball/lotte
//      www.naver.com/baseball/kt
//      www.naver.com/phone/samsung
		
		String[] arData = {
				"www.naver.com/baseball/samsung",
				"www.naver.com/baseball/lg",
				"www.naver.com/baseball/lotte",
				"www.naver.com/baseball/kt",
				"www.naver.com/phone/samsung"
		};
		String target = "samsung";
		
		for (int i = 0; i < arData.length; i++) {
			String[] arAddress = arData[i].split("/");
			if(arAddress[arAddress.length - 1].equals(target)) {
				System.out.println(arData[i]);
			}			
		}
	}
}
