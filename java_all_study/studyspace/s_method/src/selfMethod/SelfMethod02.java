package selfMethod;

import java.util.Iterator;
import java.util.Scanner;

public class SelfMethod02 {
//	1 ~ 10까지 println()으로 출력하는 메소드
	void printFrom1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
		
//	"홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("홍길동");
		}
	}
		
//	이름을 n번 println()으로 출력하는 메소드
	void printName(int n, String name) {
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
//	세 정수의 뺄셈 메소드
	void subtract(int n1, int n2, int n3) {
		int result = n1 - n2 - n3;
		System.out.println(result);
	}
	
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//	return 값은 반드시 1개만 가능하다.
	void divide(int n1, int n2) {
		int[] arResult = new int[2];
		
		if(n2 != 0) {
			arResult[0] = n1 / n2;
			System.out.println("몫: " + arResult[0]);
			arResult[1] = n1 % n2;
			System.out.println("나머지: " + arResult[1]);
		} else {
			System.out.println("두 번째 정수는 0이 올 수 없습니다.");
		}
	}
	
//  1 ~ n까지의 합을 구해주는 메소드
	int add(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += i + 1;
		}
		return result;
	}
	
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeABC(String sentence) {
		String result= "";
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			
			if(c >= 97 && c <= 122) {
				result += (char)(c - 32);
				
			}else if(c >= 65 && c <= 90) {
				result += (char)(c + 32);
				
			}else {
				result += c;
			}
		}
		return result;
	}
	
//  한글을 정수로 바꿔주는 메소드
//  일공이사 -> 1024
	int changeToInt(String sentence) {
		String hangeul = "공일이삼사오육칠팔구";
		String result = "";
		
		for (int i = 0; i < sentence.length(); i++) {
			result = result + hangeul.indexOf(sentence.charAt(i));
		}
		return Integer.parseInt(result);
	}
	
//	정수를 한글로 바꿔주는 메소드
//	1024 -> 일공이사
	
//	한글을 정수로 변환하고, 정수에 1을 더해 다시 한글로 바꿔주는 메소드
	
//	문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//	입력 예) banana, a
//	출력 예) 3
	
//	1~100을 입력받고 짝수만 리턴하는 메소드
	
//	1부터 n 까지 정수 중 2의 배수이면서 7의 배수가 아닌 수만 출력하는 메소드
	
//	정수 배열을 입력 받아서 그 안에 있는 짝수의 개수를 반환하는 메소드 작성
	
//	정수를 입력받아 각 자리 수의 합을 구하는 메소드
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	
//	여러 정수의 뺄셈 메소드
	public static void main(String[] args) {
		SelfMethod02 methodTask = new SelfMethod02();
		Scanner sc = new Scanner(System.in);
		
//		1 ~ 10까지 println()으로 출력하는 메소드
//		methodTask.printFrom1To10();
		
//		"홍길동"을 n번 println()으로 출력하는 메소드
//		methodTask.printHong(5);
		
//		이름을 n번 println()으로 출력하는 메소드
//		System.out.println("이름을 입력하시오.");
//		String name = sc.next();
//		methodTask.printName(5, name);
		
//		세 정수의 뺄셈 메소드
//		methodTask.subtract(0, 10, 3);
		
//		두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//		return 값은 반드시 1개만 가능하다.
//		methodTask.divide(10, 3);
		
//  	1 ~ n까지의 합을 구해주는 메소드
//		int result = methodTask.add(10);
//		System.out.println(result);
		
//		문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//		System.out.println("문자열을 입력하시오.");
//		String input = "";
//		input = sc.next();
//		String result = methodTask.changeABC(input);
//		System.out.println(result);
		
//  	한글을 정수로 바꿔주는 메소드
//  	일공이사 -> 1024
//		int result = methodTask.changeToInt("일공이사");
//		System.out.println(result);
		
//		정수를 한글로 바꿔주는 메소드
//		1024 -> 일공이사
		
//		한글을 정수로 변환하고, 정수에 1을 더해 다시 한글로 바꿔주는 메소드
		
//		문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//		입력 예) banana, a
//		출력 예) 3
		
//		1~100을 입력받고 짝수만 리턴하는 메소드
		
//		1부터 n 까지 정수 중 2의 배수이면서 7의 배수가 아닌 수만 출력하는 메소드
		
//		정수 배열을 입력 받아서 그 안에 있는 짝수의 개수를 반환하는 메소드 작성
		
//		정수를 입력받아 각 자리 수의 합을 구하는 메소드
		
//		5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	}
}
