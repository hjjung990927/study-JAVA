package list.task.fruit;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Market {
//  과일 추가
	public void insert(Fruit fruit) {
		DBConnecter.fruits.add(new Fruit(fruit));
	}

//  과일 삭제
	public void remove(String name) {
		for (int i = 0; i < DBConnecter.fruits.size(); i++) {
			if (DBConnecter.fruits.get(i).getName().equals(name)) {
				DBConnecter.fruits.remove(i);
			}
		}
	}

//  과일 가격이 평균 가격보다 낮은 지 검사
	public boolean checkPrice(int price) {
		int total = 0;
		double average = 0.0;

		for (int i = 0; i < DBConnecter.fruits.size(); i++) {
			total += DBConnecter.fruits.get(i).getPrice();
		}
		average = (double) total / DBConnecter.fruits.size();

		return average < price;
	}

//  과일 전체 조회
	public ArrayList<Fruit> findAll() {
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();

		for (int i = 0; i < DBConnecter.fruits.size(); i++) {
			fruits.add(new Fruit(DBConnecter.fruits.get(i)));
		}

		return fruits;
	}

//  과일 이름으로 가격 조회
	public int findPriceByName(String name) {
//      빠른 for문 / forEach문 / 향상된 for문
		for (Fruit fruit : DBConnecter.fruits) {
			if (fruit.getName().equals(name)) {
				return fruit.getPrice();
			}
		}

		return -1;
	}
}
