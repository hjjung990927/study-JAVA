package projectmovie;

import java.util.ArrayList;
import java.util.Comparator;

public class Cinema {
	private ArrayList<Movie> movies = new ArrayList<Movie>();

//	영화 등록
	public void addMovie(Movie movie) {
		if (movies.contains(movie)) {
			System.out.println("🎬 영화 [" + movie.getTitle() + "] 는(은) 상영중인 영화입니다.");
		} else {
			movies.add(movie);
			System.out.println("✅ 영화 [" + movie.getTitle() + "] 상영을 등록합니다.");
		}
	}

//	영화 삭제
	public void removeMovie(String title, String time) {
		boolean titleExist = false;
		Movie toRemove = null;

		for (Movie movie : movies) {
			if (movie.getTitle().equalsIgnoreCase(title)) {
				titleExist = true;
				if (movie.getTime().equalsIgnoreCase(time)) {
					toRemove = movie;
					break;
				}
			}
		}
		if (toRemove != null) {
			movies.remove(toRemove);
			System.out.println("🎞️ 영화 [" + title + "] " + time + " 상영을 종료합니다.");
		} else if (titleExist) {
			System.out.println("⚠️ 영화 [" + title + "] 는 있지만, " + time + " 시간에는 상영하지 않습니다.");
		} else {
			System.out.println("❌ 영화 [" + title + "] 는 현재 상영 중이 아닙니다.");
		}
	}

//	전체 영화 목록
	public void showAllMovies() {
		if (movies.isEmpty()) {
			System.out.println("현재 영화관엔 상영 중인 영화가 없습니다.");
		} else {
			System.out.println("=== 🎬 영화 상영 목록 ===");
			for (Movie movie : movies) {
				System.out.println(movie);
			}
		}
	}

//	제목으로 검색
	public void searchMovieByTitle(String title) {
		boolean foundMovieByTitle = false;
		for (Movie movie : movies) {
			if (movie.getTitle().equalsIgnoreCase(title)) {
				System.out.println("🔍 검색 결과: " + movie);
				foundMovieByTitle = true;
			}
		}
		if (!foundMovieByTitle) {
			System.out.println("❌ " + title + " 과(와) 일치하는 영화가 없습니다.");
		}
	}

//	시간대로 검색
	public void searchMovieByTime(String time) {
		boolean foundMovieByTime = false;
		for (Movie movie : movies) {
			if (movie.getTime().equalsIgnoreCase(time)) {
				System.out.println("🔍 검색 결과: " + movie);
				foundMovieByTime = true;
			}
		}
		if (!foundMovieByTime) {
			System.out.println("❌ 입력하신 시간대에 상영 중인 영화가 없습니다.");
		}
	}

//	영화 예매(제목 선택 + 시간 선택 + 인원 수 입력 -> 좌석 차감)
	public void reserveMovie(String title, String time, int seats) {
		boolean reservedMoive = false;
		for (Movie movie : movies) {
			if (movie.getTitle().equalsIgnoreCase(title) && movie.getTime().equalsIgnoreCase(time)) {
				if (movie.getSeats() >= seats) {
					movie.setSeats(movie.getSeats() - seats);
					System.out.println("🎟️ 예매 성공: " + title + " [" + time + "] - " + seats + "석 예약 완료");
				} else {
					System.out.println("⚠️ 좌석 부족! 현재 남은 좌석은 " + movie.getSeats() + "석입니다.");
				}

				reservedMoive = true;
				break;
			}
		}
		if (!reservedMoive) {
			System.out.println("❌ 해당 영화(" + title + ", " + time + ")는 상영 목록에 없습니다.");
		}
	}

//	가격 순 정렬
	public void sortPrice() {
		if (movies.isEmpty()) {
			System.out.println("❌ 가격 순으로 정렬할 영화가 없습니다");
			return;
		} else {
//			movies.sort((movie1, movie2) -> Integer.compare(movie1.getPrice(), movie2.getPrice()));
			movies.sort(Comparator.comparing(Movie::getPrice));
//			ArrayList<Movie> 안에 객체 비교, 가격 순 기준으로 오름차순 정렬
//			둘 다 같은 의미지만 람다식을 사용해 좀 더 편하게 코딩해보자~
			System.out.println("💰 가격 순으로 정렬되었습니다.");
			showAllMovies();
		}
	}

//	잔여 좌석 순 정렬
	public void sortLeftSeats() {
		if (movies.isEmpty()) {
			System.out.println("❌ 잔여 좌석 순으로 정렬할 영화가 없습니다.");
			return;
		} else {
//			movies.sort((movie1, movie2) -> Integer.compare(movie1.getSeats(), movie2.getSeats()));
			movies.sort(Comparator.comparing(Movie::getSeats));
//			ArrayList<Movie> 안에 객체 비교, 영화 좌석 순 기준으로 오름차순 정렬
			System.out.println("✅ 잔여 좌석 순으로 정렬되었습니다.");
			showAllMovies();
		}
	}
//	종료

}
