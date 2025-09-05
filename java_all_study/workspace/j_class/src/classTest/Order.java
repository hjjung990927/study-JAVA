package classTest;

public class Order {
	int id;
	Product[] arProduct;
	int total;
	public Order(int id, Product[] arProduct) {
		this.id = id;
		this.arProduct = arProduct;
		for (int i = 0; i < arProduct.length; i++) {
			if(arProduct[i].count < 1) {
				continue;
			}
			this.total += arProduct[i].price;
			arProduct[i].count--;
		}
	}
}
