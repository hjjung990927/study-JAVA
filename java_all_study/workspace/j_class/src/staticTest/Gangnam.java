package staticTest;

public class Gangnam {
	public static void main(String[] args) {
		Company HJ = new Company("HJ", 1000);
		Company SB = new Company("SB", 2000);
		Company SM = new Company("SM", 3000);
		
		Company.totalIncome += HJ.income;
		Company.totalIncome += SB.income;
		Company.totalIncome += SM.income;
		
		System.out.println(Company.totalIncome);
		
		System.out.println(HJ.id);
		System.out.println(SB.id);
		System.out.println(SM.id);
	}
}
