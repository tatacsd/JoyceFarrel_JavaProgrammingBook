package chapter08;

public class SearchingAnArray {
	public static void main(String[] args) {
		
		// Declare and Initialize an array with valid values 
		int[] validValues = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
		
		boolean isValidItem = false;
		int itemOrdered = 99;
		
		// Loop through array
		for(int i = 0; i < validValues.length; i++) {
			//  Finding the item number that matches
			if(itemOrdered == validValues[i]) {
				isValidItem = true;
			}
		}
		System.out.println("Is the item valid? >> " + isValidItem);
		
				
		
	}
}
