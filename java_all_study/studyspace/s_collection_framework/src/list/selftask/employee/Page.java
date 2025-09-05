package list.selftask.employee;

import java.util.ArrayList;
import java.util.Scanner;

import list.selftask.DBConnecter;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HRManager hrManager = new HRManager();
		
		while(true) {
			System.out.println("===== 직원 급여 관리 시스템 =====");
			System.out.println("1. 직원 등록");
			System.out.println("2. 직원 퇴사");
			System.out.println("3. 직원 목록 조회");
			System.out.println("4. 직원 이름으로 급여 조회");
			System.out.println("5. 전체 평균 급여보다 높은지 조회");
			System.out.println("6. 종료");
			System.out.print("선택: ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
//			1. 직원 등록
			case 1:
				System.out.print("등록할 직원 이름: ");
				String name = sc.next();
				System.out.print("직원 부서: ");
				String department = sc.next();
				System.out.println("직원 월급: ");
				int salary = sc.nextInt();
				
				hrManager.insert(new Employee(name, department, salary));
				
				break;
				
//			2. 직원 퇴사
			case 2:
				System.out.print("퇴사한 직원 이름: ");
				String removeName = sc.next();
				
				hrManager.remove(removeName);
				
				break;
				
//			3. 직원 목록 조회
			case 3:
				ArrayList<Employee> employees = hrManager.findAll();
				if(employees.isEmpty()) {
					System.out.println("직원이 공백입니다.");
				} else {
					System.out.println("=== 직원 목록 ===");
					System.out.println(employees);
				}
				break;
				
//			4. 직원 이름으로 급여 조회
			case 4:
				System.out.print("조회할 직원 이름: ");
				String findName = sc.next();
				
				int foundSalary = hrManager.findSalary(findName);
				if(foundSalary == -1) {
					System.out.println("해당 직원이 없습니다.");
				} else {
					System.out.println(findName + " 님의 급여: " + foundSalary);
				}
				
				break;
				
//			5. 전체 평균 급여보다 높은지 확인
			case 5:
				System.out.print("평균 급여와 조회할 급여: ");
				int findSalary = sc.nextInt();
				boolean isHigher = hrManager.checkSalary(findSalary);
				if(isHigher) {
					System.out.println("입력한 급여는 평균 급여보다 높습니다.");
				} else {
					System.out.println("입력한 급여는 평균 급여보다 낮습니다.");
				}
				break;
				
//			6. 종료
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
					System.out.println("다시 선택해주세요.");
			}
			
		}
		
	}
}
