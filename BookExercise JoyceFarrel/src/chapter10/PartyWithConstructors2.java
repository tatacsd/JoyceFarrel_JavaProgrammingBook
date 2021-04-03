package chapter10;

public class PartyWithConstructors2 {

	// Data field
	private int guests;
	
	// Constructor
	public PartyWithConstructors2(int numGuests) {
		guests = numGuests;
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
