package list.task.food;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Restaurant {
//	- 음식 추가
	public void insert(Food food) {
		DBConnecter.foods.add(new Food(food));
	}

//	- 음식 이름으로 음식 종류 조회
	public String findKindByName(String name) {
		for (Food food : DBConnecter.foods) {
			if (food.getName().equals(name)) {
				return food.getKind();
			}
		}
		return null;
	}

//	- 사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> findAllByKind(String kind) {
		ArrayList<Food> foundFoods = new ArrayList<Food>();
		for (Food food : DBConnecter.foods) {
			if (food.getKind().equals(kind)) {
				foundFoods.add(new Food(food));
			}
		}

		return foundFoods;
	}

//	- 음식 종류 수정 후 가격 10% 상승
	public void update(Food food) {
		for (Food foundFood : DBConnecter.foods) {
			if (foundFood.getName().equals(food.getName())) {
				foundFood.setKind(food.getKind());
				foundFood.setPrice((int) (foundFood.getPrice() * 1.1));
			}
		}
	}

//	- 사용자가 원하는 종류의 음식 개수 조회
	public int getCountByKind(String kind) {
//		int count = 0;
		ArrayList<Food> foods = new ArrayList<Food>();
		for (Food food : DBConnecter.foods) {
			if (food.getKind().equals(kind)) {
//				count++;
				foods.add(food);
			}
		}
//		return count;
		return foods.size();
	}
}
