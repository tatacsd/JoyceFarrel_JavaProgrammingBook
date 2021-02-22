package chapter09;

import java.util.Scanner;

public class TwoDimensionalArrayDemo {
	
	public static void main(String[] args) {
		// Array 2d
		int[][] count = new int [3][3];
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		int row;
		int column;
		final int QUIT = 99;
		
		// Prompt the user
		System.out.print("Enter a row or " + QUIT + " to quit > ");
		row = keyboard.nextInt();
		
		while(row != QUIT) {
			System.out.print("Enter a column > ");
			column = keyboard.nextInt();
			// Check if input values match with the range
			if(row < count.length && column < count[row].length) {
				// Add one to the position
				count[row][column]++;
				
				// Display each row and column
				for(int i = 0; i < count.length; i++) {
					for(int j = 0; j < count[i].length; j++) {
						System.out.print(count[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Invalid position selected");
			}
			
			// Prompt the user for next row
			System.out.print("Enter a row or " + QUIT + " to quit > ");
			row = keyboard.nextInt();
		}
		
		
		
		
		
		
		
		
		// Close scanner
		keyboard.close();
	}
}
