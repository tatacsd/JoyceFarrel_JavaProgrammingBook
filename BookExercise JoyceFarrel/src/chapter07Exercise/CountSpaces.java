package chapter07Exercise;
/*
 * . 3a. Create a program that contains a String that holds your favorite inspirational
quote and display the total number of spaces contained in the String. Save
the file as CountSpaces.java.
 */
public class CountSpaces {
	public static void main(String[] args) {
		// Variable
		String quote = "Happiness is only real when shared";
		int numSpaces = 0;
		
		// Check the number of spaces
		for(int i = 0; i < quote.length(); i++) {
			if(quote.charAt(i) == ' ') {
				numSpaces++;
			}
		}
		// Prompt to user
		System.out.println("In the quotation:\n\t" + quote);
		System.out.println("You have " + numSpaces + " spaces.");
	}

}
