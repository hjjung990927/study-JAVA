package s_casting;

class Delivery {
	String message;

	public Delivery(String message) {
		super();
		this.message = message;
	}

}

public class SelfCasting03 {
	public void getDeliveryService(Delivery delivery, int number) {
		if(delivery instanceof FastDelivery03) {
			FastDelivery03 fast = (FastDelivery03) delivery;
			fast.start(number);
		} else if(delivery instanceof EcoDelivery03) {
			EcoDelivery03 eco = (EcoDelivery03) delivery;
			eco.start(number);
		} else if(delivery instanceof PackDelivery03) {
			PackDelivery03 pack = (PackDelivery03) delivery;
			pack.start(number);
		} 
		else {
			System.out.println("[주문번호:" + number + "번] 매장 주문입니다." + delivery.message);
		}
	}
	public static void main(String[] args) {
		
		
	}
}
