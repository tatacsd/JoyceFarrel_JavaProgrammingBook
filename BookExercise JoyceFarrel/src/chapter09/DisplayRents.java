package chapter09;

public class DisplayRents {
	
	public static void main(String[] args) {
		// Array 2D
				int[][] rents = { {400, 450, 510},
								{500, 560, 630},
								{625, 676, 740},
								{1000, 1250, 1600} };
				
		// Display 2D array		
		// Loop through an 2d array
				
		// rows
		for(int i = 0; i < rents.length; i++) {
			// Columns
			for(int j = 0;  j < rents[i].length; j++) {
				System.out.println("Floor >> " + i + " Bedrooms >> " + j +
						"\tRent is $" + rents[i][j]);
			}
		}
		
	}

}
