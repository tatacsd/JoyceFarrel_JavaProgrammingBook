package chapter06Exercise;
/*
 * 6. Write an application that uses a loop to create the
pattern of Os shown in Figure 6-32, in which each O
is displayed one additional space to the right. Save
the file as DiagonalOs.java
 */

public class DiagonalOs {
	
	public static void main(String[] args) {
		int row = 10;
		for(int i = 0; i < row; i++) {
			// Spaces
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");				
			}				
			// O's
			System.out.println("0");
		}
	}
}