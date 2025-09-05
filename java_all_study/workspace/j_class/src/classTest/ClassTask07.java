package classTest;

public class ClassTask07 {
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
	
	public static void main(String[] args) {
		Product[] arProduct = { 
				new Product("아아", 3000, 5),
				new Product("라떼", 4000, 10),
		};
		Order order = new Order(1, arProduct);
		
		System.out.println(order.total);
		
		for (int i = 0; i < arProduct.length; i++) {
			System.out.println(arProduct[i].count);
		}
	}
}
