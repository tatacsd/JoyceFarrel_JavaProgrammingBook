package chapter03Exercise;

import java.util.Scanner;

public class NumbersDemo2 {
	public static void main(String[] args) {
		
		// Initiate Scanner		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input an integer >> ");
		int var1 = keyboard.nextInt();
		System.out.print("Please input another integer >> ");
		int var2 = keyboard.nextInt();
		
		// Close Scanner
		keyboard.close();
		
		System.out.println();
		displayTwiceTheNumber(var1, var2);
		displayNumberPlusFive(var1, var2);
		displayNumberSquared(var1,var2);	
	}
	
	// Methods
	public static void displayTwiceTheNumber(int number1, int number2) {
		int num1 = number1 * 2;
		int num2 = number2 * 2;
		System.out.printf("Twice: %d and %d\n", num1, num2);
	}
	
	public static void displayNumberPlusFive(int number1, int number2) {
		int num1 = number1 + 5;
		int num2 = number2 + 5;
		System.out.printf("Plus 5: %d and %d\n", num1, num2);
	}
	
	public static void displayNumberSquared(int number1, int number2) {
		double num1 = Math.pow(number1, 2);
		double num2 = Math.pow(number2, 2);
		System.out.printf("Squared %.0f and %.0f\n", num1, num2);
	}

}
