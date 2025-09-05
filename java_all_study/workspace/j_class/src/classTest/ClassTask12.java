package classTest;

public class ClassTask12 {
//	화면
	
//	쿠팡(Cupang)
//	kg당 가격
	
//	박스(Box)
//	kg
	
//	쿠팡의 택배 서비스를 이용하고자 할 때
//	전달한 박스의 가격을 구한다.
	
	public static void main(String[] args) {
		Box[] arBox = {
				new Box(3),
				new Box(2),
				new Box(6),
		};
		
		Cupang cupang = new Cupang(10000);
		
		int fee = cupang.delivery(arBox);
		System.out.println(fee);
	}
}
