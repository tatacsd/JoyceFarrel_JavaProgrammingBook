package chapter10exercise;
/*
 *  Next, create a subclass
named RaceHorse, which contains an additional field that holds the number of
races in which the horse has competed and additional methods to get and set
the new field. 

Write an application that demonstrates using objects of each class.
Save the files as Horse.java, RaceHorse.java, and DemoHorses.java.
 */

public class RaceHorse extends Horse {
	// Data field
	 private int numRaces;
	 
	 public RaceHorse() {
		
	}

	// Constructor
	public RaceHorse(String name, String color, int bYear, int numRaces) {
		super(name, color, bYear);
		this.numRaces = numRaces;		
		
	}
	 
	// Getters and Setters
	public int getNumRaces() {
		return numRaces;
	}

	public void setNumRaces(int numRaces) {
		this.numRaces = numRaces;
	}
	
	// Methods
	@Override
	public void displayInfo() {
		System.out.println("The horse name is: " + this.getName() + "\n color: " + this.getColor() + "\n year: " +  this.getBirthYear() + "\n number of races: " + this.getNumRaces());
	}
	 
	 
	
	

}
