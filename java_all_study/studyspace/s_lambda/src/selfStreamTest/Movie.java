package selfStreamTest;

import java.util.Objects;

public class Movie {
	private String title;
	private String director;
	private int runningTime;
	private double rate;
	
	public Movie() {
		;
	}

	public Movie(String title, String director, int runningTime, double rate) {
		this.title = title;
		this.director = director;
		this.runningTime = runningTime;
		this.rate = rate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
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
		return "Movie [title=" + title + ", director=" + director + ", runningTime=" + runningTime + ", rate=" + rate
				+ "]";
	}
	
	
}
