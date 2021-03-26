package chapter09Exercise;

import java.util.Arrays;

/*
 * 1. a. Write an application containing an array of 15 String values (that are not
originally in alphabetical order), and display them in ascending order. Save
the file as StringSort.java.
 */

public class StringSort {
	
	public static void main(String[] args) {
		// Declare an array 15
		String[] arr = {"Laryssa", "Thays", "Pedro", "Joao", "Paulo", "José", "Lucas", "Marcelo"};
		
		// Sort the array ascending order
		Arrays.sort(arr);
		
		// Loop through the array OUTTER (row)
		for(int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
