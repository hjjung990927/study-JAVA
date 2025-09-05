package projectsong;

import java.util.ArrayList;

public class Playlist {
	private ArrayList<Song> songs = new ArrayList<Song>();

//	곡 추가
	public void addSong(Song song) {
		if (songs.contains(song)) {
			System.out.println("이미 플리에 등록된 곡입니다.");
		} else {
			songs.add(song);
			System.out.println(song.getTitle() + "을(를) 추가했습니다.");
		}
	}

//	전체 목록(모든 곡 출력)
	public void showAllSongs() {
		if (songs.isEmpty()) {
			System.out.println("플레이리스트가 비어있습니다.");
		} else {
			System.out.println("🎵 플레이리스트 목록: ");
			for(Song song : songs) {
				System.out.println(song);
			}			
		}
	}

//	곡 검색(제목으로)
	public void searchSongbyTitle(String title) {
		boolean foundSong = false;
//		곡을 찾았는지의 여부를 기억하기 위한 플래그(flag) 역할
//		boolean 타입의 초기값은 false를 꼭 기억하자!
		for(Song song : songs) {
			if(song.getTitle().equalsIgnoreCase(title)) {
//			equalsIgnoreCase(title): 제목(문자열)을 대소문자 구분 없이 비교
				System.out.println("검색 결과: " + song);
				foundSong = true;
//				반복문에서 곡을 찾으면 찾았다는 표시
			}
		}
		if(!foundSong) {
			System.out.println("해당 제목의 곡이 없습니다.");
		}
	}
	
//	곡 삭제(제목)
//	public void removeSong(String title) {
//		for(Song song : songs) {
//			if(song.getTitle().equalsIgnoreCase(title)) {
//				songs.remove(song);
//				break;
//			}
//		}
//	}
	public void removeSong(String title, String artist) {
		boolean titleExist = false;
//		입력한 노래 제목이 플레이리스트에 존재하는지를 기억하기 위한 플래그(flag) 역할
		Song toRemove = null;
//		나중에 삭제할 노래를 정해주는 플래그(flag) 역할, 어떤 곡을 삭제할지 모르기에 null 로 초기화
		
		for(Song song : songs) {
			if(song.getTitle().equalsIgnoreCase(title)) {
				titleExist = true;
				if(song.getArtist().equalsIgnoreCase(artist)) {
					toRemove = song;
					break;
				}
			}
//			입력한 제목이 플레이리스트에 존재하는 노래와 일치한다면 true 로 바꿔주고,
//			입력한 가수가 일치한 노래의 가수와도 모두 일치한다면 삭제할 노래 객체를 toRemove에 저장한다.
		}
		if(toRemove != null) {
			songs.remove(toRemove);
			System.out.println("✅ " + title + " 을(를) 취소했습니다.");
//		제목과 가수 둘 다 일치하는 곡을 찾아 toRemove에 song 이 담겼으면 담긴 노래를 리스트에서 노래를 제거한다.
		} else if(titleExist) {
			System.out.println("노래 제목은 맞지만 가수는 틀립니다.");
		} else {
			System.out.println("❌ " + title + " 은(는) 플레이리스트에 없습니다.");
		}
	}
	
//	총 재생시간 확인
	public int getTotalDuration() {
		int total = 0;
		for(Song song : songs) {
			total += song.getDuration();
		}
		return total;
	}
//	종료
}
