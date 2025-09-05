package projecttrip;

import java.util.Objects;

public class Trip {
	private String destination;
//	여행지
	private String startDate;
//	출발일
	private String endDate;
//	도착일
	private int budget;
//	예산

	public Trip() {
		;
	}

	public Trip(String destination, String startDate, String endDate, int budget) {
		this.destination = destination;
		this.startDate = startDate;
		this.endDate = endDate;
		this.budget = budget;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	@Override
	public int hashCode() {
		return Objects.hash(destination, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Trip other = (Trip) obj;
		return Objects.equals(destination, other.destination) && Objects.equals(startDate, other.startDate);
	}

	@Override
	public String toString() {
		return String.format(
		        "📍 여행지: %-10s | 출발일: %s | 도착일: %s | 예산: %,d원",
		        destination, startDate, endDate, budget
		    );
	}
	
	

}
