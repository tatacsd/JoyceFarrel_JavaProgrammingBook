package chapter07Exercise;

import java.util.Scanner;


/*
		 * 2. Write an application that prompts the user for three first names and concatenates
		them in every possible two-name combination so that new parents can
		easily compare them to find the most pleasing baby name. Save the file as
		BabyNameComparison.java.
 */

public class BabyNameComparison {
	
	public static void main(String[] args) {
		
		// Variables
		int count = 1;
		
		// Declaring array
		final int SIZE = 3;
		String[] firstNames = new String[SIZE];
		
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Loop to get the names
		for(int i = 0; i < SIZE; i++){
			System.out.printf("Enter the %d# name >> ", i+1);
			firstNames[i] = keyboard.nextLine();
		}
		
		// Display all possibilities
		System.out.println("All possible two-name combination");
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				if(!firstNames[i].equalsIgnoreCase(firstNames[j])) {
					// Set the first letter upper case in i and j
					char c = firstNames[i].charAt(0);
					c = Character.toUpperCase(c);
					firstNames[i] = c + firstNames[i].substring(1, firstNames[i].length());
					
					c = firstNames[j].charAt(0);
					c = Character.toUpperCase(c);
					firstNames[j] = c + firstNames[j].substring(1, firstNames[j].length());
					
					// Display
					System.out.println(count + "# name: " + firstNames[i] + " " + firstNames[j]);
					count++;
				}
			}
		}
		
		
		// Close scanner
		keyboard.close();
	}

}
