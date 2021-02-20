package chapter08Exercise;

import java.util.Scanner;


/*
		 * 2. Allow a user to enter any number of double values up to 15. The user should
		enter 99999 to quit entering numbers. Display an error message if the user quits
		without entering any numbers; otherwise, display each entered value and its
		distance from the average. Save the file as DistanceFromAverage.java
 */
public class DistanceFromAverage {
	
	public static void main(String[] args) {
		// Declaring variables
		double total = 0.0;
		double userInput;
		final int QUIT = 99999;
		int counter = -1;
		int maxNum = 15;
		double average;
		double[] valuesArr = new double[15];
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a value or " + QUIT + " to quit >> ");
		userInput = Double.parseDouble(keyboard.nextLine());
		
		while(userInput != QUIT && counter < maxNum -1) {
			++counter;	
			total += userInput;
			valuesArr[counter]= userInput;
			
			if(counter < maxNum -1) {
				System.out.print("Enter a value or " + QUIT + " to quit >> ");
				userInput = Double.parseDouble(keyboard.nextLine());
			}
			
		}
		average = total/(counter + 1);		
		
		// Handle the error
		if(userInput == QUIT && total == 0) {
			System.out.print("Error, You quited without entering any number");			
		} else {
			System.out.printf("\n\nThe total inputed was %.2f and the average value is %.2f\nThe values inputed values were: \n", total, average);
			for(int i = 0; i <= counter; ++i) {
				System.out.printf("%.2f: the distance from avarege is %.2f\n", valuesArr[i], 
						Math.abs(average-valuesArr[i]));
			}
			System.out.println();
		}		
		// Close scanner
		keyboard.close();
		}
		
	}
