package chapter10;

public class DinnerPartyWithConstructor extends PartyWithConstructors {

	// Instance Variables
	private int dinnerChoice;
	
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
