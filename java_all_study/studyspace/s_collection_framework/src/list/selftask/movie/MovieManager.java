package list.selftask.movie;

import java.util.ArrayList;

import list.selftask.DBConnecter;

public class MovieManager {
//	영화 등록
	public void insert(Movie movie) {
		DBConnecter.movies.add(movie);
	}
	
//	영화 삭제
//	public void remove(String title) {
//		for (int i = 0; i < DBConnecter.movies.size(); i++) {
//			if(DBConnecter.movies.get(i).getTitle().equals(title)) {
//				DBConnecter.movies.remove(i);
//			}
//		}
//	}
	public void remove(String title) {
		DBConnecter.movies.removeIf((movie) -> movie.getTitle().equals(title));
	}
	
//	영화 목록 조회
	public ArrayList<Movie> findAll() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		for(Movie movie : DBConnecter.movies) {
			movies.add(movie);
		}
		return movies;
	}
	
//	영화 예매
	public boolean reserve(String title) {
		for(Movie movie : DBConnecter.movies) {
			if(movie.getTitle().equals(title)) {
				if(movie.getSeatCount() > 0) {
					movie.setSeatCount(movie.getSeatCount() -1);
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
//	영화 좌석 수 조회
	public int findSeatCount(String title) {
		for(Movie movie : DBConnecter.movies) {
			if(movie.getTitle().equals(title)) {
				return movie.getSeatCount();
			}
		}
		return -1;
	}
}











