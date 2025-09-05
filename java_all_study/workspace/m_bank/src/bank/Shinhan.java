package bank;

public class Shinhan extends Bank {
	@Override
	public void deposit(int money) {
		money /= 2;
//		입금 시 금액 절반
		super.deposit(money);
//		Bank 클래스의 입금 기능 호출
	}
//	Ctrl + SpaceBar + 호출할 메소드
}
