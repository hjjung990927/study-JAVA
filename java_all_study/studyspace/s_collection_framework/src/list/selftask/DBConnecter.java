package list.selftask;

import java.util.ArrayList;

import list.selftask.employee.Employee;
import list.selftask.lotte.Lotte;
import list.selftask.movie.Movie;

public class DBConnecter {
	protected DBConnecter() {
		;
	}
	
	public static ArrayList<Lotte> lottes = new ArrayList<Lotte>();
	
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public static ArrayList<Movie> movies = new ArrayList<Movie>();
}
