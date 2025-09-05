package classTest;

public class GameShop {
	String name;
	int price;
	int stock;
	
	public GameShop(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	void sell(Player player) {
		player.money -= this.price * (1 - player.discount / 100.0);
		stock--;
	}
	
	void buy(Player player) {
		player.money += this.price;
		stock++;
	}
}
