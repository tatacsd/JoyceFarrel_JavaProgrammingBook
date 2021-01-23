package chapter03Exercise;

import java.util.Scanner;

/*
 * There are 12 inches in a foot and 3 feet in a yard. Create a class named
InchConversion. Its main() method accepts a value in inches from a user at the
keyboard, and in turn passes the entered value to two methods. One converts the
value from inches to feet, and the other converts the same value from inches to
yards. Each method displays the results with appropriate explanation. Save the
application as InchConversion.java.
 */

public class InchConversion {
	public static void main(String[] args) {
		// Initiate the Scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the value in inchs >> ");
		double inch = keyboard.nextDouble();
		
		convertInchToFeet(inch);
		convertInchToYard(inch);
	}	
	
	// Methods
	// Convert inches to feet
	public static void convertInchToFeet(double inch) {
		final double INCHS_IN_A_FOOT = 12;
		double foot = inch / INCHS_IN_A_FOOT;
		System.out.printf("A Foot has 12 inches.\nYou entered %.0f inches. You have %.1f feet.\n\n", inch, foot);
	}
	
	// Convert inches to yards
	public static void convertInchToYard(double inch) {
		final double INCHS_IN_A_YARD = 36;
		double yard = inch / INCHS_IN_A_YARD;
		System.out.printf("A Yard has 36 inches.\nYou entered %.0f inches. You have %.1f yard.", inch, yard);
	}
	
}
