package selfStreamTest;

import java.util.ArrayList;
import java.util.Arrays;

//	Book 클래스
//	- 제목 (String title)
//	- 저자 (String author)
//	- 가격 (int price)
//	- 재고 (int stock)

public class SelfStreamBook {
	public static void main(String[] args) {
		Book[] arBook = {
				new Book("winner", "김태형", 10000, 5),
				new Book("캡틴의 품격", "전준우", 10000, 10),
				new Book("우완 fireballer", "이민석", 15000, 15),
				new Book("좌완 파이어볼러", "홍민기", 20000, 20)
		};
		
		ArrayList<Book> books = new ArrayList<Book>(Arrays.asList(arBook));
//		모든 책의 제목을 대문자로 변환해서 출력하세요.
		books.stream().map((book) -> book.getTitle().toUpperCase()).forEach(System.out::println);
		
//		저자의 이름에 "민"이 포함된 책만 출력하세요.
		books.stream().filter((book) -> book.getAuthor().contains("민")).forEach(System.out::println);
		
//		모든 책의 가격을 20% 할인한 가격으로 출력하세요.
		books.stream().map((book) -> (int)(book.getPrice() * 0.8)).forEach(System.out::println);
		
//		가격과 재고를 곱한 총 판매 가능 금액을 출력하세요.
		books.stream().map((book) -> book.getPrice() * book.getStock()).forEach(System.out::println);
		
//		재고가 5 이하인 책 제목만 출력하세요
		books.stream().filter((book) -> book.getStock() <= 5).map(Book::getTitle).forEach(System.out::println);
	}
}











