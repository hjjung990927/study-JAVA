package classTest;

public class Company {
	int id;
//	회사 고유 번호
	String name;
//	회사 이름
	Depart[] arDepart;
//	여러 부서를 배열로 할당

	int total;
	double average;

	public Company(int id, String name, Depart[] arDepart) {
		this.id = id;
		this.name = name;
		this.arDepart = arDepart;
		for (int i = 0; i < arDepart.length; i++) {
			total += arDepart[i].income;
		}
		this.average = (double) total / arDepart.length;
	}
}
