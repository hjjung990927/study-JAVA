package s_casting;

public class LoanService02 extends BankService{
	public LoanService02(String message) {
		super(message);
	}
	void service() {
		System.out.println("대출 심사가 시작됩니다.");
	}
}
