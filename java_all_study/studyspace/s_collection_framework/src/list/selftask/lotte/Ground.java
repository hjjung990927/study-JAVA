package list.selftask.lotte;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import list.selftask.DBConnecter;

public class Ground {
//	선수 등록
	public void insert(Lotte lotte) {
		DBConnecter.lottes.add(new Lotte(lotte));
	}

//	선수 방출
//	public void remove(String name) {
//		for (int i = 0; i < DBConnecter.lottes.size(); i++) {
//			if(DBConnecter.lottes.get(i).getName().equals(name)) {
//				DBConnecter.lottes.remove(i);
//			}
//		}
//	}
	public void remove(String name) {
		DBConnecter.lottes.removeIf((lotte) -> lotte.getName().equals(name));
	}
//	removeIf: 리스트에서 특정 조건을 만족하는 항목을 제거할 때 사용하는 코드

//	선수 전체 조회
//	public ArrayList<Lotte> findAll() {
//		ArrayList<Lotte> lottes = new ArrayList<Lotte>();
//		
//		for(Lotte lotte : DBConnecter.lottes) {
//			lottes.add(lotte);
//		}
//		return lottes;
//	}
	public ArrayList<Lotte> findAll() {
		return DBConnecter.lottes.stream().collect(Collectors.toCollection(ArrayList::new));
	}
//	collect(...): 스트림을 다시 리스트로 모음
//	ArrayList::new => 새로운 ArrayList로 만들어라!

//	선수 이름으로 타율 조회
//	public double findBattingAvgByName(String name) {
//		for(Lotte lotte : DBConnecter.lottes) {
//			if(lotte.getName().equals(name)) {
//				return lotte.getBattingAvg();
//			}
//		}
//		return -1;
//	}
	public double findBattingAvgByName(String name) {
		return DBConnecter.lottes.stream().filter((lotte) -> lotte.getName().equals(name))
				.mapToDouble(Lotte::getBattingAvg).findFirst().orElse(-1);
	}

//	평균 타율보다 낮은지 조회
	public boolean checkBattingAvg(double battingAvg) {
		double total = 0.0;
		double avg = 0.0;

		for (int i = 0; i < DBConnecter.lottes.size(); i++) {
			total += DBConnecter.lottes.get(i).getBattingAvg();
		}

		avg = total / DBConnecter.lottes.size();

		return avg < battingAvg;
	}

}
