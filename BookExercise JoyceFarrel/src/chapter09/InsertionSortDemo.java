package chapter09;

import java.util.Scanner;

public class InsertionSortDemo {
	
	public static void main(String[] args) {
		// Declare
		int[] someNums = new int[5];
		
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
		i = 1;
		while( i < someNums.length) {
			temp =  someNums[i];
			j = i - 1;
			// ?????
			while(j >= 0 && someNums[j] > temp) {
				someNums[j+1] = someNums[j];
				--j;
			}
			someNums[j+1] = temp;
			display(someNums, i);
			++i;
		}
	}
	
	// Methods
	public static void display(int[] someNums, int num) {
		System.out.print("Iteration " + num + ": ");
		for(int i = 0; i < someNums.length; i++)
			System.out.print(someNums[i] + " ");
		System.out.println();
	}

}
