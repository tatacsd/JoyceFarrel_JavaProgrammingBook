package chapter07;

import javax.swing.JOptionPane;

public class RepairName {
	
	public static void main(String[] args) {
		// Variables
		String name;
		String saveOriginalName;
		
		int stringLength;
		
		char c;
		
		
		name = JOptionPane.showInputDialog(null, "Please enter your first and last name");
		saveOriginalName = name;
		
		stringLength = name.length();
		// Set a upper case in first letter
		for(int i = 0; i < stringLength; ++i) {
			c = name.charAt(i);
			if(i == 0) {
				c = Character.toUpperCase(c);
				// Add the first upper case and concatenated with the rest of the strings
				name = c + name.substring(1, stringLength);
			} else {
				// check for the space add one to get the last name
				if(name.charAt(i) == ' ') {
					i++; // next char
					c = name.charAt(i);
					c = Character.toUpperCase(c);
					
					// Add the first name(0, i) i not included + c and the rest of the strings
					name = name.substring(0, i) + c + name.substring(i + 1, stringLength);
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "Original name was " + saveOriginalName +
				"\nRepaired name is " + name);
	}

}
