package list.task.fruit;

import java.util.ArrayList;
import java.util.Scanner;

import list.task.DBConnecter;
import list.test.ArrayListTest;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Market market = new Market();
		
		while(true) {
			System.out.println("과일 관리 시스템");
			System.out.println("1. 과일 추가");
			System.out.println("2. 과일 삭제");
			System.out.println("3. 평균 가격보다 낮은지 조회");
			System.out.println("4. 과일 전체 조회");
			System.out.println("5. 과일 이름으로 조회");
			
			int choice = sc.nextInt();
			
			switch(choice) {
//			과일 추가
			case 1:
				System.out.print("과일 추가: ");
				String insertName = sc.next();
				System.out.print("과일 가격: ");
				int price = sc.nextInt();
				market.insert(new Fruit(insertName, price));
				System.out.println("과일이 추가 되었습니다.");
				break;				
				
//			과일 삭제
			case 2:
				System.out.print("과일 삭제: ");
				String removeName = sc.next();
				market.remove(removeName);
				System.out.println("과일이 삭제 되었습니다.");
				break;
				
//			평균 가격보다 낮은지 조회
			case 3:
				System.out.print("과일 가격: ");
				int inputPrice = sc.nextInt();
				boolean isLower = market.checkPrice(inputPrice);
				if(isLower) {
					System.out.println("평균 가격보다 높습니다.");
				} else {
					System.out.println("평균 가격보다 낮습니다.");
				}
				break;
					
//			과일 전체 조회
			case 4:
				ArrayList<Fruit> allFruits = market.findAll();
				if(allFruits.isEmpty()) {
					System.out.println("품절");
				} else {
					System.out.println("전체 과일");
					for(Fruit fruit : allFruits) {
						System.out.println(fruit);
					}
				}
				break;
				
//			과일 이름으로 조회
			case 5:				
				System.out.print("과일 이름: ");
				String searchName = sc.next();
				int foundPrice = market.findPriceByName(searchName);
				if(foundPrice < 0) {
					System.out.println("과일 없습니다.");
				} else {
					System.err.println("가격: " + foundPrice);
				}
				break;
				
				default :
					System.out.println("다시 입력해주세요.");
			}			
		}
	}
}
