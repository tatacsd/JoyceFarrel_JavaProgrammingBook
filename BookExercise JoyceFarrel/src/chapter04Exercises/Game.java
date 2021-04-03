package chapter04Exercises;

/*
 * Create a class named Game. Include two Team fields that hold data about
 * the teams participating in the game. Also include a field for game time 
 * (for example, 7 PM). 
 * 
 * Include a constructor that takes parameters for two Team
 * objects and a time. Write an application named TestGame to instantiate a
 * Game object, then pass the Game to a method that displays the details about the Game
 */
public class Game {
	// Data fields
	private Team teamOne;
	private Team teamTwo;
	private String gameTime;
	
	public Game(Team one, Team two, String time) {
		this.teamOne = one;
		this.teamTwo = two;
		this.gameTime = time;
	}

	public Team getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(Team teamOne) {
		this.teamOne = teamOne;
	}

	public Team getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(Team teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getGameTime() {
		return gameTime;
	}

	public void setGameTime(String gameTime) {
		this.gameTime = gameTime;
	}


}
