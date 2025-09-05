package copyTest;

public class User {
	private String firtName;
	private String lastName;
	private Address address;

	public User() {
		;
	}

//	shallow copy
//	public User(User user) {
//		this(user.getFirtName(), user.getLastName(), user.getAddress());
//	}

//	deep copy
	public User(User user) {
		this(user.getFirtName(), user.getLastName(), new Address(user.getAddress()));
	}

	public User(String firtName, String lastName, Address address) {
		this.firtName = firtName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirtName() {
		return firtName;
	}

	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [firtName=" + firtName + ", lastName=" + lastName + ", address=" + address + "]";
	}

}
