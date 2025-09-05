package selfClass02;

//	부서별 매출 관리
//	부서는 여러개이다.

//	회사 클래스
//	회사 고유 번호
//	부서 이름
//	부서 매출

//	회사는 부서 총 매출과 평균 매출을 구할 수 있다.

public class Company02 {
	int id;
	String name;
	Department02[] arDepartment;
	int income;
	double average;
	
	public Company02(int id, String name, Department02[] arDepartment) {
		this.id = id;
		this.name = name;
		this.arDepartment = arDepartment;
		for (int i = 0; i < arDepartment.length; i++) {
			this.income += arDepartment[i].income;
		}
		this.average = (double)this.income / arDepartment.length;
	}
	
}
