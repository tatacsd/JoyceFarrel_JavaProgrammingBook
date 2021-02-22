package chapter09;

import java.util.Scanner;

public class BubbleSortDemo {
	
	public static void main(String[] args) {
		// Declare
		int[] someNums = new int[5];
		int comparisonToMake = someNums.length - 1;
		
		int i, j, temp;
		
		// Initialize the scanner
		Scanner keyboard = new Scanner(System.in);
		for( i = 0; i < someNums.length; i++) {
			System.out.print("Enter number " + (i+1) + " >> ");
			someNums[i] = keyboard.nextInt();
		}
		
		// Call a method
		display(someNums, 0);
		
		// Loop for sorting
		for(i = 0; i < someNums.length - 1; i++) {
			for(j = 0; j < comparisonToMake; j++) {
				// Comparing
				if(someNums[j] > someNums[j+1]) {
					temp = someNums[j];
					someNums[j] = someNums[j + 1];
					someNums[j+1] = temp;
				}
			}
			display(someNums, (i+1));
			// Decrement to loop less inner
			--comparisonToMake;
		}
		
		
		// Close scanner
		keyboard.close();
	}
	
	// Methods
	public static void display(int[] someNums, int num) {
		System.out.print("Iteration " + num + ": ");
		for(int i = 0; i < someNums.length; i++)
			System.out.print(someNums[i] + " ");
		System.out.println();
	}

}
