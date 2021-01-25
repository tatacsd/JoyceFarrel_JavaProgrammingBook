package chapter06Exercise;
/*
 * 
1. a. Write an application that counts by five from 5 through 500 inclusive, and
that starts a new line after every multiple of 50 (50, 100, 150, and so on). Save
the file as CountByFives.java
 */

public class CountByFive {
	public static void main(String[] args) {
		int count = 500;
		for (int i = 0; i <= count; i+= 5) {
			if ((i > 0) && (i % 50 == 0)) {
				System.out.println();
			}
			System.out.print(i + " ");
		}
		
	}

}
