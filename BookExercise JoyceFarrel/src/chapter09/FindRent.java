package chapter09;

import javax.swing.JOptionPane;

public class FindRent {
	
	public static void main(String[] args) {
		// Array 2D
		int[][] rents = { {400, 450, 510},
						{500, 560, 630},
						{625, 676, 740},
						{1000, 1250, 1600} };
		
		String entery;
		int floor;
		int bedrooms;
		
		// Prompt the user
		entery = JOptionPane.showInputDialog(null, "Enter a floor number (0, 1, 2, 3): ");
		floor = Integer.parseInt(entery);
		
		entery = JOptionPane.showInputDialog(null, "Enter number of bedrooms");
		bedrooms = Integer.parseInt(entery);
		
		// Display the result
		JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + 
				" bedrooms apartment on floor " + floor + 
				" is $" + rents[floor][bedrooms]);
		
		
	}

}
