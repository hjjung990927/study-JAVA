package bank;

public class Kakao extends Bank {
	@Override
	public int showBalance() {
		this.setMoney(this.getMoney() / 2);
//		this.getMoney()로 현재 잔액 가져온 후
//		현재 잔액을 절반으로 출인 뒤 저장
		return super.showBalance();
	}
}
