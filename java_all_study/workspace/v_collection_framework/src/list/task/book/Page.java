package list.task.book;

import java.util.ArrayList;
import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Library library = new Library();
		
		while(true) {
			System.out.println("책 관리 프로그램");
			System.out.println("1. 책 추가");
			System.out.println("2. 책 삭제");
			System.out.println("3. 전체 책 조회");
			System.out.println("4. 제목으로 가격 조회");
			System.out.println("5. 평균 가격보다 비싼 책만 조회");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
//			책 추가
			case 1:
				System.out.print("책 추가: ");
				String name = sc.next();
				
				System.out.print("저자 추가: ");
				String author = sc.next();
				
				System.out.print("가격 추가: ");
				int price = sc.nextInt();
				
				library.insert(new Book(name, author, price));
				
				System.out.println("책을 추가했습니다.");
				break;
				
//			책 삭제
			case 2:
				System.out.print("책 삭제: ");
				String removeName = sc.next();
				
				library.remove(removeName);
				System.out.println("책이 삭제 되었습니다.");			
				break;
				
//			전체 책 조회
			case 3:
				ArrayList<Book> allBooks = library.findAll();
				if(allBooks.isEmpty()) {
					System.out.println("품절 대란");
				} else {
					System.out.println("책 목록");
					for(Book book : allBooks) {
						System.out.println(book);
					}					
				}				
				break;
				
//			제목으로 가격 조회
			case 4:
				System.out.println("조회할 책 이름: ");
				String searchName = sc.next();
				int foundPrice = library.findPriceByName(searchName);
				if(foundPrice == -1) {
					System.out.println("찾을 수 없습니다.");
				} else {
					System.out.println("가격: " + foundPrice);
				}
				break;
				
			default :
				System.out.println("다시 입력해주세요.");
			}
		}
		
	}
	
}
