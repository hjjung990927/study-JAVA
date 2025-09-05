package s_casting;

public class Juice04 extends Drink{
	public Juice04(String name, int count) {
		super(name, count);
		// TODO Auto-generated constructor stub
	}
	void serve() {
		System.out.println("주문하신 " + name + " " + count + "잔 나왔습니다.");	}

}
