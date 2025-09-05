package objectTest;

import java.util.Objects;

public class Customer {
	private int id;
	private String name;
	
	public Customer() {
		;
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

//	Alt + Shift + s 단축키 활용 후 equals() 있는걸 찾자~
	@Override
//	오버라이딩 = 재정의 !좀 외우자!
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id;
	}
	
	
	
	
	
}
