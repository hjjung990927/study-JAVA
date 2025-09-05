package projectshop;

import java.util.Scanner;

public class ShoppingCartApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingCart shoppingCart = new ShoppingCart();

		while (true) {
			System.out.println("\n🛒 쇼핑 장바구니 시뮬레이터");
			System.out.println("1. 상품 추가");
			System.out.println("2. 상품 삭제");
			System.out.println("3. 상품 검색");
			System.out.println("4. 전체 장바구니 보기");
			System.out.println("5. 총 결제 금액");
			System.out.println("6. 가격순 정렬");
			System.out.println("0. 종료");
			System.out.print("번호 선택 > ");

			int choice = sc.nextInt();
			sc.nextLine();
			
//			상품 추가
			if (choice == 1) {
				System.out.print("상품명: ");
				String name = sc.nextLine();
				System.out.print("상품 가격: ");
				int price = sc.nextInt();
				System.out.print("상품 재고: ");
				int stock = sc.nextInt();
				sc.nextLine();

				shoppingCart.addProduct(new Product(name, price, stock));
				
			} else if (choice == 2) {
//			상품 삭제
				System.out.print("삭제할 상품명: ");
				String name = sc.nextLine();
				shoppingCart.removeProduct(name);
				
			} else if (choice == 3) {
//			이름으로 검색
				System.out.print("검색할 상품명: ");
				String name = sc.nextLine();
				shoppingCart.searchProductByName(name);
				
			} else if (choice == 4) {
//			전체 장바구니
				shoppingCart.showAllProducts();
			} else if (choice == 5) {
//			총 결제 금액
				int total = shoppingCart.getTotalPrice();
				System.out.println("💰 총 결제금액: " + total + "원");
				
			} else if (choice == 6) {
//			가격순 정렬	
				shoppingCart.sortByPrice();
				
			} else if (choice == 0) {
//			종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
//			default 값	
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
