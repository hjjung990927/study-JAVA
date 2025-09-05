package stringTest;

import java.util.Iterator;

public class StringTest {
	public static void main(String[] args) {
//		문자열 String 의 초기값은 ""이 아니라 null 이다.
		
//		String data = "";
//		선언 후 문자열 연결 사용하고자 한다면, ""(빈 문자열)로 초기화한다.
		
//		String data = null;
//		선언 후 문자열 연결을 사용하지 않으면, null 로 초기화한다.
		
//		data += "ABC";
//		System.out.println(data);
//		
//		data = "ABC";
//		System.out.println(data);
		
//		String data = "ABC";
//      System.out.println(data.length());
//      System.out.println(data.charAt(2));
//      System.out.println(data.indexOf('Z'));
		
		String data = "CABC";
		System.out.println(data.indexOf('C'));
//		C가 처음 나타나는 위치의 인덱스 값 = 0
		System.out.println(data.lastIndexOf('C'));
//		C가 마지막으로 나타나는 위치의 인덱스 값 = 3
		System.out.println(data.contains("C"));
//		C가 포함 되어 있으므로 결과값은 true
		System.out.println(data.contains("Z"));
//		Z가 포함 되어 있지 않아 결과값은 false
		System.out.println(data.substring(1));
//		인덱스 값 1부터 끝까지 출력 = ABC
		System.out.println(data.substring(1, 2));
		System.out.println(data.substring(1, 3));
		System.out.println(data.replace('A', 'Z'));
		System.out.println(data.replace('C', 'Z'));
		System.out.println(data.replaceAll("ABC", "Z"));
		
//		문자열 값 비교 ==> equals
//		String data1 = "ABC";
//		String data2 = "ABC";
//		System.out.println(data1.equals(data2));
		
//		String data = "1,2,3,4,5,";
//		String[] arData = data.split(",");
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		String data = "가 나 다 라 마 바 사";
//		String[] arData = data.split(" ");
//		for (int i = 0; i < arData.length; i++) {			
//			System.out.println(arData[i]);
//		}
		
//      "www.naver.com/news";
//      String url = "www.naver.com/news";
//      String[] arData = url.split("/");
//      String target = arData[arData.length - 1];
//      뉴스 페이지로 이동     
//      if(target.equals("news")) {
//         
//      }		
	}
}
