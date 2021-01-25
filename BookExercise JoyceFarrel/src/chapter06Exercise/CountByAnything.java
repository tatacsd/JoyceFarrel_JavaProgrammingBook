package chapter06Exercise;
/*
 * 
b. Modify the CountByFives application so that the user enters the value to
count by. Start each new line after 10 values have been displayed. Save the
file as CountByAnything.java
 */

import java.util.Scanner;

public class CountByAnything {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the value to count by >> ");
		int countBy = keyboard.nextInt();
		
		int counter = -1;			
		for(int i = 0; i < 500; i += countBy) {
			++counter;
			if((counter > 0) && (counter % 10 == 0)) {
				System.out.println();
			}
			System.out.printf("%d ", i);
		}
		
		// Close Scanner
		keyboard.close();
}
}
