package projectshop;

import java.util.Objects;

public class Product {
	private String name;
	private int price;
	private int stock;

	public Product() {
		;
	}

	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return String.format("상품명: %s | 가격: %,d원 | 재고: %d개", name, price, stock);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
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
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	
//	이름과 가격 둘 다 비교해야 같은 상품으로 판단하기 때문에
//	hashCode() 와 equals()에 이름 + 가격으로 정의함!

	
}
