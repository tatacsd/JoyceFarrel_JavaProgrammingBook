package chapter10;

public class DinnerPartyWithConstructor2 extends PartyWithConstructors2 {

	// Instance Variables
	private int dinnerChoice;
	
	// Constructor
	public DinnerPartyWithConstructor2(int numGuests) {
		super(numGuests);
	}
	
	// Getters and Setters
	public int getDinnerChoice() {
		return dinnerChoice;
	}

	public void setDinnerChoice(int dinnerChoice) {
		this.dinnerChoice = dinnerChoice;
	}
	
	@Override
	public void displayInvitation() {
		System.out.println("Come to my dinner party!");
	}
	
	
}
