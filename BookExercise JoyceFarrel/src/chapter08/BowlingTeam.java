package chapter08;

public class BowlingTeam {
	
	// Field for teamName and an array to hold it
	private String teamName;
	private String[] members = new String[4];
	
	
	// Setters and getters
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	// Set the team members name
	public void setMember(int number, String name) {
		members[number] = name;
	}
	
	// Get team members name
	public String getMember(int number) {
		return members[number];
	}
	

}
