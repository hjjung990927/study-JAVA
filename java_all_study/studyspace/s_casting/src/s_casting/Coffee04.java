package s_casting;

public class Coffee04 extends Drink{
	public Coffee04(String name, int count) {
		super(name, count);
	}
	void serve() {
		System.out.println("주문하신 " + name + " " + count + "잔 나왔습니다.");	}

}
