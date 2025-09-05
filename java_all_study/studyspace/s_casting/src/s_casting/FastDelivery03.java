package s_casting;

public class FastDelivery03 extends Delivery {
	public FastDelivery03(String message) {
		super(message);
	}
	void start(int number) {
		System.out.println("[주문번호:" + number + "번] 빠른 배달을 시작합니다." + message);
	}
}
