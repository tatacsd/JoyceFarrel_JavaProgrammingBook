package chapter06Exercise;

import java.util.Scanner;

/*
 * 
2. Write an application that asks a user to type an even number or the sentinel
value 999 to stop. When the user types an even number, display the message
“Good job!” and then ask for another input. When the user types an odd number,
display an error message and then ask for another input. When the user types the
sentinel value 999, end the program. Save the file as EventEntryLoop
 */

public class EvenEntryLoop {
	public static void main(String[] args) {		
		// Initialize a scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please type an even number or type 999 to quit >> ");
		int userInput = keyboard.nextInt();
		
		while(userInput != 999) { // sentinel value
			
			// Check for even
			if(userInput % 2 == 0) {
				System.out.print("Good job!\nType another even number or 999 to quit >> ");	
				userInput = keyboard.nextInt();
			} else {
				System.out.println("This number is not an even number");
				System.out.print("Type another even number or 999 to quit >> ");
				userInput = keyboard.nextInt();
			}			
		}
		System.out.print("End of the program");

		// Close scanner
		keyboard.close();
	}

}
