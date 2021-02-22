package chapter09;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MenuSearch {

	public static void main(String[] args) {
		// Declaring
		String[] menuChoices = new String[10];
		String entry = "";
		String menuString = "";
		int x = 0;
		int numEntered;
		
		// Fill the array
		Arrays.fill(menuChoices, "zzzzzzzzz");
		
		// Prompt the user
		menuChoices[x] = JOptionPane.showInputDialog(null, 
				"Enter an item for today's menu, or zzz to quit");
		
		// Loop to add items in all array
		while(!menuChoices[x].equals("zzz") && x < menuChoices.length-1) {
			// Add the new dish to the menu
			menuString =  menuString + menuChoices[x] + "\n";
			
			
			++x;
			
			// Check if x still in range
			if(x < menuChoices.length - 1) {
				menuChoices[x] = JOptionPane.showInputDialog(null, 
						"Enter an item for today's menu, or zzz to quit");				
			}
			
		}
		
		numEntered = x;
		
		entry = JOptionPane.showInputDialog(null, "Today's menu is:\n" + 
		menuString + "Please make a selection:");
		
		// Sort the array to apply the binary search ONLY THE ENTERED ONES
		Arrays.sort(menuChoices, 0, numEntered);
		
		x = Arrays.binarySearch(menuChoices, entry);
		
		// if the value returns nonnegative value and less the entered display
		if(x >= 0 && x < numEntered)
			JOptionPane.showMessageDialog(null, "Excellent Choice");
		else
			JOptionPane.showMessageDialog(null, "Sorry - that item is not in tonight's menu");
			
		
	}
}
