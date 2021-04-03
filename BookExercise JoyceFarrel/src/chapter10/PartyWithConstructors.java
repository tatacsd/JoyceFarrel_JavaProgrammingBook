package chapter10;

public class PartyWithConstructors {

	// Data field
	private int guests;
	
	// Constructor
	public PartyWithConstructors() {
		System.out.println("Creating a party");
	}

	// Getters and Setters
	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}	

	// Method
	public void displayInvitation() {
		System.out.println("Please come to my party!");
	}
}
