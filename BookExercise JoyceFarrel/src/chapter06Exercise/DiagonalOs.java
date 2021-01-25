package chapter06Exercise;
public class DiagonalOs {
	public static void main(String[] args) {
		int row = 10;
		for(int i = 0; i < row; i++) {
			// Spaces
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");				
			}				
			// Os
			System.out.println("0");
		}
	}
}