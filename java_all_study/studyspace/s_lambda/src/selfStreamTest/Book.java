package selfStreamTest;

import java.util.Objects;

public class Book {
//	Book 클래스
//	- 제목 (String title)
//	- 저자 (String author)
//	- 가격 (int price)
//	- 재고 (int stock)
//
//	모든 책의 제목을 대문자로 변환해서 출력하세요.
//
//	저자의 이름에 "신"이 포함된 책만 출력하세요.
//
//	모든 책의 가격을 20% 할인한 가격으로 출력하세요.
//
//	가격과 재고를 곱한 총 판매 가능 금액을 출력하세요.
//
//	재고가 5 이하인 책 제목만 출력하세요
	
	private String title;
	private String author;
	private int price;
	private int stock;
	
	public Book() {
		;
	}

	public Book(String title, String author, int price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Book [title= " + title + ", author= " + author + ", price= " + price + ", stock= " + stock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
}
