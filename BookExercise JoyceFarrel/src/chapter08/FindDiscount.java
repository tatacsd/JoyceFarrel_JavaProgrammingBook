package chapter08;

import javax.swing.*;
public class FindDiscount {

	public static void main(String[] args) {
		// Declaring variables and constants
		final int NUM_RANGES = 5;
		double customerDiscount;
		String strNumOrdered;
		int numOrdered;
		int sub = NUM_RANGES - 1;
		
		// Declaring arrays
		double[] discountRangeLimits = { 1, 13, 50, 100, 200};
		double[] discountRates = {0.00, 0.10, 0.14, 0.18, 0.20};
		
		// Ask input
		strNumOrdered = JOptionPane.showInputDialog(null,
				"How many itens are ordered? ");
		numOrdered = Integer.parseInt(strNumOrdered);
		
		// Loop to find the discount
		while(sub>=0 && numOrdered < discountRangeLimits[sub]) {
			--sub;
		}
		customerDiscount = discountRates[sub];
		JOptionPane.showMessageDialog(null,
				"Discount rate for " + numOrdered + " items is " + customerDiscount);
	}
}
