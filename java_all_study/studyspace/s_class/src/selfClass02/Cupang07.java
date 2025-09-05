package selfClass02;

//	화면

//	쿠팡(Cupang)
//	kg당 가격

//	박스(Box)
//	kg

//	쿠팡의 택배 서비스를 이용하고자 할 때
//	전달한 박스의 가격을 구한다.

public class Cupang07 {
	int price;

	public Cupang07(int price) {
		this.price = price;
	}
	int delivery(Box07[] arBox) {
		int total = 0;
		for (int i = 0; i < arBox.length; i++) {
			total += arBox[i].kg * price;
 		}
		return total;
	}

}
