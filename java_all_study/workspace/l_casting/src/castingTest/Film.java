package castingTest;

//	넷플릭스
//	애니메이션, 영화, 드라마 클래스

//	사용자가 선택한 영상이
//	1. 애니메이션이라면, "자막 지원" 기능 사용
//	2. 영화라면, "4D" 기능 사용
//	3. 드라마라면, "굿즈" 기능 사용

//	위의 기능들은 각 클래스에 메소드로 선언하여 해당 문자열을 출력하라는 뜻이다

public class Film extends Netflix {
	public Film(String message) {
		super(message);
	}
	void function() {
		System.out.println("4D 체험을 지원해드려요~");
	}
}
