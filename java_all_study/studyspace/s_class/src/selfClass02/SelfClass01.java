package selfClass02;

//	화면
//	학생의 점수를 입력받은 뒤 총점과 평균을 출력한다.
//	학생의 점수는 생성자로 초기화한다.
//	모든 학생은 공통적으로 총점과 평균을 구할 수 있다.

public class SelfClass01 {
	public static void main(String[] args) {
		Subject01[] arSubject = { 
				new Subject01("국어", 90), 
				new Subject01("수학", 85), 
				new Subject01("영어", 85), 
		};
		Student01 HJ = new Student01(arSubject);
		
		System.out.println(HJ.total);
		System.out.println(HJ.average);
	}

}
