package chapter06Exercise;
/*
			3. Write an application that displays the factorial for every integer value from 1
			to 10. A factorial of a number is the product of that number multiplied by each
			positive integer lower than it. For example, 4 factorial is 4 * 3 * 2 * 1, or 24. Save
			the file as Factorials.java
 */

public class Factorials {
	public static void main(String[] args) {
		// 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
		int fact = 1; // set the factor initial value
		for(int i = 1; i <= 10; i++) {
			for(int j = i; j >= 1; j--) {
				fact *= j; // multiple each time by the number
				if(j == 1 || i == 1) {
					System.out.printf("%d ", j);					
				} else {
					System.out.printf("%d * ", j); // print each number followed by an asterisk
				}
			}
			System.out.printf("= %d",fact);
			System.out.println();
			// Set the factor back to 1
			fact = 1;
		}		
	}
}
