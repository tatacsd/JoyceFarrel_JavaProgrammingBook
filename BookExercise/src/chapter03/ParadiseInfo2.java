package chapter03;

import java.util.Scanner;

public class ParadiseInfo2 {
	public static void main(String[] args) {
		// Declarations
		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		System.out.print("Enter discount rate as a whole number >> ");
		discount = keyboard.nextDouble();
		
		savings = computeDiscountInfo(price, discount);
		
		keyboard.close();
		
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + " percent");
		System.out.println("That is a saving of at least $" + savings);
	}
	
	// Methods
	
	public static double computeDiscountInfo(double price, double discount) {
		return price * discount / 100;
	}
}
