package s_casting;

public class DepositService02 extends BankService{
	public DepositService02(String message) {
		super(message);
	}
	void service() {
		System.out.println("입금이 처리되었습니다.");
	}
}
