package list.selftask.lotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Ground ground = new Ground();
		
		while(true) {
			System.out.println("롯데 선수 관리 시스템");
			System.out.println("1. 선수 영입");
			System.out.println("2. 선수 방출");
			System.out.println("3. 선수 명단 조회");
			System.out.println("4. 선수 이름으로 타율 조회");
			System.out.println("5. 입력한 타율과 평균 팀 타율 비교");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
//			선수 영입
			case 1:
				System.out.print("영입할 선수 이름: ");
				String name = sc.next();				
				System.out.print("선수 나이: ");
				int age = sc.nextInt();				
				System.out.print("선수 타율: ");
				double battingAvg = sc.nextDouble();
				ground.insert(new Lotte(name, age, battingAvg));
				
				System.out.println(name + " 선수를 영입했습니다.");
				break;
				
//			선수 방출
			case 2:
				System.out.println("방출할 선수 이름: ");
				String removeName = sc.next();
				ground.remove(removeName);
				System.out.println(removeName + " 선수가 방출되었습니다.");
				break;
				
//			선수 명단 조회
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
				System.out.println("조회할 선수 이름: ");
				String searchName = sc.next();
				double foundBattingAvg = ground.findBattingAvgByName(searchName);
				System.out.println(searchName + "의 선수 타율: " + foundBattingAvg);
				break;
				
//			입력한 타율과 평균 타율 비교
			case 5:
				System.out.println("원하는 팀 타율을 입력하세요.");
				double inputBattingAvg = sc.nextDouble();
				boolean isLower = ground.checkBattingAvg(inputBattingAvg);
				if(isLower) {
					System.out.println("입력한 타율이 평균보다 높습니다.");
				} else {
					System.out.println("입력한 타율이 평균보다 낮습니다.");
				}
				break;
				
			default : 
				System.out.println("다시 입력하세요.");			
			}
		}
	}
}
