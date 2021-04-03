package chapter04Exercises;

/*
 * 
 * 5. 
 * a. Create a class to hold data about a high school sports team. 
 * The Team class holds data fields for high school name (such as Roosevelt High), 
 * sport (such as Girls’ Basketball), and team name (such as Dolphins). 
 * 
 * Include a constructor that takes parameters for each field, and include get methods
 * that return the values of the fields. 
 * Also include a public final static String named MOTTO and initialize it to Sportsmanship!.
 *  
 * Write an application named TestTeam to instantiate three Team objects with different values, and
 * then display all the data, including the motto, for each object. 
 * Save both the Team.java and TestTeam.java files
 */

public class Team {
	
	// Data fields
	private String highSchool;
	private String sportType;
	private String teamName;
	
	public final static String MOTTO = "Sportsmanship!";
	
	public Team () {
				
	}
	
	public Team(String highSchool, String sportType, String teamName) {
		this.highSchool = highSchool;
		this.sportType = sportType;
		this.teamName = teamName;
	}

		
	// Getters and Setters
	public String getHighSchool() {
		return highSchool;
	}

	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}

	public String getSportType() {
		return sportType;
	}

	public void setSportType(String sportType) {
		this.sportType = sportType;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	@Override
	public String toString() {
		return "highSchool name:" + highSchool + ",\nSport Type: " + sportType + ",\nTeam name :" + teamName + "\n " + MOTTO;
	}
	
	
	
	

	
}
