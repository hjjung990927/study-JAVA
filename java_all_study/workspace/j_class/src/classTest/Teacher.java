package classTest;

public class Teacher {
	int[] arAnswer;

	public Teacher(int[] arAnswer) {
		this.arAnswer = arAnswer;
	}
	
	int check(Child child) {
		int score = 0;
		for (int i = 0; i < child.arAnswer.length; i++) {
			if(child.arAnswer[i] == this.arAnswer[i]) {
				score += 10;
			}
		}
		return score;
	}
}
