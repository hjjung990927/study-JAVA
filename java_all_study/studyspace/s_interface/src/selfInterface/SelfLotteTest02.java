package selfInterface;

public class SelfLotteTest02 {
	public static void main(String[] args) {
		SelfHitter02 hitter = new SelfHitter02();
		SelfPitcher02 pitcher = new SelfPitcher02();
		
		System.out.println("타자 반응");
		hitter.strike();
		hitter.ball();
		hitter.homeRun();
		hitter.strike();

		System.out.println("투수 반응");
		pitcher.strike();
		pitcher.ball();
		pitcher.homeRun();
		pitcher.strike();	
	}
}
