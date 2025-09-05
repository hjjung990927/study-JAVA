package projectsong;

import java.util.Scanner;

public class PlaylistApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Playlist playlist = new Playlist();
		
		while(true) {
			System.out.println("=== 나만의 플레이리스트 ===");
			System.out.println("1. 곡 추가");
			System.out.println("2. 전체 곡 목록 보기");
			System.out.println("3. 곡 검색");
			System.out.println("4. 곡 삭제");
			System.out.println("5. 총 재생시간 확인");
			System.out.println("0. 종료");
			System.out.print("선택 ▷ ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (choice == 1) {
				System.out.print("제목: ");
				String title = sc.nextLine();
//				문자열 한 줄 바로 입력할 때
				System.out.print("가수: ");
				String artist = sc.nextLine();
				System.out.print("재생시간(초): ");
				int duration = sc.nextInt();
				sc.nextLine();
//				숫자/단어 입력 후 문자열 한 줄 입력을 할 때 sc.nextLine(); 을 잊지말자
//				next(), nextInt()는 엔터를 안 먹기 때문이다.
				playlist.addSong(new Song(title, artist, duration));
				
			} else if (choice == 2) {
				playlist.showAllSongs();
				
			} else if (choice == 3) {
				System.out.print("검색할 노래 제목: ");
				String searchTitle = sc.nextLine();
				playlist.searchSongbyTitle(searchTitle);
				
			} else if (choice == 4) {
				System.out.print("삭제할 노래 제목: ");
				String removeTitle = sc.nextLine();
				System.out.print("삭제할 노래 가수: ");
				String removeArtist = sc.nextLine();
				playlist.removeSong(removeTitle, removeArtist);
				
			} else if (choice == 5) {
				int total = playlist.getTotalDuration();
				int minutes = total / 60;
				int seconds = total % 60;
				System.out.printf("총 재생시간: %d분 %02d초\n", minutes, seconds);
			} else {
				System.out.println("다시 입력해주세요.");
			} 
		}
	}
}
