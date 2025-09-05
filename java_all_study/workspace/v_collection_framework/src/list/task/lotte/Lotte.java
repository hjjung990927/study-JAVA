package list.task.lotte;

import java.util.Objects;

public class Lotte {
	
	private String name;
	private double battingAvg;
	
	public Lotte() {
		;
	}
	
	public Lotte(Lotte lotte) {
		this(lotte.getName(), lotte.getBattingAvg());
	}

	public Lotte(String name, double battingAvg) {
		this.name = name;
		this.battingAvg = battingAvg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}
	
	@Override
	public String toString() {
		return "Lotte [name= " + name + ", battingAvg= " + battingAvg + "]";
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
