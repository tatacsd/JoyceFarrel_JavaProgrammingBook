package chapter04;

public class BaseballPlayer {
	// Data field
	private static int countOfPlayers = 0; // all objects refers to the same address
	private int number;
	private double battingAverage;
	
	// Constructors
	public BaseballPlayer(int id, double avg) {
		number = id;
		battingAverage = avg;
		countOfPlayers += 1; // add one and all objects has access to its
	}
	
	// Methods
	public void showPlayer() {
		System.out.println("Player #" + number +
				" batting average is " + battingAverage +
				" There are " + countOfPlayers + " players");
	}

}
