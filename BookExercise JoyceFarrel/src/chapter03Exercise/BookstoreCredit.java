package chapter03Exercise;

import java.util.Scanner;

/*
	 * To encourage good grades, Hermosa High School has decided to award each
	student a bookstore credit that is 10 times the student’s grade point average. In
	other words, a student with a 3.2 grade point average receives a $32 credit. Create
	a class that prompts a student for a name and grade point average, and then
	passes the values to a method that displays a descriptive message. The message
	uses the student’s name, echoes the grade point average, and computes and
	displays the credit. Save the application as BookstoreCredit.java.
 */
public class BookstoreCredit {
	public static void main(String[] args) {
				
		// Initiate the scanner
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the student name >> ");
		String studentName = keyboard.nextLine();
		System.out.print("Please enter the student average grade >> ");
		double studentGrade = keyboard.nextDouble();

		// Close scanner
		keyboard.close();
		
		// Call the method
		computeCredits(studentName, studentGrade);
	}
	
	// Methods
	public static void computeCredits(String name, double grade) {
		double studentCredits = grade * 10;
		System.out.printf("Congratulations, %s!\n", name);
		System.out.printf("You have grade points avarege of %.1f and because of that, you received $%.2f credits\naward in the bookstore of Hermosa High School.", grade, studentCredits);
	}
}
