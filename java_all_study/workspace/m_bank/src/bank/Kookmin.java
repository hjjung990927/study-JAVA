package bank;

public class Kookmin extends Bank {
	@Override
	public void withdraw(int money) {
		money *= 1.5;
//		출금 금액에 1.5배 수수료 붙여서 출금
		super.withdraw(money);
	}
}
