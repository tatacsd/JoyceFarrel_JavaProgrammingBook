package chapter08Exercise;

/*
			 * 1. Write an application that stores nine integers in an array. Display the integers
			from first to last, and then display the integers from last to first. Save the file as
			NineInts.java.
			 */

public class NineInts2 {
	public static void main(String[] args) {
		
		int[] nineInt = {48, 98, 17, 6, 95, 236, 177, 4, 12, 66};
		
		ascendingSort(nineInt);
		displayArray(nineInt);
		System.out.println("===============================");
		DescendingSort(nineInt);
		displayArray(nineInt);
		
		
	}
	
	// Methods
	// First to last
	public static void displayArray(int[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	

	// Swap
	public static void ascendingSort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void DescendingSort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
