package chapter09Exercise;

import java.util.Arrays;

/*
 * 1. a. Write an application containing an array of 15 String values (that are not
originally in alphabetical order), and display them in ascending order. Save
the file as StringSort.java.
 */

public class StringSort2 {
	
	public static void main(String[] args) {
		// Declare an array 15
		int[] arr = {5, 200, 30, 66, 78, 96, 15, 3, 45, 667, 01};
		int temp;
		
		// Sort it ascending order		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		// Display it
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
