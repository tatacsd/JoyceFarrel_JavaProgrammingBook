package chapter04Exercises;
/*
				 * 1. Create a class named FormLetterWriter that includes two overloaded methods
				named displaySalutation(). The first method takes one String parameter that
				represents a customer’s last name, and it displays the salutation Dear Mr. or Ms.
				followed by the last name. The second method accepts two String parameters
				that represent a first and last name, and it displays the greeting Dear followed by
				the first name, a space, and the last name. After each salutation, display the rest of
				a short business letter: Thank you for your recent order. Write a main() method
				that tests each overloaded method. Save the file as FormLetterWriter.java.
 */

public class FormLetterWriter {
	
	// Two overloaded methods named displaySalutation().
	// Takes one String parameter that	represents a customer’s last name
	public static void displaySalutation(String lastName) {
		System.out.printf("Dear Mr. or Ms. %s,\n", lastName);	
	}
	
	// Two String parameters that represent a first and last name
	public static void displaySalutation(String firstName, String lastName) {
		System.out.printf("Dear %s %s,\n", firstName, lastName);
	}
	
	// Business letter
	public static void displayBusinessLetter() {
		System.out.println("Thank you for your recent order.");
	}
	
	public static void main(String[] args) {
		
		// Tests each overloaded method
		displaySalutation("Casado");
		displayBusinessLetter();
		
		System.out.println();
		
		displaySalutation("Thays", "Casado");
		displayBusinessLetter();
		
	}

}
