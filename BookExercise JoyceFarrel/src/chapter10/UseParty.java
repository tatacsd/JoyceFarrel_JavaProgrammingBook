package chapter10;

import java.util.Scanner;

public class UseParty {
	
	public static void main(String[] args) {
		
		// Variables
		int guests;
		Party aParty = new Party();
		DinnerParty2 aDinnerParty = new DinnerParty2();
		
		
		
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of guests for the party >> ");
		guests = keyboard.nextInt();
		aParty.setGuests(guests);
		
		System.out.println("The party has " + aParty.getGuests() +
				" guests");
		aParty.displayInvitation();

		System.out.print("Enter number of guests for the dinner party >> ");
		guests = keyboard.nextInt();
		aDinnerParty.setGuests(guests);
		
		System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
		aDinnerParty.setDinnerChoice(keyboard.nextInt());
		
		System.out.println("The dinner party has " + aDinnerParty.getGuests() +
				" guests\nMenu option " + aDinnerParty.getDinnerChoice() + 
				" will be served");
		aDinnerParty.displayInvitation();
		
		// Close scanner
		keyboard.close();
	}

}
