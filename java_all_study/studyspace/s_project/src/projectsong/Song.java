package projectsong;

import java.util.Objects;

public class Song {
	private String title;
	private String artist;
	private int duration;

	public Song() {
		;
	}

	public Song(String title, String artist, int duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		int minutes = duration / 60;
		int seconds = duration % 60;
		return String.format("🎵 %s - %s (%d:%02d)", title, artist, minutes, seconds);
//		%s: 문자열, %d: 정수
//		%02d: 정수는 2자리,빈자리는 0
	}

	@Override
	public int hashCode() {
		return Objects.hash(artist, title);
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
		Song other = (Song) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(title, other.title);
	}

}
