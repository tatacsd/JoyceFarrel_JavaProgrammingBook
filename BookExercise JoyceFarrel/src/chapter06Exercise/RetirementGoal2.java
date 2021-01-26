package chapter06Exercise;
/*
					 * 10 b. Modify the RetirementGoal application to display the amount of money the
					user will have if the user earns 4% interest on the balance every year. Save the
					file as RetirementGoal2.java
 */

import java.util.Scanner;

public class RetirementGoal2 {
	public static void main(String[] args) {

		// Variables
		final double INTERESTS = 0.4; 
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
		totalRetirement = numberOfYears * (annuallyMoney * (INTERESTS + 1));
		
		// Display amount of money user will have at retirement
		System.out.printf("In %d years, saving $%.2f annually. When you retire you will have $%.2f.",
				numberOfYears, annuallyMoney, totalRetirement);
		
		// Close scanner
		keyboard.close();
	}

}
