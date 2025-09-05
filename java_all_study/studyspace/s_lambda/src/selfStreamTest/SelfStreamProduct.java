package selfStreamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SelfStreamProduct {
	public static void main(String[] args) {
//		1~10까지 출력
//		IntStream.range(1, 11).forEach(System.out::println);

//		1~10까지 ArrayList에 저장하고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach((data) -> {datas.add(data);});
//		System.out.println(datas);

//		10~1까지 ArrayList에 저장하고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 11).forEach((data) -> {datas.add(data);});
//		IntStream.range(0, 10).map((data) -> 10 - data).forEach((data) -> {
//			datas.add(data);		
//		});
//		System.out.println(datas);

//		10~1까지 ArrayList에 저장 후 짝수만 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).map((data) -> 10 - data).forEach((data) -> {
//			datas.add(data);
//		});
//		datas.forEach((data) -> {
//			if(data % 2 == 0) {
//				System.out.println(data);
//			}
//		});
		
//		map(): 변경, filter(): 조건 모두 사용해보기
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).map((data) -> 10 - data).filter((data) -> data % 2 == 0).forEach((data) -> {datas.add(data);});
//		System.out.println(datas);
		
//		1~100까지 홀수만 ArrayList에 저장 후 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 101).filter((data) -> data % 2 == 1).forEach((data) -> {datas.add(data);});
//		System.out.println(datas);
		
//		위의 문자열을 ArrayList에 저장 후 이름에 'n'이 포함된 과일 이름만 출력
//		Apple, Banana, Orange
//		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Orange"));
//		fruits.stream().filter((fruit) -> fruit.contains("n")).forEach(System.out::println);
		
//		Product 클래스 선언
//		- 상품명, 가격, 재고
//		Product[] arProduct = {
//				new Product("핸드폰", 100_000, 30),
//				new Product("테블릿", 500_000, 20),
//				new Product("노트북", 1_000_000, 10)
//		};
//		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(arProduct));
//		1. 가격을 모두 출력한다. 단, 30% 할인된 가격으로 출력한다.
//		products.stream().map((price) -> (int)(price.getPrice() * 0.7)).forEach(System.out::println);

//		2. 모든 재고를 10으로 변경해서 출력한다.(원본은 수정하지 않는다.)
//		products.stream().map((stock) -> 10).forEach(System.out::println);
		
//		3. 해당 상품의 가격과 재고를 곱해 총 가격을 출력한다.
//		products.stream().map((product) -> product.getPrice() * product.getStock()).forEach(System.out::println);

	}
}





























