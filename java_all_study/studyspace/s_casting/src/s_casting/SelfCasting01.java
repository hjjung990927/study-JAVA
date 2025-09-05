package s_casting;

//	넷플릭스
//	애니메이션, 영화, 드라마 클래스

//	사용자가 선택한 영상이
//	1. 애니메이션이라면, "자막 지원" 기능 사용
//	2. 영화라면, "4D" 기능 사용
//	3. 드라마라면, "굿즈" 기능 사용

//	위의 기능들은 각 클래스에 메소드로 선언하여 해당 문자열을 출력하라는 뜻이다

//	아래의 getService 메소드 1개로
//	영상 1개를 전달받아서
//	애니메이션인지, 영화인지, 드라마인지 검사한 뒤
//	그 고유 기능을 사용할 수 있게 구현한다.
//	반드시, up casting 과 down casting 을 활용한다.

class Netflix {
	String message;
	public Netflix(String message) {
		super();
		this.message = message;
	}
}

public class SelfCasting01 {
	
	public void getService(Netflix netflix) {
		if(netflix instanceof Animation01) {
			Animation01 animation = (Animation01) netflix; 
			animation.function();
		} else if(netflix instanceof Film01) {
			Film01 film = (Film01) netflix;
			film.function();
		} else if(netflix instanceof Drama01) {
			Drama01 drama = (Drama01) netflix;
			drama.function();
		} else {
			System.out.println("다른 서비스는 지원하지 않습니다.");
		}
	}
	public static void main(String[] args) {
		Animation01 animation = new Animation01("애니메이션");
		Film01 film = new Film01("영화");
		Drama01 drama = new Drama01("드라마");
		
		animation.function();
		film.function();
		drama.function();
	}
}








