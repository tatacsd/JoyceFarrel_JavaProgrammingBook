package chapter09;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class VerifyCode {

	public static void main(String[] args) {
		// Declaring
		char[] codes = {'B', 'E', 'K', 'M', 'P', 'T'}; // in order
		String entry;
		char userCode;
		int position;
		
		// Prompt user
		entry = JOptionPane.showInputDialog(null, "Enter a product code:");
		userCode = entry.charAt(0);
		
		// Search in the array the position
		position = Arrays.binarySearch(codes, userCode);
		if(position >= 0) {
			JOptionPane.showMessageDialog(null, "Position of " + userCode + " is " + position);
		} else {
			JOptionPane.showMessageDialog(null, userCode + " is an invalid code");
		}
		
	}
}
