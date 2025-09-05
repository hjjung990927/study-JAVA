package interfaceTest;

public interface Animal {
//	상수만 올 수 있기 때문에 final static 이 자동 생략된다.
	int eyes = 2;
	final static int nose = 1; 
	
	void showHands();
	abstract void sitDown();
	void poop();
	void waitNow();
}

//	비슷한 예제로 식물,과자 머 등등 인터페이스로 만들어보기
//	어뎁터 관련 AnimalAdapter, Tiger 제외해도 좋다