package chapter07Exercise;

import java.util.Scanner;

/*
 * . 3b. Write an application that counts the total number of spaces contained in
a quote entered by the user. Save the file as CountSpaces2.java.
 */
public class CountSpaces2 {
	public static void main(String[] args) {
		// Variable
		String quote;
		int numSpaces = 0;
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a quotation >> ");
		quote = keyboard.nextLine();
		
		// Check the number of spaces
		for(int i = 0; i < quote.length(); i++) {
			if(quote.charAt(i) == ' ') {
				numSpaces++;
			}
		}
		// Prompt to user
		System.out.println("In the quotation:\n\t" + quote);
		System.out.println("You have " + numSpaces + " spaces.");
		
		
		// Close scanner
		keyboard.close();
	}

}
