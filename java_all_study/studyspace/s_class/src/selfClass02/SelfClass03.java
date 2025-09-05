package selfClass02;

//	화면

//	상품을 여러 개 주문한다.

//	상품 클래스
//	상품명
//	상품 가격
//	상품 재고

//	주문 클래스
//	주문 번호
//	상품들

//	주문할 때 결제할 총 금액을 계산할 수 있다.

public class SelfClass03 {
	public static void main(String[] args) {
		Product03[] product = {
				new Product03("노트북", 100_000, 10),
				new Product03("마우스", 1_000, 5),
				new Product03("키보드", 10_000, 3)		
		};
		
		Order03 order = new Order03(5, product);
		System.out.println(order.total);
	}
}
