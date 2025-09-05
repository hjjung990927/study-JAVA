package lambdaTest;

import java.util.Scanner;

public class MyMath {
	public static Calc operate(String oper) {
		return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String example = "예)9+7-5";
		String expression = null;
		String[] arOper = null;
		String[] arTemp = null;
		int number1 = 0, number2 = 0;
		int index = 0;

		OperCheck operCheck = (e) -> {
			String result = "";

			for (int i = 0; i < e.length(); i++) {
				if (e.charAt(i) == '+' || e.charAt(i) == '-') {
					result += e.charAt(i);
				}
			}

			return result.split("");
		};

		System.out.println(message);
		System.out.println(example);
		expression = scanner.next();

		arOper = operCheck.getOpers(expression);

		arTemp = expression.split("\\+|\\-");

		if (arTemp[0].isEmpty()) {
			number1 = Integer.parseInt(arOper[0] + arTemp[1]);
			index = 1;

		} else {
			number1 = Integer.parseInt(arTemp[0]);

		}

		for (int i = index; i < arOper.length; i++) {
			number2 = Integer.parseInt(arTemp[i + 1]);
			number1 = MyMath.operate(arOper[i]).calc(number1, number2);
		}

		System.out.println(number1);
	}
}
