package s_casting;

public class EcoDelivery03 extends Delivery{
	public EcoDelivery03(String message) {
		super(message);
	}
	void start(int number) {
		System.out.println("[주문번호:" + number + "번] 알뜰 배달을 시작합니다." + message);
	}
}
