package selfClass02;

//	화면

//	선생님이 아이의 문제를 채점한다
//	문제는 총 10문제이다.
//	1문제당 10점이고, 아이의 점수를 리턴한다.

//	선생님(Teacher)
//	정답

//	아이(Child)
//	답안

public class SelfClass08 {
	public static void main(String[] args) {
		Child08 child = new Child08(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 1});
		Teacher08 teacher = new Teacher08(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 1});
		
		System.out.println(teacher.check(child));
	}
}
