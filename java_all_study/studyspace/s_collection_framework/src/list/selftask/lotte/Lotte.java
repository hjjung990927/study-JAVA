package list.selftask.lotte;

import java.util.Objects;

public class Lotte {
	private String name;
	private int age;
	private double battingAvg;
	
	public Lotte() {
		;
	}
	
	public Lotte(Lotte lotte) {
		this(lotte.getName(), lotte.getAge(), lotte.getBattingAvg());
	}

	public Lotte(String name, int age, double battingAvg) {
		this.name = name;
		this.age = age;
		this.battingAvg = battingAvg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	@Override
	public String toString() {
		return "Lotte [name= " + name + ", age= " + age + ", battingAvg= " + battingAvg + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lotte other = (Lotte) obj;
		return Objects.equals(name, other.name);
	}

}
