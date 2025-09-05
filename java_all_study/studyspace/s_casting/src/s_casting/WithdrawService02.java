package s_casting;

public class WithdrawService02 extends BankService{
	public WithdrawService02(String message) {
		super(message);
	}
	void service() {
		System.out.println("출금이 처리되었습니다.");
	}
}
