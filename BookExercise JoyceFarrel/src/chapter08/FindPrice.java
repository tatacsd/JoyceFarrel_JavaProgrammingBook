package chapter08;

import javax.swing.*;

public class FindPrice {
	public static void main(String[] args) {
		// Declaring variables and Constants
		final int NUMBER_OF_ITEMS = 10;
		String strItem;
		int itemOrdered;
		double itemPrice = 0;
		boolean isValidItem = false;
				
		// Declaring and initializing arrays 
		int[] validValues = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
		double[] prices = {0.29, 1.23, 3.50, 0.69, 6.79, 3.19, 0.99, 0.89, 1.26, 8.00};
		
		// Ask input
		strItem = JOptionPane.showInputDialog(null, "Enter the item number you want to order:");
		itemOrdered = Integer.parseInt(strItem);
		
		// Find the item in the array
		for(int i = 0; i < NUMBER_OF_ITEMS && !isValidItem; ++i) { // isValidItem to break the loop when it becomes true
			if(itemOrdered == validValues[i]) {
				isValidItem = true;
				itemPrice = prices[i];
			}
		}
		
		// Display the research result
		if(isValidItem) {
			JOptionPane.showMessageDialog(null, "The price for item " + itemOrdered + " is $" + itemPrice);
		} else {
			JOptionPane.showConfirmDialog(null, "Sorry, invalid item entered");
		}
		
		
	
	}
	
}
