package projecttrip;

import java.util.ArrayList;
import java.util.Comparator;

public class TripManager {
	private ArrayList<Trip> trips = new ArrayList<Trip>();
	
//	여행 일정 추가
	public void addTrip(Trip trip) {
		if(trips.contains(trip)) {
			System.out.println("이미 계획된 여행입니다.");
		} else {
			trips.add(trip);
			System.out.println("✅ " + trip.getDestination() + "여행이 추가되었습니다!");
		}
	}
	
//	여행 일정 삭제
	public void removeTrip(String destination, String startDate) {
		boolean destinationExist = false;
//		입력한 여행 장소가 여행 계획에 존재하는지를 기억하기 위한 플래그(flag) 역할
		Trip toRemove = null;
//		나중에 삭제할 여행을 정해주는 플래그(flag) 역할, 어떤 여행을 취소할지 모르기에 null 로 초기화
		
		for(Trip trip : trips) {
			if(trip.getDestination().equals(destination)) {
				destinationExist = true;
				if(trip.getStartDate().equals(startDate)) {
					toRemove = trip;
					break;
				}
			}
//			입력한 여행 장소가 여행 계획에 일치하는 장소가 있다면 true 로 바꿔주고,
//			입력한 여행 출발 시간과 장소와도 모두 일치한다면 삭제할 여행 계획 객체를 toRemove에 저장한다.
		}
		if(toRemove != null) {
			trips.remove(toRemove);
			System.out.println("✅ " + destination + "여행을 취소했습니다.");
//		toRemove에 여행 출발 시간과 장소가 모두 일치해 값이 담겼다면 삭제한다.
		} else if (destinationExist) {
			System.out.println("⚠️ 여행지는 같지만 출발일이 다릅니다.");
		} else {
			System.out.println("❌ 계획된 " + destination + "여행이 없습니다.");
		}	
	}
	
//	전체 여행 일정 조회
	public void showAllTrip() {
		if(trips.isEmpty()) {
			System.out.println("계획중인 여행이 없습니다.");
		}
		System.out.println("===== 📍 여행 일정 📍 =====");
		for(Trip trip : trips) {
			System.out.println(trip);
		}
	}
	
//	여행지로 검색
	public void searchTripByDestination(String destination) {
		boolean foundTripByDestination = false;
//		여행 장소를 찾았는지의 여부를 기억하기 위한 플래그(flag) 역할
		for(Trip trip : trips) {
			if(trip.getDestination().equals(destination)) {
				System.out.println("🔍 검색 결과: " + trip);
				foundTripByDestination = true;
//				반복문에서 여행 장소를 찾으면 찾았다는 표시
			}
		}
		if(!foundTripByDestination) {
			System.out.println("❌ 입력하신 여행지는 계획에 없습니다.");
		}
	}
	
//	출발일로 검색
	public void searchTripByStartDate(String startDate) {
		boolean foundTripByStartDate = false;
//		여행 출발 시간을 찾았는지의 여부를 기억하기 위한 플래그(flag) 역할
		for(Trip trip : trips) {
			if(trip.getStartDate().equals(startDate)) {
				System.out.println("🔍 검색 결과: " + trip);
				foundTripByStartDate = true;
			}
		}
		if(!foundTripByStartDate) {
			System.out.println("❌ 입력하신 날짜에 여행 계획이 없습니다.");
		}
	}
	
//	날짜별 정렬(출발일)
	public void sortStartDate() {
		if(trips.isEmpty()) {
			System.out.println("계획중인 여행이 없습니다.");
		} else {
			trips.sort(Comparator.comparing(Trip::getStartDate));
//			ArrayList<Trip> 안에 객체 비교, 여행 일정 목록을 출발일 기준으로 오름차순 정렬
//			참고) 여행 출발일을 String 타입으로 선언했기 때문에 
//			() -> Integer.compare()은 사용할 수 없는걸 기억하자
		}
	}
}
