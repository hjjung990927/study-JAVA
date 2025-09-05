package classTest;

public class Market {
	String name;
	int price;
	int stock;

	public Market(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	void sell(Customer customer) {
		customer.money -= this.price * (1 - customer.discount / 100.0);
		stock--;
	}
}
