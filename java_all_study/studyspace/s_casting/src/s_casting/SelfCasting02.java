package s_casting;

class BankService {
	String message;

	public BankService(String message) {
		super();
		this.message = message;
	}
	
}

public class SelfCasting02 {
	public void getBankService(BankService bankservice) {
		if(bankservice instanceof WithdrawService02) {
			WithdrawService02 withdraw = new WithdrawService02("입금");
			withdraw.service();
		} else if(bankservice instanceof DepositService02) {
			DepositService02 deposit = new DepositService02("출금");
			deposit.service();
		} else if(bankservice instanceof LoanService02) {
			LoanService02 loan = new LoanService02("대출");
			loan.service();
		} else {
			System.out.println("그 외 서비스는 이용이 어렵습니다.");
		}
	}
	public static void main(String[] args) {
//		SelfCasting02 system = new SelfCasting02();
//		BankService s1 = new WithdrawService02("입금");
//		BankService s2 = new DepositService02("출금");
//		BankService s3 = new LoanService02("입금");
//		
//		system.getBankService(s1);
//		system.getBankService(s2);
//		system.getBankService(s3);
		
		WithdrawService02 withdraw = new WithdrawService02("입금");
		DepositService02 deposit = new DepositService02("출금");
		LoanService02 loan = new LoanService02("대출");
		
		withdraw.service();
		deposit.service();
		loan.service();		
	}
}
