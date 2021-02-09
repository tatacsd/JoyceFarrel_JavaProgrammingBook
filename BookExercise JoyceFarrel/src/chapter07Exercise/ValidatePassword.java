package chapter07Exercise;

import java.util.Scanner;

/*
			 *  4.Write an application that prompts the user for a password that contains at least
			two uppercase letters, at least three lowercase letters, and at least one digit.
			Continuously reprompt the user until a valid password is entered. Display a
			message indicating whether the password is valid; if not, display the reason the
			password is not valid. Save the file as ValidatePassword.java.
 */

public class ValidatePassword {
	
	public static void main(String[] args) {
		// Variables
		String password;
		int numUpperLetter = 0;
		int numLowerLetter = 0;
		
		boolean isMoreTwoUpperCase = false;
		boolean isMoreThreeLowerCase = false;
		boolean isAtLeastOneDigit = false;
		
		char aChar;
		
		// prompts the user for a password that contains at least:
		// two upper case letters, 
		// at least three lower case letters, 
		// and at least one digit.
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a  password that contains at least:\n"
				+ "- Two uppercase letters\n- Three lowercase letters\n- one digit\n>>>>>>>>>>>>>  ");
		password = keyboard.nextLine();
		
		// Loop through password to verify it
		for(int i = 0; i < password.length(); i++) {
			aChar = password.charAt(i);
			
			// Count each char
			if(Character.isLowerCase(aChar)) {
				numLowerLetter++;
			}
			if (Character.isUpperCase(aChar)) {
				numUpperLetter++;
			}
		}
		
		// Check the requisites
		if(numLowerLetter >= 3)
			isMoreThreeLowerCase = true;
		if(numUpperLetter >= 2)
			isMoreTwoUpperCase = true;
		if(password.length() > 0)
			isAtLeastOneDigit = true;
		
		if(isMoreThreeLowerCase && isMoreTwoUpperCase && isAtLeastOneDigit) {
			System.out.println("The password is valid in:\nAt least one digit >> " + isAtLeastOneDigit +
					"\nAt least two upper case letters >> " + isMoreTwoUpperCase+
					"\nAt least three lower case letters >> " + isMoreThreeLowerCase);
		} else {
			System.out.println("The password is INVALID in:\nAt least one digit >> " + isAtLeastOneDigit +
					"\nAt least two upper case letters >> " + isMoreTwoUpperCase+
					"\nAt least three lower case letters >> " + isMoreThreeLowerCase);
		}
		
		

		// Close scanner
		keyboard.close();		
	}

}
