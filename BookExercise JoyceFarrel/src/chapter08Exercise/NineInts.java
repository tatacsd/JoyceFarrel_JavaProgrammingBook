package chapter08Exercise;

/*
			 * 1. Write an application that stores nine integers in an array. Display the integers
			from first to last, and then display the integers from last to first. Save the file as
			NineInts.java.
			 */

public class NineInts {
	public static void main(String[] args) {
		
		int[] nineInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		displayFirstToLast(nineInt);
		System.out.println("=====================");
		displayLastToFirst(nineInt);
		
	}
	
	// Methods
	// First to last
	public static void displayFirstToLast(int[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	
	
	// Last to first
	public static void displayLastToFirst(int[] arr) {
		for(int i = arr.length - 1; i >= 0; --i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
