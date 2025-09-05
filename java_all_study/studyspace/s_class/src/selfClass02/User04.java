package selfClass02;

//	화면
//	회원마다 여러 종류의 운동을 한다.
//	진행한 운동마다 칼로리를 기록한다.
//	이 때, 회원들은 각각 운동한 총 칼로리를 계산할 수 있다.

//	회원(User)
//	회원번호
//	이름
//	나이

//	운동(Exercise)
//	종목명
//	칼로리(정수)

public class User04 {
	int id;
	String name;
	int age;
	Exercise04[] arExercise;
	int total;
	public User04(int id, String name, int age, Exercise04[] arExercise) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.arExercise = arExercise;
		for (int i = 0; i < arExercise.length; i++) {
			this.total += arExercise[i].calorie;
		}
	}
	
}
