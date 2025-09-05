package selfClass02;

//	화면
//	온라인 게임 아이템 구매

//	게임샵
//	아이템 이름
//	가격
//	재고

//	플레이어
//	닉네임
//	게임머니
//	할인율

public class Gameshop06 {
	String item;
	int price;
	int stock;
	public Gameshop06(String item, int price, int stock) {
		this.item = item;
		this.price = price;
		this.stock = stock;
	}
	
	void sell(Player06 player) {
		player.money -= this.price * (1 - player.discount / 100.0);
		this.stock--;
	}
	
}
