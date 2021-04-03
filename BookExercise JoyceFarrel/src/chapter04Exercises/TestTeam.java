package chapter04Exercises;


/*
 *  Write an application named TestTeam to instantiate three Team objects with different values, and
 * then display all the data, including the motto, for each object. 
 * Save both the Team.java and TestTeam.java files
 */
public class TestTeam {
	public static void main(String[] args) {
		Team teamOne = new Team("Douglas College", "Basktball girls", "GoRockies");
		Team teamTwo = new Team("SFU", "Soccer girls", "ConquerTheWorld");
		Team teamThree = new Team("BCIT", "Volley girls", "GranTran");
		// using ToString
		System.out.println(teamOne);
		System.out.println();
		System.out.println(teamTwo);
		System.out.println();
		
		// using getters
		System.out.println("HighSchool name:" + teamThree.getHighSchool() +
				",\nSport Type: " + teamThree.getSportType() +
				",\nTeam name :" + teamThree.getTeamName() + "\n " + Team.MOTTO);
		
	}

}
