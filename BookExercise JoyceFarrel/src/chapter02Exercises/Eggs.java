package chapter02Exercises;

import java.util.Scanner;

/*
				 * 11 Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges
				$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a
				dozen. Write a program that prompts a user for the number of eggs in the
				order and then display the amount owed with a full explanation. For example,
				typical output might be, You ordered 27 eggs. That’s 2 dozen at $3.25 per
				dozen and 3 loose eggs at 45 cents each for a total of $7.85. Save the program
				as Eggs.java
 */
public class Eggs {
	
	public static void main(String[] args) {
		// Constants
		final double DOZEN_EGGS_PRICE = 3.25;
		final double INDIVIDUAL_EGGS_PRICE = 0.45;
		int numberOfEggs;
				
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please the type how many eggs do you want >> ");
		numberOfEggs = keyboard.nextInt();
		
		int packOfEggs = numberOfEggs / 12;
		int looseEggs = numberOfEggs % 12;
		
		
		double total = (packOfEggs * DOZEN_EGGS_PRICE) + (looseEggs * INDIVIDUAL_EGGS_PRICE);
		
		System.out.printf("You ordered %d eggs. That’s %d dozen at $3.25 per dozen and %d loose eggs at 45 cents each for a total of $%.2f.",
				numberOfEggs, packOfEggs, looseEggs, total);	
		
		
		// Close scanner
		keyboard.close();
	}

}
