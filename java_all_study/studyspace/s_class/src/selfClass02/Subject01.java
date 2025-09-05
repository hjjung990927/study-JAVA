package selfClass02;

//	화면
//	학생의 점수를 입력받은 뒤 총점과 평균을 출력한다.
//	학생의 점수는 생성자로 초기화한다.
//	모든 학생은 공통적으로 총점과 평균을 구할 수 있다.

public class Subject01 {
	String name;
	int score;
	
	public Subject01(String name, int score) {
		this.name = name;
		this.score = score;
	}
}
