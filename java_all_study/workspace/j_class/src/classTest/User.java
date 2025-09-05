package classTest;

public class User {
	int id;
	int age;
	String name;
	Exercise[] exercise;
	int total;
	
	public User(int id, String name, int age, Exercise[] exercise) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.exercise = exercise;
		for (int i = 0; i < exercise.length; i++) {
			this.total += exercise[i].calorie;
		}
	}
 	
}
