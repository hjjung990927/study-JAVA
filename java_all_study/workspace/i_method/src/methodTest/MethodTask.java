package methodTest;

public class MethodTask {
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
	void printName(String name, int n) {
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
	int[] divide(int number1, int number2) {
		int[] arResult = new int[2];

		if (number2 != 0) {
			arResult[0] = number1 / number2;
			arResult[1] = number1 % number2;
			return arResult;
		}

		return null;
	}

//  1 ~ n까지의 합을 구해주는 메소드
	int getTotal(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += i + 1;
		}
		return result;
	}

//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeABC(String content) {
		String result = "";
		for (int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
			if (c >= 97 && c <= 122) {
				result += (char) (c - 32);
			} else if (c >= 65 && c <= 90) {
				result += (char) (c + 32);
			} else {
				result += c;
			}
		}
		return result;
	}

//  한글을 정수로 바꿔주는 메소드
//  일공이사 -> 1024
	int changeToInteger1(String data) {
		String hangeul = "공일이삼사오육칠팔구";
		String temp = "";
		for (int i = 0; i < data.length(); i++) {
			temp += hangeul.indexOf(data.charAt(i));
		}
		return Integer.parseInt(temp);
	}

//	정수를 한글로 바꿔주는 메소드
//	1024 -> 일공이사
	String changeToHangeul1(int number) {
		String hangeul = "공일이삼사오육칠팔구";
		String result = "";
		while (number != 0) {
			result = hangeul.charAt(number % 10) + result;
			number /= 10;
		}
		return result;
	}

//	문자열과 문자를 입력받고 해당 문자가 몇 개 있는지 구하기
//	입력 예) banana, a
//	출력 예) 3
	int getCount(String content, char c) {
		int count = 0;
		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

//	1~100을 입력받고 짝수만 리턴하는 메소드
	int[] getEven(int[] arData) {
		int[] arEven = new int[50];
		for (int i = 0; i < arEven.length; i++) {
			arEven[i] = arData[i * 2 + 1];
		}
		return arEven;
	}

//	숙제
//	문제 5개 만들고 풀기
//	문제1. 이름과 횟수를 입력받아, 횟수만큼 이름을 줄 바꿔 출력하는 메소드 만들기
	void printNameCount(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}

//	문제2. 1부터 n 까지 정수 중 2의 배수이면서 7의 배수가 아닌 수만 출력하는 메소드
	void printMulti(int n) {
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
	}

//	문제3. 정수 배열을 입력 받아서 그 안에 있는 짝수의 개수를 반환하는 메소드 작성
	int countEven(int[] arData) {
		int count = 0;
		for (int i = 0; i < arData.length; i++) {
			if (arData[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

//	문제4. 정수를 입력받아 각 자리 수의 합을 구하는 메소드
	int printAdd(int number) {
		int sum = 0;

		while (number != 0) {
			sum = sum + number % 10;
			number /= 10;
		}
		return sum;
	}

//	문제5. 여러 정수를 입력 받아서 가장 큰 값과 가장 작은 값을 출력하는 메소드
	void printMaxMin(int[] arNumber) {
		int max = arNumber[0];
		int min = arNumber[0];
		for (int i = 0; i < arNumber.length; i++) {
			if (arNumber[i] > max) {
				max = arNumber[i];
			}
			if (arNumber[i] < min) {
				min = arNumber[i];
			}
		}
		System.out.println("가장 큰 값: " + max);
		System.out.println("가장 작은 값: " + min);
	}

//	문제6. 한글을 정수로 변환하고, 정수에 1을 더해 다시 한글로 바꿔주는 메소드
	int changeToInteger2(String data) {
		String hangeul = "공일이삼사오육칠팔구";
		String temp = "";
		int result = 0;
		for (int i = 0; i < data.length(); i++) {
			temp += hangeul.indexOf(data.charAt(i));
			result = Integer.parseInt(temp) + 1;
		}
		return result;
	}

	String changeToHangeul2(int number) {
		String hangeul = "공일이삼사오육칠팔구";
		String result = "";
		while (number != 0) {
			result = hangeul.charAt(number % 10) + result;
			number /= 10;
		}
		return result;
	}

//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	void getMaxMin(int[] arData, int[] result) {

		for (int i = 0; i < result.length; i++) {
			result[i] = arData[0];
		}
		for (int i = 1; i < arData.length; i++) {
			arData[i] = i + 1;
			if (result[0] < arData[i]) {
				result[0] = arData[i];
			}
			if (result[1] > arData[i]) {
				result[1] = arData[i];
			}
		}
	}

	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
//		메소드를 선언했다면, 반드시 사용해서 테스트한다.

//		methodTask.printFrom1To10();

//		methodTask.printHong(5);

//		Scanner sc = new Scanner(System.in);
//		String nameMessage = "이름을 입력하시오. ";
//		System.out.print(nameMessage);
//		methodTask.printName(sc.next(), 5);

//		int[] arNumber = {3, 4, 1};
//		int result = methodTask.subtract(arNumber);
//		System.out.println(result);

//	    int[] arResult = methodTask.divide(10, 3);	      
//	    if(arResult == null) {
//	       System.out.println("0으로 나눌 수 없습니다.");
//	    }
//	    else {
//	       System.out.println("몫: " + arResult[0]);
//	       System.out.println("나머지: " + arResult[1]);
//	    }

//	    int result = methodTask.getTotal(10);
//	    System.out.println(result);

//	    String result = methodTask.changeABC("aBcDefff!@#!@#123");
//	    System.out.println(result);

//	    int result = methodTask.changeToInteger1("공공공공공공공일");
//	    System.out.println(result);

//		String data = methodTask.changeToHangeul1(485165);
//		System.out.println(data);

//		int[] arData = new int[100];
//	    int[] arEven = null;
//	      
//	    for (int i = 0; i < arData.length; i++) {
//	       arData[i] = i + 1;
//	    }
//	      
//	    arEven = methodTask.getEven(arData);
//	      
//	    for (int i = 0; i < arEven.length; i++) {
//	       System.out.println(arEven[i]);
//	    }

//		문제1
//		methodTask.printNameCount("정희준", 5);

//		문제2
//		methodTask.printMulti(50);

//		문제3
//		int[] numbers = {1, 3, 4, 6, 7, 8, 9};
//		int evencount = methodTask.countEven(numbers);
//		System.out.println(evencount);

//		문제4
//		int result = methodTask.printAdd(927);
//		System.out.println("각 자리 수의 합: " + result);

//		문제5
//		int[] arMaxMin = {10, 5, 1, 9, 150};
//		methodTask.printMaxMin(arMaxMin);

//		문제6
//	    int result = methodTask.changeToInteger2("공구이칠");
//	    String data = methodTask.changeToHangeul2(result);
//	    System.out.println("입력 받은 수에서 1을 더한 값: " + result);				
//		System.out.println("위에 값을 한글로 출력: " + data);

//	    int[] result = new int[2];
//	    methodTask.getMaxMin(new int[] {3, 5, 1, 2, 6}, result);
//	    for (int i = 0; i < result.length; i++) {
//	    	System.out.println(result[i]);
//	    }
	}
}
