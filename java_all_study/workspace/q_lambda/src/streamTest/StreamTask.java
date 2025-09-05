package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

public class StreamTask {

	public static int change(int data) {
		return 10 - data;
	}

	public static void main(String[] args) {
//      1 ~ 10까지 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.range(1, 11).forEach((number) -> {
//         datas.add(number);
//      });
//      
//      datas.forEach((data) -> {
//         System.out.println(data);
//      });

//      10 ~ 1까지 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.range(0, 10).forEach((data) -> {
//         datas.add(10 - data);
//      });
//      datas.forEach(System.out::println);

//      Function<Integer, Integer> function = StreamTask::change;
//      
//      IntStream.range(0, 10).map(function::apply).forEach(datas::add);
//      datas.forEach(System.out::println);

//      10 ~ 1까지 ArrayList에 담은 후 짝수만 출력한다.
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.range(0, 10).forEach((data) -> datas.add(10 - data));
//      IntStream.range(0, 10).map((data) -> 10 - data).forEach((data) -> {datas.add(data);});
//      datas.forEach((data) -> {
//         if(data % 2 == 0) {
//            System.out.println(data);
//         }
//      });
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(1, 101).filter((data) -> data % 2 == 1).forEach((data) -> {datas.add(data);});
//		System.out.println(datas);
		
//		Apple, Banana, Orange
//		위의 문자열들을 ArrayList에 담고 이름에 'n'이 포함된 과일 이름만 출력한다.
//		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Orange"));
//		fruits.stream().filter((fruit) -> fruit.contains("n")).forEach(System.out::println);
//		.forEach((fruit) -> {System.out.println(fruit);});
//		참조형 사용 시 .forEach(System.out::println);
		
//		Product 클래스를 선언한다.
//		- 상품명, 가격, 재고		
//		Product[] arProduct = {
//				new Product("선풍기", 100_000, 5),
//				new Product("에어컨", 100_000, 5),
//				new Product("냉장고", 100_000, 5)
//		};
		
//		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(arProduct));		
//		1. 가격을 모두 출력한다. 단, 30% 할인된 가격으로 출력한다.
//		products.stream().map((product) -> (int)(product.getPrice() * 0.7)).forEach((price) -> {System.out.println(price);});	
//		products.stream().map((product) -> product.getDiscountPrice()).forEach((price) -> {System.out.println(price);});
//		products.stream().map(Product::getDiscountPrice).forEach((price) -> {System.out.println(price);});
//		products.stream().map(Product::getDiscountPrice).forEach(System.out::println);
		
//		2. 모든 재고를 10으로 변경해서 출력한다.(원본은 수정하지 않는다.)
//		products.stream().map((product) -> 10).forEach((stock) -> {System.out.println(stock);});
//		products.stream().map(Product::getStockTo10).forEach(System.out::println);
		
//		3. 해당 상품의 가격과 재고를 곱해 총 가격을 출력한다.
//		products.stream().map((product) -> product.getPrice() * product.getStock()).forEach((price) -> {System.out.println(price);});
//		products.stream().map(Product::getTotalPrice).forEach(System.out::println);
		
		
	}
}














