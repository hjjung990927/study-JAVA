package classTest;

public class Cupang {
	int price;
	public Cupang(int price) {
		this.price = price;
	}
	
	int delivery(Box[] arBox) {
		int total = 0;
		for (int i = 0; i < arBox.length; i++) {
			total += arBox[i].kg * price;
		}
		
		return total;
	}
}
