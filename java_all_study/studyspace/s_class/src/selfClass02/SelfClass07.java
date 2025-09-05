package selfClass02;

//	화면
	
//	쿠팡(Cupang)
//	kg당 가격

//	박스(Box)
//	kg

//	쿠팡의 택배 서비스를 이용하고자 할 때
//	전달한 박스의 가격을 구한다.

public class SelfClass07 {
	public static void main(String[] args) {
		Box07[] arBox = {
				new Box07(9),
				new Box07(2),
				new Box07(7)
		};
		
		Cupang07 cupang = new Cupang07(1000);
		
		System.out.println(cupang.delivery(arBox));
	}
}
