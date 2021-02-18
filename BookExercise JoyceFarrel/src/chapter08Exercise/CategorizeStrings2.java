package chapter08Exercise;

import java.util.Scanner;




// I DIDNT FINISH!!!!!!!








/*
			 * 5. b. Modify the CategorizeStrings application to divide the entered Strings
					into those that contain no spaces, one space, or more. After data entry is
					complete, continuously prompt the user to enter the type of String to
					display. If the user does not enter one of the three valid choices, display all of
					the Strings. Save the file as CategorizeStrings2.java.
 */

public class CategorizeStrings2 {
	public static void main(String[] args) {
		// Declaring variable
		final String QUIT = "QUIT";
		int inputCounter = 0;
		int noSpaceCounter = 0;
		int oneSpaceCounter = 0;
		int moreThanOneSpaceCounter = 0;
		int charCount = 0;
		
		
		// Declaring ArrayList
		String[] noSpaceArr = new String[20];
		String[] oneSpaceArr = new String[20];
		String[] moreThanOneSpaceArr = new String[20];
	
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a string or type QUIT to exit >> ");
		String inputUser = keyboard.nextLine();
		
		while(!inputUser.equalsIgnoreCase(QUIT)) {			
			if(inputCounter < 19) {
				// Count spaces
				for(int i = 0; i < inputUser.length(); i++) {
					if(Character.isWhitespace(inputUser.charAt(i))) 
						charCount++;
//					if(inputUser.charAt(i) == ' ') {
//						charCount++;			
//					}
				}
				
				switch (charCount) {
				case 0:
					noSpaceArr[noSpaceCounter] = inputUser;
					noSpaceCounter++;					
					break;
				case 1:
					oneSpaceArr[oneSpaceCounter] = inputUser;
					oneSpaceCounter++;
				default:
					moreThanOneSpaceArr[moreThanOneSpaceCounter] = inputUser;
					moreThanOneSpaceCounter++;
					break;
				}
//				// If it has no space
//				if(charCount == 0) {
//					noSpaceArr[noSpaceCounter] = inputUser;
//					noSpaceCounter++;
//				// If it has one space
//				} else if(charCount == 1) {
//					oneSpaceArr[oneSpaceCounter] = inputUser;
//					oneSpaceCounter++;
//				// If it has more than one
//				} else if (charCount > 1){
//					moreThanOneSpaceArr[moreThanOneSpaceCounter] = inputUser;
//					moreThanOneSpaceCounter++;
//				}				
				inputCounter++;
				
				System.out.print("Enter another string or type QUIT to exit >> ");
				inputUser = keyboard.nextLine();
				
			} else {
				break;
			}			
		}
		System.out.println("\n--------------------------------------------------");
		
		// Ask the user to display the content
		System.out.print("Which list would you like to see? no space, one space or more than one space list of characteres? >> ");
		inputUser = keyboard.nextLine();
		
		displayList(inputUser, noSpaceCounter, noSpaceArr, "no space");
		displayList(inputUser, oneSpaceCounter, oneSpaceArr, "one space");
		displayList(inputUser, moreThanOneSpaceCounter, moreThanOneSpaceArr, "more than one");
		
		// Close scanner
		keyboard.close();
	}
	
	// Methods
	public static void displayList(String input, int space, String[] arr, String userAsk) {
		if(input.equalsIgnoreCase(userAsk)){
			if(space == 0) {
				System.out.println("This list is empty");
			} else {
				for(int i = 0; i < space; i++) {
					System.out.println(i+1 + ": " + arr[i].toString());
				}				
			}					
		}
	}	

}
