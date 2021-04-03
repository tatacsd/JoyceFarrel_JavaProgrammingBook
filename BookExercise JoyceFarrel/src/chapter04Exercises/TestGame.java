package chapter04Exercises;

/*
 * Write an application named TestGame to instantiate a
 * Game object, then pass the Game to a method that displays the details about the Game
 */
public class TestGame {

	public static void main(String[] args) {
		
		// Initialize two teams
		Team teamOne = new Team("Douglas College", "Basktball girls", "GoRockies");
		Team teamTwo = new Team("SFU", "Soccer girls", "ConquerTheWorld");
		
		
		// Initialize the game object
		Game matchOne = new Game(teamOne, teamTwo, "7 PM");
		
		
		System.out.println("Game:\nTeam #1: " + matchOne.getTeamOne().getTeamName() +
				"\nTeam #2: " + matchOne.getTeamTwo().getTeamName() +
				"\nGame time: " + matchOne.getGameTime());
				
		
	}
}
