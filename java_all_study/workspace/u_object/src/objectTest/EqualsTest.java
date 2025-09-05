package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "정희준");		
		boolean isSame =  customer.equals(new Customer(1, "정희준"));
		
		System.out.println(isSame);
	}
}
