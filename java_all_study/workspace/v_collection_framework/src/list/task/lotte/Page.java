package list.task.lotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
//	롯데 타자 정보를 담을 클래스(Lotte)
//	선수 이름
//	선수 타율
		
//	CRUD관련 기능을 담아놓을 클래스 선언(Ground)
//	선수 영입
//	선수 방출
//	선수 전체 조회
//	선수 이름으로 타율 조회
//	선수 타율이 평균 타율보다 낮은 지 검사
		Scanner sc = new Scanner(System.in);
		Ground ground = new Ground();
		
		while(true) {
			System.out.println("롯데자이언츠 타자 관리 시스템");
			System.out.println("1. 선수 영입");
			System.out.println("2. 선수 방출");
			System.out.println("3. 선수 전체 조회");
			System.out.println("4. 선수 이름으로 타율 조회");
			System.out.println("5. 평균 타율보다 낮은지 조회");
			
			int choice = sc.nextInt();
			
			switch(choice) {
//			선수 영입
			case 1:
				System.out.print("영입할 선수 이름: ");
				String name = sc.next();
				
				System.out.print("선수 타율: ");
				double battingAvg = sc.nextDouble();
				ground.insert(new Lotte(name , battingAvg));
				System.out.println("선수를 영입했습니다.");
				break;
				
//			선수 방출
			case 2:
				System.out.print("방출할 선수 이름: ");
				String removeName = sc.next();
				ground.remove(removeName);
				System.out.println("선수를 방출했습니다.");
				break;
				
//			선수 전체 조회
			case 3:
				ArrayList<Lotte> allLottes = ground.findAll();
				if(allLottes.isEmpty()) {
					System.out.println("팀 해체");
				} else {
					System.out.println("선수 명단");
					for(Lotte lotte : allLottes) {
						System.out.println(lotte);
					}
				}
				break;				
				
//			선수 이름으로 타율 조회
			case 4:
				System.out.print("조회할 선수 이름: ");
				String searchName = sc.next();
				double foundBattingAvg = ground.findBattingAvgByName(searchName);
				if(foundBattingAvg == -1) {
					System.out.println("해당 선수가 없습니다.");
				} else {
					System.out.println("타율: " + foundBattingAvg);
				}
				break;
				
				
//			평균 타율보다 낮은지 조회	
			case 5:
				System.out.print("비교할 타율 입력: ");
				double inputBattingAvg = sc.nextDouble();
				boolean isLower = ground.checkBattingAvg(inputBattingAvg);
				if(isLower) {
					System.out.println("입력한 타율이 평균보다 높습니다.");
				} else {
					System.out.println("입력한 타율이 평균보다 낮습니다.");
				}
				break;
				
			
			default:
				System.out.println("다시 입력해주세요.");
			}
		}		
	}
}
