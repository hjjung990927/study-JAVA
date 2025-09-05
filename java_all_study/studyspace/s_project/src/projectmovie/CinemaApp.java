package projectmovie;

import java.util.Scanner;

public class CinemaApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cinema cinema = new Cinema();
		
		while(true) {
			System.out.println("=== 🎬 영화 예매 시스템 ===");
			System.out.println("1. 영화 등록");
			System.out.println("2. 영화 삭제");
			System.out.println("3. 전체 영화 목록");
			System.out.println("4. 제목으로 검색");
			System.out.println("5. 시간으로 검색");
			System.out.println("6. 영화 예매");
			System.out.println("7. 가격 순 정렬");
			System.out.println("8. 잔여 좌석 순 정렬");
			System.out.println("0. 종료");
			System.out.print("선택 > ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
//			switch ~ case 문을 사용해도 좋지만
//			필자는 if else~if 문을 연습하기 위해 사용했다!
			if(choice == 1) {
				System.out.print("영화 제목: ");
				String title = sc.nextLine();
				System.out.print("영화 시간: (예= 09:00) ");
				String time = sc.nextLine();
				System.out.print("영화 가격: ");
				int price = sc.nextInt();
				System.out.print("영화 좌석 수: ");
				int seats = sc.nextInt();
				sc.nextLine();
				
				cinema.addMovie(new Movie(title, time, price, seats));
				
			} else if (choice == 2) {
				System.out.print("상영 종료할 영화 제목: ");
				String removeMovie = sc.nextLine();
				System.out.print("상영 종료할 영화의 시간: (예= 09:00) ");
				String removeTime = sc.nextLine();
				cinema.removeMovie(removeMovie, removeTime);
				
			} else if (choice == 3) {
				cinema.showAllMovies();
				
			} else if (choice == 4) {
				System.out.print("제목으로 영화 검색: ");
				String findMovieByTitle = sc.nextLine();
				cinema.searchMovieByTitle(findMovieByTitle);
				
			} else if (choice == 5) {
				System.out.print("시간대로 영화 검색: ");
				String findMovieByTime = sc.nextLine();
				cinema.searchMovieByTime(findMovieByTime);
	
			} else if (choice == 6) {
				System.out.print("예매할 영화 제목: ");
				String reserveMovieTitle = sc.nextLine();
				System.out.print("예매할 영화 시간: ");
				String reserveMovieTime = sc.nextLine();
				System.out.print("예매할 좌석 수: ");
				int reserveSeats = sc.nextInt();
				sc.nextLine();
				
				cinema.reserveMovie(reserveMovieTitle, reserveMovieTime, reserveSeats);
								
			} else if (choice == 7) {
				cinema.sortPrice();
				
			} else if (choice == 8) {
				cinema.sortLeftSeats();
				
			} else if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 선택해주세요.");
			}
		}
	}
}
