package s_casting;

class Drink {
	String name;
	int count;
	static int totalCount = 0;

	public Drink(String name, int count) {
		this.name = name;
		this.count = count;
		totalCount += count;
	}
	
}

public class SelfCasting04 {
	public void getDrinkService(Drink drink) {
		if(drink instanceof Coffee04) {
			Coffee04 coffee = (Coffee04) drink;
			coffee.serve();
		} else if(drink instanceof Juice04) {
			Juice04 juice = (Juice04) drink;
			juice.serve();
		} else if(drink instanceof Tea04) {
			Tea04 tea = (Tea04) drink;
			tea.serve();
		} else {
			System.out.println("준비중인 음료입니다.");
		}
	}
	public static void main(String[] args) {
		Coffee04 coffee = new Coffee04("아이스 아메리카노", 5);
		Juice04 juice = new Juice04("복숭아 아이스티", 5);
		Tea04 tea = new Tea04("홍차", 7);
		TotalCount04 totalCount = new TotalCount04();
				
		coffee.serve();
		juice.serve();
		tea.serve();
		totalCount.total();
		
		
	}
}
