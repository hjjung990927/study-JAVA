package list.selftask.movie;

import java.util.ArrayList;
import java.util.Scanner;

import list.selftask.DBConnecter;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieManager movieManager = new MovieManager();
		
		while(true) {
			System.out.println("===== 영화 예매 시스템 =====");
			System.out.println("1. 영화 등록");
			System.out.println("2. 영화 삭제");
			System.out.println("3. 영화 목록 조회");
			System.out.println("4. 영화 예매");
			System.out.println("5. 남은 좌석 수 조회");
			System.out.println("6. 종료");
			
			int choice = sc.nextInt();
			
			switch(choice) {
//			영화 등록
			case 1:
				System.out.print("상영 시작할 영화 제목: ");
				String title = sc.next();
				System.out.print("상영관 번호: ");
				int theater = sc.nextInt();
				System.out.print("상영관 좌석 수: ");
				int seatCount = sc.nextInt();
				
				movieManager.insert(new Movie(title, theater, seatCount));
				
				break;
//			영화 삭제
			case 2:
				System.out.print("상영 마감할 영화 제목: ");
				String removeTitle = sc.next();
				
				movieManager.remove(removeTitle);
				System.out.println(removeTitle + " 영화가 상영 마감 되었습니다.");
				
				break;
//			영화 목록 조회
			case 3:
				ArrayList<Movie> allMovies = movieManager.findAll();
				if(allMovies.isEmpty()) {
					System.out.println("상영관이 모두 공사중입니다.");
				} else {
					System.out.println("=== 상영 목록 ===");
					for(Movie movie : allMovies) {
						System.out.println(movie);
					}
				}
				break;
				
//			영화 예매
			case 4:
				System.out.print("예매할 영화: ");
				String reserveTitle = sc.next();
				boolean reserved = movieManager.reserve(reserveTitle);
				if(reserved) {
					System.out.println(reserveTitle + " 영화가 예매되었습니다.");
				} else {
					System.out.println("예매할 수 없습니다.");
				}
				break;
				
//			남은 좌석 수 조회
			case 5:
				System.out.print("조회할 영화 제목: ");
				String seatTitle = sc.next();
				int seatCountLeft = movieManager.findSeatCount(seatTitle);
				if(seatCountLeft == -1) {
					System.out.println("아직 상영 계획이 없는 영화입니다.");
				} else {
					System.out.println("남은 좌석 수: " + seatCountLeft);
				}
				break;
//			종료
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default :
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
	}
}
