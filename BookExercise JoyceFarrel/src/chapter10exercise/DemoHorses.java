package chapter10exercise;

/*
 * Write an application that demonstrates using objects of each class.
Save the files as Horse.java, RaceHorse.java, and DemoHorses.java.
 */
public class DemoHorses {
	
	public static void main(String[] args) {
		// Create a horse
		Horse horseOne = new Horse();
		horseOne.setName("Popey");
		horseOne.setColor("Black");
		horseOne.setBirthYear(2018);
		
		
		// Create a race Horse
		RaceHorse horseRaceOne = new RaceHorse();
		horseRaceOne.setName("Lollipop");
		horseRaceOne.setColor("White");
		horseRaceOne.setBirthYear(2020);
		horseRaceOne.setNumRaces(1);
		
		// Display Horses informations
		horseOne.displayInfo();
		horseRaceOne.displayInfo();
		
		
		
		
		
		
		
	}	
	

}
