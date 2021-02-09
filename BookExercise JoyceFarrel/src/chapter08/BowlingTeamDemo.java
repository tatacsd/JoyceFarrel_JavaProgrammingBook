package chapter08;
import java.util.*;

public class BowlingTeamDemo {

	public static void main(String[] args) {
		
		// Declaring variable and object
		String name;
		final int NUM_TEAM_MEMBERS = 4;
		BowlingTeam bowlTeam = new BowlingTeam();
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);

		// Ask user the team name
		System.out.print("Enter team name >> ");
		name = keyboard.nextLine();
		
		// Add the name to a bowlteam
		bowlTeam.setTeamName(name);
		
		// Loop to add the team members position and name
		for(int i = 0; i < NUM_TEAM_MEMBERS; ++i) {
			System.out.print("Enter team member's name >> ");
			name = keyboard.nextLine();
			bowlTeam.setMember(i, name);
		}
		
		// Display the Bowling team object and info
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		for(int i = 0; i < NUM_TEAM_MEMBERS; ++i) {
			System.out.print(bowlTeam.getMember(i) + " ");
		}
		System.out.println();
		
		
		
		// Close scanner
		keyboard.close();
		
	}
}
