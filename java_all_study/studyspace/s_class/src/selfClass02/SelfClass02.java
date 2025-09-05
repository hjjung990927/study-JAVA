package selfClass02;

//	부서별 매출 관리
//	부서는 여러개이다.

//	회사 클래스
//	회사 고유 번호
//	부서 이름
//	부서 매출

//	회사는 부서 총 매출과 평균 매출을 구할 수 있다.

public class SelfClass02 {
	public static void main(String[] args) {
		Department02[] arDepartment = { 
				new Department02("기획부", 100),
				new Department02("세무부", 150),
				new Department02("지원부", 25),
		};
		
		Company02 company = new Company02(1, "롯데", arDepartment);
		System.out.println(company.income);
		System.out.println(company.average);
	}

}
