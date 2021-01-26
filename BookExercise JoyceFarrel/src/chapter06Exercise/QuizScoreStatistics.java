package chapter06Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
				 * 8. Write an application that allows a user to enter any
				number of student quiz scores until the user enters
				99. If the score entered is less than 0 or more than 10,
				display an appropriate message and do not use the
				score. After all the scores have been entered, display
				the number of scores entered, the highest score, the
				lowest score, and the arithmetic average. Save the file
				as QuizScoreStatistics.java
 */

public class QuizScoreStatistics {
	public static void main(String[] args) {
		
		// Variables
		int userInput;
		int highestScore;
		int lowerScore;
		double averageScore;
		
		// Create a list to add all the scores (You don't know how many)
		List<Integer> studentScores = new ArrayList<Integer>();
		
		// user to enter any number of student quiz scores until the user enters 99.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the student score or type 99 to quit >> ");
		userInput = keyboard.nextInt();
		
		// Until the user enters 99.
		while(userInput != 99) { // Sentinel
			// If the score entered is less than 0 or more than 10,
			// display an appropriate message and do not use the score
			if(userInput < 0 || userInput > 10) {
				System.out.print("This score is not valid,\nPlease add a new one or type 99 to quit >> ");
				userInput = keyboard.nextInt();
			} else {
			// Add to the counter to know the size of the list
			// Save the valid score using list 
			studentScores.add(userInput);

			// Do all over again
			System.out.print("Please enter the student score or type 99 to quit >> ");
			userInput = keyboard.nextInt();
			}
		}
		
		// Calculate the highest, lowest and average
		// Highest	
		highestScore = Collections.max(studentScores);
		
		// Lowest
		lowerScore = Collections.min(studentScores);
		
		// Average
		double total = 0.0;
		for(int i = 0; i < (studentScores.size()); i++) {
			total = total + studentScores.get(i);
		}
		averageScore = total / studentScores.size();
		
		// Display the number of scores
		System.out.printf("The number of scores entered is: %d\nThe highest score is >> %d\nThe lowest score is >> %d\nThe average score is >> %.2f",
				studentScores.size(), highestScore, lowerScore, averageScore);
		
		// Close Scanner
		keyboard.close();
	}

}
