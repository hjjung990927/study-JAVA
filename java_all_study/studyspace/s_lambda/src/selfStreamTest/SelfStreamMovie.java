package selfStreamTest;

import java.util.ArrayList;
import java.util.Arrays;

public class SelfStreamMovie {
	public static void main(String[] args) {
		Movie[] arMovie = {
				new Movie("Inception", "Christopher Nolan", 148, 8.8),
				new Movie("Parasite", "Bong Joon-ho", 132, 8.6),
	            new Movie("Avengers: Endgame", "Russo Brothers", 181, 8.4),
	            new Movie("Oppenheimer", "Christopher Nolan", 106, 8.4),
	            new Movie("Interstellar", "Christopher Nolan", 150, 7.3)
		};
		
		ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(arMovie));
//		map(): 기존 값을 바꾼다. 요소를 변환해 새로운 값으로 만든다.
//		filter(): 조건에 맞는 요소만 남긴다. 조건에 맞는 애만 선택해 통과시킨다.
//		forEach(): 각 요소에 대해 무언가를 실행한다. 지나가는 하나하나를 집어서 작업한다.
//		collect(Collectors.toList()) → List 로 모음  
//		collect(Collectors.toSet()) → Set 로 모음  
//		collect(Collectors.toMap()) → ?? 찾아보자
//		collect(Collectors.joining()) → 문자열로 연결
//		movies.stream().map((movie) -> movie.getTitle().toLowerCase()).forEach(System.out::println);
		
//		movies.stream().map((movie) -> movie.getDirector().toLowerCase()).forEach(System.out::println);

//		movies.stream().filter((movie) -> movie.getDirector().contains("Nolan")).forEach(System.out::println);
//		영화 감독 이름 중 "Nolan" 이 포함되어 있는 영화 출력
		
//		movies.stream().filter((movie) -> movie.getRate() < 8).forEach(System.out::println);
//		영화 평점이 8보다 낮은 영화 출력
		
//		map(...contains(...)): 조건 검사 결과만 출력되어 결과값은 true/false 로 매핑(각 요소를 다른 값으로 변환)
//		filter(...contains(...)): 조건에 맞는 객체로 필터링
		
		
	}
}
