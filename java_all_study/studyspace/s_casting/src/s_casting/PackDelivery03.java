package s_casting;

public class PackDelivery03 extends Delivery{
	public PackDelivery03(String message) {
		super(message);
	}
	void start(int number) {
		System.out.println("[주문번호:" + number + "번] 포장 주문입니다." + message);
	}
}
