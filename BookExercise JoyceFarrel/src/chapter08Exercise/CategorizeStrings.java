package chapter08Exercise;

import java.util.Scanner;

/*
			 * 5. a. Write an application that accepts up to 20 Strings, or fewer if the user enters
			a terminating value. Store each String in one of two lists—one list for short
			Strings that are 10 characters or fewer and another list for long Strings
			that are 11 characters or more. After data entry is complete, prompt the user
			to enter which type of String to display, and then output the correct list.
			For this exercise, you can assume that if the user does not request the list of
			short strings, the user wants the list of long strings. If a requested list has no
			Strings, output an appropriate message. Prompt the user continuously until
			a sentinel value is entered. Save the file as CategorizeStrings.java
 */

public class CategorizeStrings {
	public static void main(String[] args) {
		// Declaring variable
		final String QUIT = "QUIT";
		int inputCounter = 0;
		int shortCounter = 0;
		int longCounter = 0;
		
		
		// Declaring ArrayList
		String[] shortArr = new String[20];
		String[] longArr = new String[20];
	
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a string or type QUIT to exit >> ");
		String inputUser = keyboard.nextLine();
		
		while(!inputUser.equalsIgnoreCase(QUIT)) {			
			if(inputCounter < 19) {
				// If less then 10 or fewer add to short list
				if(inputUser.length() < 11) {
					shortArr[shortCounter] = inputUser;
					shortCounter++;
				} else {
					longArr[longCounter] = inputUser;
					longCounter++;
				}
				
				inputCounter++;
				
				System.out.print("Enter another string or type QUIT to exit >> ");
				inputUser = keyboard.nextLine();
				
			} else {
				break;
			}			
		}
		System.out.println("\n--------------------------------------------------");
		
		// Ask the user to display the content
		System.out.print("Which list would you like to see? Short or long characters? >> ");
		inputUser = keyboard.nextLine();
				
		if(inputUser.equalsIgnoreCase("short")){
			if(shortCounter == 0) {
				System.out.println("This list is empty");
			} else {
				for(int i = 0; i < shortCounter; i++) {
					System.out.println(i+1 + ": " + shortArr[i].toString());
				}				
			}			
		} else {
			if(longCounter == 0) {
				System.out.println("This list is empty");
			} else {
				for(int i = 0; i < longCounter; i++) {
					System.out.println(i + ": " + longArr[i]);
				}
			}
		}		
		
		// Close scanner
		keyboard.close();
	}
	
	

}
