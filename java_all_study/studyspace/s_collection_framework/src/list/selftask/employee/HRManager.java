package list.selftask.employee;

import java.util.ArrayList;
import java.util.Iterator;

import list.selftask.DBConnecter;

public class HRManager {
//	1. 직원 등록
	public void insert(Employee employee) {
		DBConnecter.employees.add(new Employee(employee));
	}
	
//	2. 직원 퇴사
	public void remove(String name) {
		for (int i = 0; i < DBConnecter.employees.size(); i++) {
			if(DBConnecter.employees.get(i).getName().equals(name)) {
				DBConnecter.employees.remove(i);
			}
		}
	}
	
//	3. 직원 목록 조회
	public ArrayList<Employee> findAll() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		for(Employee employee : DBConnecter.employees) {
			employees.add(employee);
		}
		return employees;
	}
	
//	4. 직원 이름으로 급여 조회
	public int findSalary(String name) {
		for(Employee employee : DBConnecter.employees) {
			if(employee.getName().equals(name)) {
				return employee.getSalary();
			}
		}
		return -1;
	}
	
//	5. 전체 평균 급여보다 높은지 확인
	public boolean checkSalary(int salary) {
		int total = 0, avg = 0 ;
		
		for(Employee employee : DBConnecter.employees) {
			total += employee.getSalary();
		}
		avg = total / DBConnecter.employees.size();
		
		return avg > salary;
	}
	
	
	
	
	
	
	

//	6. 종료
}