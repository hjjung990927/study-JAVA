package list.task.lotte;

import java.util.ArrayList;

import list.task.DBConnecter;

public class Ground {

//	선수 영입
	public void insert(Lotte lotte) {
		DBConnecter.lottes.add(new Lotte(lotte));
	}
	
//	선수 방출
	public void remove(String name) {
		for (int i = 0; i < DBConnecter.lottes.size(); i++) {
			if(DBConnecter.lottes.get(i).getName().equals(name)) {
				DBConnecter.lottes.remove(i);
			}
		}
	}
	
//	조회에서만 리턴하자!
//	아님 말고
//	선수 전체 조회	
	public ArrayList<Lotte> findAll() {
		ArrayList<Lotte> lottes = new ArrayList<Lotte>();
		
		for (int i = 0; i < DBConnecter.lottes.size(); i++) {
			lottes.add(new Lotte(DBConnecter.lottes.get(i)));
		}
		
		return lottes;
	}
	
//	선수 이름으로 타율 조회	
	public double findBattingAvgByName(String name) {
		for(Lotte lotte : DBConnecter.lottes ) {
			if(lotte.getName().equals(name)) {
				return lotte.getBattingAvg();
			}
		}
		
		return -1;
	}
	
//	선수 타율이 평균 타율보다 낮은 지 검사	
	public boolean checkBattingAvg(double battingAvg) {
		double total = 0.0;
		double average = 0.0;
		
		for (int i = 0; i < DBConnecter.lottes.size(); i++) {
			total += DBConnecter.lottes.get(i).getBattingAvg();
		}
		average = total / DBConnecter.lottes.size();
		
		return average < battingAvg;
		
	}
}
