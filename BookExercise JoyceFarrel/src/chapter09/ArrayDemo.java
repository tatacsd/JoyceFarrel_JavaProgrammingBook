package chapter09;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// Declare an array
		int[] myScores = new int [5];
		
		displayArray("Original array:          ", myScores);
		
		// Fill the array
		Arrays.fill(myScores, 8);
		
		displayArray("After filling with 8s:   ", myScores);
		myScores[2] = 6;
		myScores[4] = 3;

		displayArray("After changing 2 values: ", myScores);
		
		Arrays.sort(myScores);
		displayArray("After sorting:           ", myScores);		
	}
	
	// Methods
	public static void displayArray(String msg, int arr[]) {
		System.out.print(msg);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
