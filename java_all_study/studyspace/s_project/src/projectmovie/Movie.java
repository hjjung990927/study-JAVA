package projectmovie;

import java.util.Objects;

public class Movie {
	private String title;
	private String time;
	private int price;
	private int seats;

	public Movie() {
		;
	}

	public Movie(String title, String time, int price, int seats) {
		this.title = title;
		this.time = time;
		this.price = price;
		this.seats = seats;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public int hashCode() {
		return Objects.hash(time, title);
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
		return Objects.equals(time, other.time) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return String.format("🎬 %s | 시간: %s | 가격: %d원 | 남은 좌석: %d석", title, time, price, seats);
	}

}
