package list.selftask.employee;

import java.util.Objects;

public class Employee {
//	클래스 설계
//	이름 (String name)
//	부서 (String department)
//	급여 (int salary)
	private String name;
	private String department;
	private int salary;

	public Employee() {
		;
	}

	public Employee(String name, String department, int salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Employee(Employee employee) {
		this(employee.getName(), employee.getDepartment(), employee.getSalary());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [name= " + name + ", department= " + department + ", salary= " + salary + "]";
	}
}
