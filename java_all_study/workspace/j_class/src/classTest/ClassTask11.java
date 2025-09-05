package classTest;

public class ClassTask11 {
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
	
	public static void main(String[] args) {
		Player HJ = new Player("HJ", 10000, 30);
		GameShop gameshop = new GameShop("방망이", 5000, 10);
		
		gameshop.sell(HJ);
		System.out.println(HJ.money);
		System.out.println(gameshop.stock);
		
		gameshop.buy(HJ);
		System.out.println(HJ.money);
		System.out.println(gameshop.stock);
		
		
	}
}
