package chapter08Exercise;

import java.util.Scanner;

/*
					 * 8. Write an application that allows a user to enter the names and birthdates of
					up to 10 friends. Continue to prompt the user for names and birthdates until
					the user enters the sentinel value ZZZ for a name or has entered 10 names,
					whichever comes first. When the user is finished entering names, produce a
					count of how many names were entered, and then display the names. 
					
					In a loop,
					continuously ask the user to type one of the names and display the corresponding
					birthdate or an error message if the name has not been previously entered. The
					loop continues until the user enters ZZZ for a name. Save the application as
					BirthdayReminder.java
 */

public class BirthdayReminder {
	public static void main(String[] args) {
		// Arrays
		String[] name = new String[10];
		String[] birthday = new String[10];
		
		// Variables
		int count = 0;
		String bday;
		String friendName;
		int totalNames = 0;
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a friend name or type ZZZ to quit >>  ");
		friendName = keyboard.nextLine();
		
		
		while(!friendName.equalsIgnoreCase("ZZZ") && count < 10) {
			
			System.out.printf("Enter %s brithday  >>  ", friendName);
			bday = keyboard.nextLine();
			name[count] = friendName;
			birthday[count] = bday;
			count++;
			totalNames++;
			
			if(count < 10) {
			System.out.print("Please enter a friend name or type ZZZ to quit  >>  ");
			friendName = keyboard.nextLine();
			} else {
				break;
			}
	}
		
		// Display info
		if(count != 0) {
			System.out.println("\tFriends' Birthday List");
			System.out.println("-------------------------------------------");
			for(int i = 0; i <= count - 1; i++) {
				System.out.println(i+1 +"# Friend name: " + name[i].toString() + " & Bday: " + birthday[i].toString());
			}
		} else {
			System.out.println("Ended");
		}
		System.out.println("The total number of friend in list is: " + totalNames);
		// Close scanner
		keyboard.close();	
	}
}
