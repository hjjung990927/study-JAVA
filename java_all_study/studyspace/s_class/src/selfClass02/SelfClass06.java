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

public class SelfClass06 {
	public static void main(String[] args) {
		Player06 player = new Player06("MP", 100_000, 10);
		Gameshop06 gameshop = new Gameshop06("몽둥이", 10_000, 5);
	
		gameshop.sell(player);
		System.out.println(player.money);
		System.out.println(gameshop.stock);
		
	}
}
