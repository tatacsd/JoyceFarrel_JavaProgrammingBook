package chapter03Exercise;
/*
 * 
 * 
	 * Assume that a gallon of paint covers about 350 square feet of wall space. Create
	an application with a main() method that prompts the user for the length, width,
	and height of a rectangular room. Pass these three values to a method that does
	the following:
		• Calculates the wall area for a room
		• Passes the calculated wall area to another method that calculates and returns
		the number of gallons of paint needed
		• Displays the number of gallons needed
		• Computes the price based on a paint price of $32 per gallon, assuming that
		the painter can buy any fraction of a gallon of paint at the same price as a
		whole gallon
		• Returns the price to the main() method
	The main() method displays the final price. For example, the cost to paint		
	a 15-by-20-foot room with 10-foot ceilings is $64. Save the application as
	PaintCalculator.java
 */

import java.util.Scanner;

public class PaintCalculator {
	
	public static void main(String[] args) {
		// Initiate the Scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the length value >> ");
		double lenghtRoom = keyboard.nextDouble();
		System.out.printf("Please enter the width value >> ");
		double widthRoom = keyboard.nextDouble();
		System.out.printf("Please enter the height value >> ");
		double heightRoom = keyboard.nextDouble();
		
		// Close Scanner
		keyboard.close();
		
		double numberOfGallons = calculateNumberGallons(lenghtRoom, widthRoom, heightRoom);
		double cost = computePaintPrice(numberOfGallons);		
		
		// Display the final price
		System.out.printf("the cost to paint a %.0f-by-%.0f-foot room with %.1f-foot ceilings is $ %.2f .", lenghtRoom, widthRoom, heightRoom, cost);
	}
	// Methods
	// Calculate the Room (rectangle) area
	public static double calculateRoomArea(double lenght, double width, double height) {
		return ((height * lenght) * 2) + ((height * width) * 2);
	}
	
	// Passes the calculated wall area to another method that calculates and returns
	// the number of gallons of paint needed
	public static double calculateNumberGallons(double lenght, double width, double height) {
		// a gallon of paint covers about 350 square feet of wall space
		final double NUMBER_OF_FEET_PER_GALLON = 350;
		double roomArea = calculateRoomArea(lenght, width, height);
		double numberOfGallons = roomArea / NUMBER_OF_FEET_PER_GALLON;
		
		return numberOfGallons;		
	}
	
	// Computes the price based on a paint price of $32 per gallon, assuming that
	// the painter can buy any fraction of a gallon of paint at the same price as a
	// whole gallon
	public static double computePaintPrice(double numGallons) {
		return numGallons * 32.0;
	}
	
}
