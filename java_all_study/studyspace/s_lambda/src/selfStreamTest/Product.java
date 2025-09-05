package selfStreamTest;

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
		return "Product [name= " + name + ", price= " + price + ", stock= " + stock + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
	
//	Product 클래스를 선언한다.
//	- 상품명, 가격, 재고	
//	1. 가격을 모두 출력한다. 단, 30% 할인된 가격으로 출력한다.
//	2. 모든 재고를 10으로 변경해서 출력한다.(원본은 수정하지 않는다.)
//	3. 해당 상품의 가격과 재고를 곱해 총 가격을 출력한다.
}
