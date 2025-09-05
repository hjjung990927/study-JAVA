package selfClass02;

//화면

//선생님이 아이의 문제를 채점한다
//문제는 총 10문제이다.
//1문제당 10점이고, 아이의 점수를 리턴한다.

//선생님(Teacher)
//정답

//아이(Child)
//답안

public class Teacher08 {
	int[] arAnswer;

	public Teacher08(int[] arAnswer) {
		this.arAnswer = arAnswer;
	}
	
	int check(Child08 child) {
		int score = 0;
		for (int i = 0; i < child.arAnswer.length; i++) {
			if(child.arAnswer[i] == this.arAnswer[i]) {
				score += 10;
			}
		}
		return score;
	}
}
