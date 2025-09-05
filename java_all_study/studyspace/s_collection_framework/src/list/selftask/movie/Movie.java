package list.selftask.movie;

import java.util.Objects;

public class Movie {
	private String title;
	private int theater;
	private int seatCount;

	public Movie() {
		;
	}
	
	public Movie(Movie movie) {
		this(movie.getTitle(), movie.getTheater(), movie.getSeatCount());
	}

	public Movie(String title, int theater, int seatCount) {
		this.title = title;
		this.theater = theater;
		this.seatCount = seatCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTheater() {
		return theater;
	}

	public void setTheater(int theater) {
		this.theater = theater;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Movie other = (Movie) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Movie [title= " + title + ", theater= " + theater + ", seatCount= " + seatCount + "]";
	}
	
}
