package chapter10exercise;

/*
 * 1. Create a class named Horse that contains data fields for the name, color, and
birth year. Include get and set methods for these fields.

 Next, create a subclass
named RaceHorse, which contains an additional field that holds the number of
races in which the horse has competed and additional methods to get and set
the new field. Write an application that demonstrates using objects of each class.
Save the files as Horse.java, RaceHorse.java, and DemoHorses.java.
 */
public class Horse {
	// Data field
	private String name;
	private String color;
	private int birthYear;
	
	public Horse() {
		
	}
	
	public Horse(String name, String color, int bYear) {
		this.name  = name;
		this.color = color;
		this.birthYear = bYear;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	// Method
	public void displayInfo() {
		System.out.println("The horse name is: " + name + "\n color: " + color + "\n year: " +  birthYear);
	}
	
	
	

}
