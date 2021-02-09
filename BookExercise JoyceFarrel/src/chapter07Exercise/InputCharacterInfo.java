package chapter07Exercise;
/*
 * Modify the CharacterInfo class shown in Figure 7-3 so that the tested character
is retrieved from user input. Save the file as InputCharacterInfo.java
 */

import java.util.Scanner;

public class InputCharacterInfo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Enter a character >> ");
		char aChar = keyboard.nextLine().charAt(0);
		
		
		System.out.println("The character is " + aChar);
		
		if(Character.isUpperCase(aChar))
			System.out.println(aChar + " is uppercase");
		else 
			System.out.println(aChar + " is not uppercase");
		
		if(Character.isLowerCase(aChar))
			System.out.println(aChar + " is lowerrcase");
		else
			System.out.println(aChar + " is not lowerrcase");
		
		aChar = Character.toLowerCase(aChar);
		System.out.println("After toLowerCase(), aChar is " + aChar);
		
		aChar = Character.toUpperCase(aChar);
		System.out.println("After toUpperCase(), aChar is " + aChar);
		
		keyboard.close();
	}
}
