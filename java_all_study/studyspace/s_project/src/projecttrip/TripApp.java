package projecttrip;

import java.util.Scanner;

public class TripApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TripManager tripManager = new TripManager();

		while (true) {
			System.out.println("==============================");
			System.out.println("🗺️ 여행 일정 관리 시스템 🗺️");
			System.out.println("1. 여행 일정 추가");
			System.out.println("2. 여행 일정 삭제");
			System.out.println("3. 전체 여행 일정 조회");
			System.out.println("4. 여행지로 검색");
			System.out.println("5. 출발일로 검색");
			System.out.println("6. 출발일 순 정렬");
			System.out.println("0. 종료");
			System.out.print("👉 원하는 메뉴 번호를 입력하세요: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
//			여행 일정 추가
			if(choice == 1) {
				System.out.print("여행지 입력: ");
				String destination = sc.nextLine();
				
				System.out.print("출발일 입력 (예: 2025-07-01): ");
				String startDate = sc.nextLine();
				
				System.out.print("도착일 입력 (예: 2025-07-01): ");
				String endDate = sc.nextLine();
				
				System.out.print("예산 입력: ");
				int budget = sc.nextInt();
				sc.nextLine();
				
				tripManager.addTrip(new Trip(destination, startDate, endDate, budget));
				
//			여행 일정 삭제
			} else if (choice == 2) {
				System.out.print("취소할 여행지: ");
				String removeDestination = sc.nextLine();
				
				System.out.print("취소할 출발일 입력: ");
				String removeStartDate = sc.nextLine();
				
				tripManager.removeTrip(removeDestination, removeStartDate);
				
//			전체 여행 일정 조회
			} else if (choice == 3) {
				tripManager.showAllTrip();
				
//			여행지로 검색
			} else if (choice == 4) {
				System.out.print("여행지 입력: ");
				String searchTripByDestination = sc.nextLine();
				tripManager.searchTripByDestination(searchTripByDestination);
				
//			출발일로 검색
			} else if (choice == 5) {
				System.out.print("출발일 입력: ");
				String searchTripByStartDate = sc.nextLine();
				tripManager.searchTripByStartDate(searchTripByStartDate);
				
//			출발일 순 정렬
			} else if (choice == 6) {
				
//			종료
			} else if (choice == 0) {
				System.out.println("=== 프로그램 종료 ===");
			} else {
				System.out.println("번호를 다시 입력해주세요.");
			}
		}
	}
}
