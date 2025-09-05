package classTest;

public class ClassTask10 {
	public static void main(String[] args) {
		Customer 한동석 = new Customer("한동석", "01012341234", 10000, 30);
		Customer 조영인 = new Customer("조영인", "01055556666", 100000, 10);
		Market 이마트 = new Market("과자", 1500, 5);

		이마트.sell(한동석);
		System.out.println(한동석.money);
		System.out.println(이마트.stock);

		이마트.sell(조영인);
		System.out.println(조영인.money);
		System.out.println(이마트.stock);
	}
}
