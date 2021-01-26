package chapter06Exercise;
/*
					 * 10. a. Write an application that prompts a user for the number of years the user
					has until retirement and the amount of money the user can save annually. If
					the user enters 0 or a negative number for either value, reprompt the user
					until valid entries are made. Assume that no interest is earned on the money.
					Display the amount of money the user will have at retirement. Save the file as
					RetirementGoal.java
 */

import java.util.Scanner;

public class RetirementGoal {
	public static void main(String[] args) {
		
		// Variables
		int numberOfYears;
		double annuallyMoney;
		double totalRetirement;
		
		// Initiate Scanner
		Scanner keyboard = new Scanner(System.in);		
		
		// Ask number of years the user has until retirement
		System.out.print("Please, insert the number of years until retirement >> ");
		numberOfYears = keyboard.nextInt();
		
		while(numberOfYears <= 0) {
			System.out.print("Please, insert the number of years until retirement >> ");
			numberOfYears = keyboard.nextInt();
		}
		
		// Ask amount of money annually
		System.out.print("Please, insert the amount of money save annually >> ");
		annuallyMoney = keyboard.nextDouble();
		while(annuallyMoney <= 0) {
			System.out.print("Please, insert the amount of money save annually >> ");
			annuallyMoney = keyboard.nextDouble();
		}
		totalRetirement = numberOfYears * annuallyMoney;
		
		// Display amount of money user will have at retirement
		System.out.printf("In %d years, saving $%.2f annually. When you retire you will have $%.2f.",
				numberOfYears, annuallyMoney, totalRetirement);
		
		// Close scanner
		keyboard.close();
	}

}
