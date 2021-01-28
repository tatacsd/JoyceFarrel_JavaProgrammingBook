package chapter08;

import java.util.Scanner;

public class AverageOfQuizzes {
	public static void main(String[] args) {
		// Declarations
		final int QUIT = 999;
		final int MAX = 10;
		
		int[] scores = new int[10];
		int score = 0;
		int count = 0;
		int total = 0;
		
		// Initialize scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter quiz score or " +
				QUIT + " to quit  >> ");
		score = keyboard.nextInt();
		
		// Looping
		while(score != QUIT) { // loop continues until user type QUIT value(999)
			scores[count] = score;
			total += score;
			count++;
			
			// Condition to stop
			if(count == MAX) {
				score = QUIT;
			} else {
				System.out.print("Enter next quiz score or " +
						QUIT + " to quit >> ");
				score = keyboard.nextInt();
			}
			
		}
		
		// Display the scores 
		System.out.print("\nThe scores entered were >> ");
		for(int i = 0; i < count; i++) {
			if(i != count - 1) {
				System.out.print(scores[i] + ", ");
			} else {
				System.out.print("and " + scores[i]);
			}
			
			
		}
		if(count != 0) {
			System.out.println("\nThe average is " + (total * 1.0 / count)); // times double to get the double result
		} else {
			System.out.println("No scores were entered");
		}
		
		
		
		
	}

}
