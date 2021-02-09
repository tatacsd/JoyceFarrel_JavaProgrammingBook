package chapter08;
import java.util.*;

public class BowlingTeamDemo3 {

	public static void main(String[] args) {
		
		// Declaring variable and object
		String name;
		final int NUM_TEAM_MEMBERS = 4;
				
		final int NUM_TEAMS = 4;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);

		// Allocate memory for each array object of team
		for(int i = 0; i < NUM_TEAMS; i++) {
			teams[i] = new BowlingTeam();
			
			// Ask user the team name
			System.out.print("Enter team name >> ");
			name = keyboard.nextLine();
			teams[i].setTeamName(name);
			
			// Loop to add the team members position and name
			for(int j = 0; j < NUM_TEAM_MEMBERS; ++j) {
				System.out.print("Enter team member's name >> ");
				name = keyboard.nextLine();
				teams[i].setMember(j, name);
			}			
		}

		
		// Display the Bowling team object and info
		for(int i = 0; i < NUM_TEAMS; i++) {
			System.out.println("\nMembers of team " + teams[i].getTeamName());
			for(int j = 0; j < NUM_TEAM_MEMBERS; ++j) {
				System.out.print(teams[i].getMember(j) + " ");
			}
			System.out.println();
			
		}
		
		// Ask the user a team name
		System.out.print("\n\nEnter a team name to see its roster >> ");
		name = keyboard.nextLine();
		
		// Find the team
		//// Loop through teams name
		for(int i = 0; i < teams.length; ++i) {
			// Check if teams i is equal to input name
			if(name.equalsIgnoreCase(teams[i].getTeamName())) {
				// Loop to get the team members name
				for(int j = 0; j < NUM_TEAM_MEMBERS; ++j) {
					System.out.print(teams[i].getMember(j) + " ");
				}
			}
		}
		
		
		
		
		// Close scanner
		keyboard.close();
		
	}
}
