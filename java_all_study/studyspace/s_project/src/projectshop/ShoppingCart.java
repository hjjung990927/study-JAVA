package projectshop;

import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Product> products = new ArrayList<Product>();

//	상품 추가
//	상품명이 같으면 ArrayList에 중복된 이름을 담지 않고 재고만 더해지도록 구현해보았다.
	public void addProduct(Product newProduct) {
//		매개변수로 추가할 상품 객체 하나를 받기 위해 newProduct로 선언한다.
		for (Product product : products) {
			if (product.equals(newProduct)) {
//			기존 장바구니에 있는 상품 중, 새로 추가하려는 상품과 같은지에 대한 조건식
				product.setStock(product.getStock() + newProduct.getStock());
//				이미 존재하는 상품이라면 재고를 더해준다.
				System.out.println(newProduct.getName() + " 이(가) 이미 있어 수량 추가했습니다.");
				System.out.println(product);
				return;
			}
		}
		products.add(newProduct);
//		장바구니에 같은 상품을 찾지 못한 경우, 새로운 상품이기에 리스트에 추가한다.
		System.out.println(newProduct + " 이(가) 장바구니에 추가되었습니다.");
	}

//	상품 삭제
	public void removeProduct(String name) {
		Product toRemove = null;
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(name)) {
				toRemove = product;
				break;
			}
		}
//		equalsIgnoreCase(name): 상품명(문자열)을 대소문자 구분 없이 비교할 때 쓰는 걸 기억하자~
		
		if (toRemove != null) {
			products.remove(toRemove);
			System.out.println(name + " 이(가) 삭제되었습니다.");
		} else {
			System.out.println(name + " 이(가) 장바구니에 없습니다.");
		}
	}

//	이름으로 검색
	public void searchProductByName(String name) {
		boolean foundProduct = false;
//		장바구니에 있는 제품을 찾았는지의 여부를 기억하기 위한 플래그(flag) 역할
//		boolean 타입의 초기값은 false 기억하기~
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(name)) {
				System.out.println("🔍 검색 결과: " + product);
				foundProduct = true;
				break;
			}
		}
		if (!foundProduct) {
			System.out.println("❌ " + name + " 이(가) 장바구니에 없습니다.");
		}
	}

//	전체 장바구니 보기
	public void showAllProducts() {
		if(products.isEmpty()) {
			System.out.println("장바구니가 비어있습니다.");
		} else {
			System.out.println("=== 장바구니 목록 ===");
			for(Product product : products) {
				System.out.println(product);
			}
		}
	}

//	총 결제금액 계산
	public int getTotalPrice() {
		int total = 0;
		for(Product product : products) {
			total += product.getPrice() * product.getStock();
		}
		return total;
	}

//	가격순 정렬
	public void sortByPrice() {
		if(products.isEmpty()) {
			System.out.println("정렬할 장바구니가 비어있습니다.");
			return;
		}
		products.sort((product1, product2) -> Integer.compare(product1.getPrice(), product2.getPrice()));
		System.out.println("💰 가격순으로 정렬되었습니다.");
		showAllProducts();
	}
//	비교 기준(Comparator)을 직접 람다식으로 넘겨줌
//	비교할 두 개의 product1, product2 객체 -> 두 정수 price 비교(각각 product1, product2 상품의 가격)
}















