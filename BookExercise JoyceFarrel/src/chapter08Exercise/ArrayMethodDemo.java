package chapter08Exercise;
/*
					 * 4. Create an application containing an array that stores eight integers. The
					application should call five methods that in turn (1) display all the integers,
					(2) display all the integers in reverse order, (3) display the sum of the integers,
					(4) display all values less than a limiting argument, and (5) display all
					values that are higher than the calculated average value. Save the file as
					ArrayMethodDemo.java
 */

public class ArrayMethodDemo {
	public static void main(String[] args) {
		// Declaring array
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8};
		displayIntegers(numArr);
		displayReverseOrder(numArr);
		displaySum(numArr);
		displayHigherThanAverage(numArr);
		
		
	}
	
	
	// Methods
	// Display all the integers
	public static void displayIntegers(int[] arr) {
		System.out.print("Display all Integers: [");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.printf(" %d ]\n", arr[i]);
			} else {
				System.out.printf(" %d, ", arr[i]);
			}
		}
	}
	
	// Display all the integers in reverse order
	public static void displayReverseOrder(int[] arr) {
		System.out.print("Display all the integers in reverse order: [");
		for(int i = 7; i >= 0; i--) {
			if(i == 0) {
				System.out.printf(" %d ]\n", arr[i]);
			} else {
				System.out.printf(" %d, ", arr[i]);
			}
		}
	}
	
	// Display the sum of the integers
	public static void displaySum(int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.printf("Display the sum of the integers: [ %d ]\n", total);
	}
	
	// Display all values less than a limiting argument
	// ????????????????????????????????
	
	// Display all values that are higher than the calculated average value
	public static void displayHigherThanAverage(int[] arr) {
		double total = 0;
		double average;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		average = total / arr.length;
		
		System.out.printf("Display all values that are higher than the calculated average value: [");
		
		// Check numbers higher than average
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > average) {
				if(i == arr.length-1) {
					System.out.printf("%d ]", arr[i]);				
				}
				else {
					System.out.printf(" %d,", arr[i]);										
				}
			}
		}
	}
	

}
