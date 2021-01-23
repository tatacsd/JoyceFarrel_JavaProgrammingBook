package chapter03Exercise;

import java.util.Scanner;

public class Percentage2 {
	public static void main(String[] args) {
		
		// Initiate scan
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a double value >> ");
		double var1 = keyboard.nextDouble();	
		keyboard.nextLine();
		System.out.print("Please enter another double value >> ");
		double var2 = keyboard.nextDouble();	
		
		// Close scanner
		keyboard.close();
		
		computePercent(var1, var2);
		computePercent(var2, var1);
		
	}
	
	public static void computePercent(double num1, double num2) {
		
		double percentage = (num1 * 100) / num2;
		System.out.printf("%.2f is %.0f percent of %.2f.\n\n", num1, percentage, num2);
	}

}
