package castingTest;

// 	넷플릭스
// 	애니메이션, 영화, 드라마 클래스

// 	사용자가 선택한 영상이
// 	1. 애니메이션이라면, "자막 지원" 기능 사용
// 	2. 영화라면, "4D" 기능 사용
// 	3. 드라마라면, "굿즈" 기능 사용

// 	위의 기능들은 각 클래스에 메소드로 선언하여 해당 문자열을 출력하라는 뜻이다.

class Netflix {
	String message;
	
	public Netflix(String message) {
		super();
		this.message = message;
	}
}

public class CastingTask {

//	아래의 getService 메소드 1개로
//	영상 1개를 전달받아서
//	애니메이션인지, 영화인지, 드라마인지 검사한 뒤
//	그 고유 기능을 사용할 수 있게 구현한다.
//	반드시, up casting 과 down casting 을 활용한다.
	
	public void getService(Netflix netflix) {
		if(netflix instanceof Animation) {
			Animation animation = (Animation) netflix;
			animation.function();
		} else if(netflix instanceof Film) {
			Film film = (Film) netflix;
			film.function();
		} else if(netflix instanceof Drama) {
			Drama drama = (Drama) netflix;
			drama.function();
		} else {
			System.out.println("지원이 없는 장르입니다.");
		}
	}

	public static void main(String[] args) {
		CastingTask castingTask = new CastingTask();
		
		Netflix[] arNetflix = {
				new Animation(""),
				new Film(""),
				new Drama("")
		};
		
		for (int i = 0; i < arNetflix.length; i++) {
			castingTask.getService(arNetflix[i]);
		}
//		Animation animation = new Animation("애니메이션");
//		Film film = new Film("영화");
//		Drama drama = new Drama("드라마");
//		
//		animation.function();
//		film.function();
//		drama.function();
	}
}




















