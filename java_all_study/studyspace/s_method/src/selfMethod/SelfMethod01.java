package selfMethod;

import java.util.Scanner;

public class SelfMethod01 {
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
	int subtract(int[] arNumber) {
		int result = 0;
		arNumber[0] *= -1;
		for (int i = 0; i < arNumber.length; i++) {
			result -= arNumber[i];
		}
		return result;
	}
	
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//	return 값은 반드시 1개만 가능하다.
	int[] divide(int n1, int n2) {
		int[] arResult = new int[2];
		
		if(n2 != 0) {
			arResult[0] = n1 / n2;
			arResult[1] = n1 % n2;
			return arResult;
		}
		return null;
	}

	
//	1 ~ n까지의 합을 구해주는 메소드
	int add(int n) {
		int result= 0;
		for (int i = 0; i < n; i++) {
			result += i + 1;
		}
		return result;
	}
	
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeABC(String sentence) {
		String result = "";
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			
			if(c >= 97 && c <= 122) {				
				result += (char)(c - 32);				
			}
			else if(c >= 65 && c <= 90) {				
				result += (char)(c + 32);				
			}
			else {
				result += c;
			}
		}
		return result;
	}

//	한글을 정수로 바꿔주는 메소드
//	일공이사 -> 1024
	int changeHangeul(String kor) {
		String hangeul = "공일이삼사오육칠팔구";
		String result = "";
		
		for (int i = 0; i < kor.length(); i++) {
			result = result + hangeul.indexOf(kor.charAt(i));
		}
		return Integer.parseInt(result);
	}
	
//	정수를 한글로 바꿔주는 메소드
//	1024 -> 일공이사
	String changeNumber(int number) {
		String hangeul = "공일이삼사오육칠팔구";
		String result = "";
		
		while(number != 0) {
			result = hangeul.charAt(number % 10) + result;
			number = number / 10;
		}
		return result;

	}
	
//	문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//	입력 예) banana, a
//	출력 예) 3
	int getCount(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {			
				count ++;
			}
		}
		return count;
	}	
	
//	1~100을 입력받고 짝수만 리턴하는 메소드
	int[] getEven(int[] arEven) {
		int[] even = new int[50];
		for (int i = 0; i < even.length; i++) {
			even[i] = arEven[i * 2 + 1];
		}
		return even;
	}
	
//	숙제
//	문제 5개 만들어서 풀어오기
//	(1) 세 정수를 입력 받아서 가장 큰 값과 가장 작은 값을 출력하는 메소드
	void printMaxMin(int[] arNumber) {
		int max = arNumber[0];
		int min = arNumber[0];
//		배열에 들어 있는 첫 번째 값으로 초기화해야
//		어떤 값이 들어오든 정확한 비교가 된다.
		for (int i = 0; i < arNumber.length; i++) {
			if(arNumber[i] > max) {
				max = arNumber[i];
			}
			if(arNumber[i] < min) {
				min = arNumber[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SelfMethod01 methodTask = new SelfMethod01();
//		methodTask.printFrom1To10();
		
//		methodTask.printHong(1);
		
//		String message = "이름: ";
//		System.out.println(message);
//		methodTask.printName(5, sc.next());
		
//		int arNumber[] = {3, 4, 1};
//		int result = methodTask.subtract(arNumber);
//		System.out.println(result);
		
//		int[] arResult = methodTask.divide(10 , 5);
//		if(arResult == null) {
//			System.out.println("0은 나눌 수 없다.");
//		}
//		else {
//			System.out.println("몫: " + arResult[0]);
//			System.out.println("나머지: " + arResult[1]);
//		}
		
//		int result = methodTask.add(10);
//		System.out.println(result);
		
//		String result = methodTask.changeABC("AbCdEfG");
//		System.out.println(result);
		
//		int result = methodTask.changeHangeul("오오칠육칠사공육");
//		System.out.println(result);
		
//		String result = methodTask.changeNumber(55767406);
//		System.out.println(result);
		
//		int count = methodTask.getCount("banana", 'a');
//		System.out.println(count);
		
//		int[] arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//		}
//		int[] arEven = methodTask.getEven(arData);
//		
//		for (int i = 0; i < arEven.length; i++) {
//			System.out.println(arEven[i]);
//		}
		
//		int[] arMaxMin = {5, 8, 7};
//		methodTask.printMaxMin(arMaxMin);
	}
}
