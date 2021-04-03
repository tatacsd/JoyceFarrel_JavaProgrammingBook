package chapter10;

public class Party {

	// Data field
	private int guests;

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
