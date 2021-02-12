package chapter04;

public class TestPlayer {

	public static void main(String[] args) {
		BaseballPlayer aCatcher = new BaseballPlayer(12, .218);
		BaseballPlayer aShortStop = new BaseballPlayer(31, .385);
		
		aCatcher.showPlayer();
		aShortStop.showPlayer();
		
		BaseballPlayer anOutFielder = new BaseballPlayer(44, .505);
		
		anOutFielder.showPlayer();
		aCatcher.showPlayer();
		
	}
}
